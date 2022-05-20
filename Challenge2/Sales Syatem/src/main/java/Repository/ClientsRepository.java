package Repository;

public class ClientsRepository {
    @Repository
    public interface ClientsRepository extends JpaRepository<Clients, Long>{
        Clients save(Clients client);

    }
}
