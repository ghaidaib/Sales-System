package Controller;

public class SalesController {
    @Autowired
    private SalesRepository _salesRepository;

    @RequestMapping(value = "/sales", method = RequestMethod.GET)
    public List<Sales> Get() {
        return  _salesRepository.findAll();
}
