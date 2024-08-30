package model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString

public class AddItems {
    private String task;

    public AddItems(String task) {
        this.task = task;
    }
}
