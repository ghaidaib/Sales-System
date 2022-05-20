package Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Products")
public class Products {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Name", length = 75, nullable = false)
    private String name;
    @Column(name = "Description", length = 150, nullable = false)
    private String description;
    @Column(name = "Category", length = 75, nullable = false)
    private String category;
    @Column(name = "Creation_date")
    private Date creation_date;

    @OneToMany(mappedBy="products")
    private Set<Category> category=new HashSet<>();

    @OneToMany(mappedBy="products")
    private Set<Sales> sales=new HashSet<>();
}