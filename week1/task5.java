class task5{

    public static void main(String[] args){
        int intval = 253434343;
        byte byteval = 1;
        System.out.println("Before casting");
        System.out.println("Integer :" + intval);
        System.out.println("Byte :"+ byteval);

        System.out.println("After implicit casting");
        int res = byteval;
        System.out.println("Byte to Integer :"+ res);

        System.out.println("After explicit casting");
        byte resu = (byte)intval;
        System.out.println("Integer to Byte :" + resu);

    }
}