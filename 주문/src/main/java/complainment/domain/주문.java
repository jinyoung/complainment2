package complainment.domain;

import complainment.주문Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "주문_table")
@Data
//<<< DDD / Aggregate Root
public class 주문 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private 주문상세 class300S;

    private String 총액;

    public static 주문Repository repository() {
        주문Repository 주문Repository = 주문Application.applicationContext.getBean(
            주문Repository.class
        );
        return 주문Repository;
    }
}
//>>> DDD / Aggregate Root
