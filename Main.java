public class Main {

    public static void main(String[] args) {
        String text = "ЗТЕФТИ ЧЦФТ!\n" +
                "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
                "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
                "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.";
        System.out.println("Изначальный текст:\n"+text+"\nДекодированный текст:");
        String split_text[] = text.split("\n");
        String split_string[] = split_text[3].split(" ");
        //String decode1 = decoder.decode(split_text[0],-4);
        for (int i = 0; i < decoder.decode(split_text[0], -4).length; i++)
            System.out.print(decoder.decode(split_text[0], -4)[i]);
        System.out.println();
        for (int i = 0; i < decoder.decode(split_text[1], +8).length; i++)
            System.out.print(decoder.decode(split_text[1], +8)[i]);
        System.out.println();
        for (int i = 0; i < decoder.decode(split_text[2], +15).length; i++)
            System.out.print(decoder.decode(split_text[2], +15)[i]);
        System.out.println();
        //split_text[7]=ver(+1) уроки
        //split_text[1]=ver(+3) конфетки
        //split_text[2]=ver(+28) и
        //split_text[8]=ver(+7) вечером
        //split_text[3]=ver(+10) печенье
        //split_text[4]=ver(+2) в
        //split_text[10]=ver(+30) мама
        //split_text[6]=ver(+29) сделай
        //split_text[9]=ver(+31) проверю
        //split_text[5]=ver(+32) шкафчике
        int arr[] = {+3, +28, +10, +2, +32, +29, +1, +7, +31, 30};
        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < decoder.decode(split_string[i], arr[i]).length; j++) {
                System.out.print(decoder.decode(split_string[i], arr[i])[j]);
                }
                System.out.print(' ');
            }
            System.out.println();


    }
}
