// 아이템 관리 인터페이스
public interface ItemManagement {
    void addItem(String name);

    void searchItem(String name);

    void deleteItem(String name);

    void listItems();
}
