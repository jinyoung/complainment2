package complainment.domain;

import complainment.주문Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "포인트_table")
@Data
//<<< DDD / Aggregate Root
public class 포인트 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static 포인트Repository repository() {
        포인트Repository 포인트Repository = 주문Application.applicationContext.getBean(
            포인트Repository.class
        );
        return 포인트Repository;
    }
}
//>>> DDD / Aggregate Root
