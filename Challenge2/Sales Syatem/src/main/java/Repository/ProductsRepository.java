package Repository;

public class ProductsRepository {
    @Repository
    public interface ProductsRepository extends JpaRepository<Products, Long>{

        Products save(Products product);
}
