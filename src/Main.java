public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Если вы не знаете какая у вас операционная система, обратитесь в лужбу поддержки");
        }
        System.out.println("Задача 2");
        int yeer = 2016;
        int clientOS1 = 1;
        if (yeer < 2015) {
            if (clientOS1 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            }
        }else {
                if (clientOS1 == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        System.out.println("Задача 3");
         int yeer3 = 1882;
         int opys = yeer3 % 4;
         if (opys == 0) {
             System.out.println("Год высокосный");
         } else {
             System.out.println("Год невысокосный");
         }
        System.out.println("Задача 4");
         int deliveryDistance = 101;
         int deys = deliveryDistance / 30;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deys);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60 ) {
            System.out.println("Потребуется дней: " + deys);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100 ) {
            System.out.println("Потребуется дней: " + deys);
        }
        if (deliveryDistance > 100 ) {
            System.out.println("Доставка не осуществляется");
        }
        System.out.println("Задача 5");
         int monthNumber = 4;
        switch (monthNumber) {
            case 1:
                System.out.println(" 1-й месяй январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println(" 2-й месяй февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println(" 3-й месяй март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println(" 4-й месяй апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println(" 5-й месяй май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println(" 6-й месяй июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("7-й месяй июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("8-й месяй август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("9-й месяй сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("10-й месяй октябрь принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("11-й месяй ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("12-й месяй декабрь принадлежит к сезону зима");
                break;
                default:
                System.out.println("Больше месяцев году не бывает");
        }
        }
    }
