package task4;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Computer implements IComputer {
    private String name;

    @NonNull
    private Monitor monitor;


    @Override
    public void on() {
        System.out.println("Компьютер включился " + name + ", используется монитор " + monitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился  " + name + ", используется монитор " + monitor.getName());
    }
}