public class LinierSearch {
    public static void main(String[] args){
        String[] data = {"safira","dian","intan","mega","sifa"};
        liniearSearch(data, "intan");

    }
    public static void liniearSearch (String[] data,String nama){

        for (int i = 0; i < data.length; i++){
            if (nama.equalsIgnoreCase(data[i])){
                System.out.println(nama + ": ditemukan pada posisi ke-" + (i+1) + "dan pada index ke-" + i);
                break;
            }

        }

        // ketika data tidak ditemukan
    }
}