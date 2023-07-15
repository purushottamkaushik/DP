package generalPractice;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SampleObj implements Serializable {

    private LocalDateTime localDateTime;

    private int number;
    private String name;
    private String address;
    private String locality;

    public SampleObj(LocalDateTime localDateTime ,int number, String name, String address, String locality) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.locality = locality;
        this.localDateTime = localDateTime;
    }


}
