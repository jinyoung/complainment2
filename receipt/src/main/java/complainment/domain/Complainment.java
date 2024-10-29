package complainment.domain;

import complainment.ReceiptApplication;
import complainment.domain.민원접수됨;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Complainment_table")
@Data
//<<< DDD / Aggregate Root
public class Complainment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String 민원사무번호;

    private String 회원id;

    @Embedded
    private ComplainmentDetail 민원상세;

    @PostPersist
    public void onPostPersist() {
        민원접수됨 민원접수됨 = new 민원접수됨(this);
        민원접수됨.publishAfterCommit();
    }

    public static ComplainmentRepository repository() {
        ComplainmentRepository complainmentRepository = ReceiptApplication.applicationContext.getBean(
            ComplainmentRepository.class
        );
        return complainmentRepository;
    }

    //<<< Clean Arch / Port Method
    public static void 민원접수실패처리(결재실패 결재실패) {
        //implement business logic here:

        /** Example 1:  new item 
        Complainment complainment = new Complainment();
        repository().save(complainment);

        */

        /** Example 2:  finding and process
        
        repository().findById(결재실패.get???()).ifPresent(complainment->{
            
            complainment // do something
            repository().save(complainment);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
