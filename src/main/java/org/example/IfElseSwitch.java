package org.example;

public class IfElseSwitch {
        private static enum DayOTheWeek{
            MON, TUE, WED, THU, FRI, SAT, SUN
        }

        public static void main(String[] args) {
            //В этот раз выберем вторник
            var dayOfTheWeek= DayOTheWeek.TUE;

            String result = switch (dayOfTheWeek){
                case MON -> "Понедельник";
                case TUE, WED, THU, FRI -> {
                    yield "Любой будний день, кроме понедельника.";
                }
                default -> "Выходной день";
            };
            System.out.println(result);
        }
}
