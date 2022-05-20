package Entity;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Seller")
public class Seller {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Name", length = 75, nullable = false)
    private String name;

    @OneToMany(mappedBy="seller")
    private Set<Sales> sales=new HashSet<>();
}
