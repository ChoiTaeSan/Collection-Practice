import java.util.List;

public class ItemManagerImplementation implements ItemManagement {
    private List<Item> items;

    public ItemManagerImplementation(List<Item> items) {
        this.items = items;
    }

    @Override
    public void addItem(String name) {
        Item item = new ItemImplementation(name);
        items.add(item);
        System.out.println("아이템이 추가되었습니다: " + item);
    }

    @Override
    public void searchItem(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                System.out.println("아이템을 찾았습니다: " + item);
                return;
            }
        }
        // 만약 아이템을 찾지 못한 경우에 도달한 경우
        System.out.println("아이템을 찾지 못했습니다.");
    }

    @Override
    public void deleteItem(String name) {
        Item itemToRemove = null;
        for (Item item : items) {
            if (item.getName().equals(name)) {
                itemToRemove = item;
                break;
            }
        }

        if (itemToRemove != null) {
            items.remove(itemToRemove);
            // 아이템이 성공적으로 삭제된 경우
            System.out.println("아이템이 삭제되었습니다: " + itemToRemove);
        } else {
            // 아이템을 찾지 못한 경우에 도달한 경우
            System.out.println("아이템을 찾지 못했습니다. 삭제 실패.");
        }
    }

    @Override
    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("아이템이 없습니다.");
        } else {
            System.out.println("아이템 목록:");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}
