package Controller;
@RestController
public class ClientsController {
    @Autowired
    private ClientsRepository _ClientsRepository;

    @RequestMapping(value = "/cliens", method = RequestMethod.GET)
    public List<Clients> Get() {

        return _ClientsRepository.findAll();
    }
}
