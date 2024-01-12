package collection.day11;

import java.util.ArrayList;
import java.util.List;

import collection.myapp.JavaWord;

public class CustomerManageApp {
    
    // JavaWordApp V2 형식으로 하세요.
    private List<Customer> custs = new ArrayList<>();
    
    private void start() {
        initialize();
        // 메뉴 선택 : 등록, 검색(이름/그룹), 삭제, 수정, 전체출력
        System.out.println("고객 정보 프로그램을 시작합니다. ~~" + "~".repeat(30));
        while (true) {
            System.out.println("\t <메뉴를 선택하세요.>");
            System.out.println("\t 1. 고객 등록 ");
            System.out.println("\t 2. 고객 목록 조회 ");
            System.out.println("\t 3. 고객 검색 ");
            System.out.println("\t 4. 고객 삭제 ");
            //System.out.println("\t 고객 정보를 변경합니다.");
            System.out.println("\t 5. 프로그램 종료 ");
            System.out.print("선택 >> ");
            int select = Integer.parseInt(System.console().readLine());

            switch (select) {
                case 1:
                    addCusTomer();  // 고객 등록 메소드 실행    
                    break;
                case 2:
                    listCusTomer();  // 고객 목록 조회 메소드 실행    
                    break;
                case 3:
                    searchCusTomerBy();  // 고객 검색 메소드 실행    
                    break;
                case 4:
                    removeCusTomer();  // 고객 삭제 메소드 실행    
                    break;
                //case 5:


                case 5:
                    listCusTomer();  
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); //main 실행을 종료
                    break;
                default:
                    System.out.println("잘못된 선택 입니다.");
                    break;
            }// swich

        }// while

    }// start

    private void addCusTomer() {
        System.out.println("\t ::고객 등록합니다.::");
        System.out.print("고객 이름 입력하세요ㅕ. _ ");
        String name = System.console().readLine();
        System.out.print("핸드폰 번호 입력하세요. _");
        String phone = System.console().readLine();
        System.out.print("그룹 입력하세요.(1 : 일반 2 : vip 3 : 기타) _ ");
        int group = Integer.parseInt(System.console().readLine());
        
        custs.add(new Customer(name, phone, group));
    }

    private void printCusTomerList(List<Customer> list) {
        for(Customer cust : list) {
            System.out.println(String.format("%-20s %-30s %-20s ", cust.getName(), cust.getPhone(), cust.getGroup()));
            
        }
    }

    private void listCusTomer() {
        /* System.out.println(String.format("%-20s %-30s %-20s", "NAME", "PHONE", "GROUP"));
        for(int i=0; i<custs.size(); i++) {
            Customer temp = custs.get(i);
            System.out.println(String.format("%-20s %-30s %-20s",
                                             temp.getName(), temp.getPhone(), temp.getGroup()));
        } */
        System.out.println(String.format("%-20s %-30s %-20s", "NAME", "PHONE", "GROUP"));
        printCusTomerList(custs);
    }
    
    private List<Customer> searchCustomers(String name) {
        List<Customer> list = new ArrayList<>();
        for(Customer cust : custs) {
            if(cust.getName().equals(name)) {
                list.add(cust);
            }
        }
        return list;
    }

   
    private List<Customer> searchCustomers(int group) {
        List<Customer> list = new ArrayList<>();    
        for(Customer cust : custs) {
            if(cust.getGroup() == group) {
                list.add(cust);
            }
        }
        return list;
    }
    
    private void searchCusTomerBy() {
        System.out.println("\t ::고객 목록 조회합니다. (이름은 1, 그룹 조회는 2 ) ::");
        String find = null;
        
        List<Customer> list = null;
        switch (System.console().readLine()) {
            case "1":
                System.out.print("검색할 이름을 입력하세요. _ ");
                find = System.console().readLine();
                list = searchCustomers(find);
                break;
            case "2":
                System.out.print("검색할 그룹을 입력하세요. _ ");
                int group = Integer.parseInt(System.console().readLine());
                list = searchCustomers(group);
                break;
            default:
                System.out.println("1, 2, 만 입력하세요.");
                return;
        }
        System.out.println("\t :: 검색 결과 입니다. :: ");
        if(list.size() == 0) System.out.println("찾는 고객 정보가 없습니다.");
        printCusTomerList(list);
    }

    private void removeCusTomer() {
        
    }

    private void initialize() {
        custs.add(new Customer("강주찬", "010-1123-1234", 2));
        custs.add(new Customer("이대환", "010-1122-1128", 1));
        custs.add(new Customer("노희영", "010-4567-5241", 3));
        custs.add(new Customer("정재원", "010-7895-1234", 2));
        
    }











































    public static void main(String[] args) {
        CustomerManageApp app = new CustomerManageApp();
        app.start();
    }
}
