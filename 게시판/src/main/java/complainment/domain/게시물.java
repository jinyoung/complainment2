package complainment.domain;

import complainment.게시판Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "게시물_table")
@Data
//<<< DDD / Aggregate Root
public class 게시물 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String 내용;

    private Integer 댓글수;

    @Embedded
    private 댓글Id 댓글Id;

    public static 게시물Repository repository() {
        게시물Repository 게시물Repository = 게시판Application.applicationContext.getBean(
            게시물Repository.class
        );
        return 게시물Repository;
    }
}
//>>> DDD / Aggregate Root
