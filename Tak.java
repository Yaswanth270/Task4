@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    // Constructors, getters, setters
}

public interface TaskRepository extends JpaRepository<Task, Long> {
}
