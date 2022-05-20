package Entity;

import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Sales")
public class Sales {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Client_Id", length = 75, nullable = false)
    private int client_id;
    @Column(name = "Seller_Id", length = 75, nullable = false)
    private int seller_id;
    @Column(name = "Products_Id", length = 75, nullable = false)
    private int product_id;
    @Column(name = "Total", length = 100, nullable = false)
    private float total;
    @Column(name = "Creation_date")
    private Date creation date;

    @ManyToOne
    @JoinColumn(name="client_id",referencedColumnName = "id")
    private Clients client;

    @ManyToOne
    @JoinColumn(name="seller_id",referencedColumnName = "id")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name="product_id",referencedColumnName = "id")
    private Products products;
}
