package home5.calculator;

import java.util.List;

public interface View {
    int get();
    void set();
    void appendLog(String log);
    public void appendLog(List list);
    void showLog();
}
