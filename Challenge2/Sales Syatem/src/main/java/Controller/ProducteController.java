package Controller;
@RestController
public class ProducteController {
    @Autowired
    private ProductsRepository _productsRepository;

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public List<Products> Get() {
        return _productsRepository.findAll();
    }

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
    public ResponseEntity<Products> GetById(@PathVariable(value = "productId") Long productId)
    {
        Optional<Products> product = _productsRepository.findById(productId);
        if(product.isPresent())
            return new ResponseEntity<Product>(product.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/product", method =  RequestMethod.POST)
    public Product Post(@Validated @RequestBody Product product)
    {
        return _productRepository.save(product);
    }

    @RequestMapping(value = "/product/{productId}", method =  RequestMethod.PUT)
    public ResponseEntity<Products> Put(@PathVariable(value = "productId") long productId, @Validated @RequestBody Product newProduct)
    {
        Optional<Product> oldProduct = _productRepository.findById(productId);
        if(oldProduct.isPresent()){
            Products product = oldProduct.get();

            product.setName(newProduct.getName());
            product.setCategory(newProduct.getCategory());
            product.setDescription(newProduct.getDescription());
            product.setcreation_date(newProduct.getcreation_date());

            _productRepository.save(product);

            return new ResponseEntity<Products>(product, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }



}
