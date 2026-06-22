public class earth_volume {
    public static void main(String[] args){
        int radius=6378;
        double volume=(4/3)*3.14*radius*radius*radius;
        double miles=volume*1.6;
        System.out.println(" The volume of earth in cubic kilometers is "+volume+ " and cubic miles is "+miles);
    }
    
}
