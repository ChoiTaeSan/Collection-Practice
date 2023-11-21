import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemManagement itemManagement = new ItemManagerImplementation(new ArrayList<>()); // ArrayList 초기화
        Scanner scanner = new Scanner(System.in);

        int choice, num;
        while (true) {
            System.out.println("\n아이템 관리 시스템");
            System.out.println("1. 아이템 추가");
            System.out.println("2. 아이템 검색");
            System.out.println("3. 아이템 삭제");
            System.out.println("4. 아이템 목록 출력");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            switch (choice) {
                case 1: // 1번 선택: 아이템 추가
                    do {
                        System.out.print("추가할 아이템 입력: ");
                        String newItem = scanner.next();
                        itemManagement.addItem(newItem);
                        System.out.println("추가로 아이템을 더 입력하시겠습니까? (계속:1/중단:0)");
                        num = scanner.nextInt();
                    }while (num ==1);
                case 2: // 2번 선택: 아이템 검색
                    System.out.print("검색할 아이템 입력: ");
                    String searchItem = scanner.nextLine();
                    itemManagement.searchItem(searchItem);
                    break;
                case 3: // 3번 선택: 아이템 삭제
                    System.out.print("삭제할 아이템 입력: ");
                    String deleteItem = scanner.nextLine();
                    itemManagement.deleteItem(deleteItem);
                    break;
                case 4: // 4번 선택: 아이템 목록 출력
                    itemManagement.listItems();
                    break;
                case 5: // 5번 선택: 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                    break;
                default: // 잘못된 선택
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }
}
