package Repository;

public class SalesRepository {
    @Repository
    public interface SalesRepository extends JpaRepository<Sales, Long>{

        Sales save(Sales sales);
    }
}
