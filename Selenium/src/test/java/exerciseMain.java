public class exerciseMain {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\project\\softwares\\geckodriver-v0.24.0-win32\\geckodriver.exe");
        String url = "http://toolsqa.com/automation-practice-form/";
        exerciseBtn exBtn = new exerciseBtn();
        exBtn.Btn(url);

        btnMultipleSelects mul = new btnMultipleSelects();
        mul.btnMultipleSelects();
    }
}
