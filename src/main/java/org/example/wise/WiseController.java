package org.example.wise;

import org.example.Container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WiseController {
    Wise wise;
    int id = 1;
    List<Wise> wiseList = new ArrayList<>();


    public void write() {
        System.out.print("명언 : ");
        String content = Container.getSc().nextLine().trim();
        System.out.print("작가 : ");
        String author = Container.getSc().nextLine().trim();
        wise = new Wise(id, content, author);
        wiseList.add(wise);
        System.out.println(id + "번 명언 등록");
        id++;
    }

    public void list() {
        System.out.println("번호 / 작가 / 명언\n--------------------------");
        for (Wise ws : wiseList) {
            System.out.println(ws.getId() + " / " + ws.getAuthor() + " / " + ws.getContent());
        }
    }

    public void delete() {
        System.out.print("삭제할 번호 : ");
        int deleteId = Integer.parseInt(Container.getSc().nextLine());
        int find = 1;

        for (int i = 0; i < wiseList.size(); i++) {
            if (wiseList.get(i).getId() == deleteId) {
                wiseList.remove(i);
                System.out.println(deleteId+ "번 명언 삭제");
                find = 0;
                return;
            }
        }
        if (find != 0) {
            System.out.println(deleteId + "번 명언 없음");
        }


    }

    public void modify() {
        System.out.print("수정할 번호 : ");
        int modifyId = Integer.parseInt(Container.getSc().nextLine());
        int find = 1;
        for (Wise ws : wiseList) {
            if (ws.getId() == modifyId) {
                System.out.println("기존명언 : " + ws.getContent());
                System.out.print("명언등록 : ");
                String content = Container.getSc().nextLine().trim();
                ws.setContent(content);

                System.out.println("기존작가 : " + ws.getAuthor());
                System.out.print("작가등록 : ");
                String author = Container.getSc().nextLine().trim();
                ws.setAuthor(author);
                System.out.println(modifyId + "번 명언 수정");
                find = 0;
                return;
            }
        }
        if (find != 0) {
            System.out.println(modifyId + "번 명언 없음");
        }


    }
}
