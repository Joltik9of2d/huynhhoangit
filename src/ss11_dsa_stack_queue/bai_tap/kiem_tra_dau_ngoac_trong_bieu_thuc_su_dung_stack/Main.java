package ss11_dsa_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

public class Main {
    public static void main(String[] args) {
        BracketCheck bracketCheck = new BracketCheck();
        if (bracketCheck.isRight()) {
            System.out.print("Very well");
        } else {
            System.out.print("?????");
        }
    }
}
