package Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Clients")
public class Clients {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Name", length = 75, nullable = false)
    private String name;
    @Column(name = "Last_Name", length = 75, nullable = false)
    private String last_name;
    @Column(name="Mobile", length=15, nullable=false, unique=true)
    private String mobile;
    @OneToMany(mappedBy="client")
    private Set<Sales> sales=new HashSet<>();
}
