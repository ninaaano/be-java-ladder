package kr.codesquad;

import java.util.List;

public class OutputView {

    public void printResultMessage() {
        System.out.println("실행결과");
    }


    public void printLadder(List<Ladder> ladderList) {
        for (Ladder s : ladderList) {
            s.getLadder().forEach(System.out::print);
        }

    }

    public void printUserInfo(List<User> userList) {
        for (User users : userList) {
            System.out.print(users.getName() + " ");
        }
    }
}
