public class InstanceCounter {
    public static void main(String[] args){
        String[] names = {"Elroi", "Noah", "Chris", "Keira", "Kent", "Dwight","Noah"};
        int init = 1;
        int last = 4;
//        while (init <=last){
//            System.out.println(names[init-1]);
//            init++;
//        }
        int count = 0;
        for (String name: names){
            if (name == "Noah") {
                count++;
            }
        }
//        int index = 0;
//        while (index < names.length) {
//            if (names[index].equals("Noah")) {
//                count++;
//            }
//            index++;
//        }
        System.out.println("Noah appeared " + count +" times!");

    }
}
