package org.example;

import org.example.wise.WiseController;

public class App {
    WiseController wiseController = new WiseController();


    void run() {
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String command = Container.getSc().nextLine().trim();

            switch (command) {
                case "종료":
                    return;
                case "등록":
                    wiseController.write();
                    break;
                case "목록":
                    wiseController.list();
                    break;
                case "삭제":
                    wiseController.delete();
                    break;
                case "수정":
                    wiseController.modify();
                    break;

            }
        }


    }


}
