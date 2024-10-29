package complainment.domain;

import complainment.게시판Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "댓글_table")
@Data
//<<< DDD / Aggregate Root
public class 댓글 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String 게시물Id;

    private String 내용;

    public static 댓글Repository repository() {
        댓글Repository 댓글Repository = 게시판Application.applicationContext.getBean(
            댓글Repository.class
        );
        return 댓글Repository;
    }
}
//>>> DDD / Aggregate Root
