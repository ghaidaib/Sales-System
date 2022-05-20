package Entity;
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Category")
public class Category {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Name", length = 75, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="products_id",referencedColumnName = "id")
    private Products products;
}
