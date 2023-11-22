package Task1;

public enum Days {
    MONDAY{
        @Override
        public void lessonsInWeek() {
            System.out.println("Technical lesson 18:00 and English technical lesson 14:30.");
        }
    },
    TUESDAY{
        @Override
        public void lessonsInWeek() {
            System.out.println("Practical lesson 18:00.");
        }
    },
    WEDNESDAY{
        @Override
        public void lessonsInWeek() {
            System.out.println("Technical lesson 18:00 and English practical lesson 14:30.");
        }
    },
    THURSDAY{
        @Override
        public void lessonsInWeek() {
            System.out.println("Practical lesson 18:00");
        }
    },
    FRIDAY{
        @Override
        public void lessonsInWeek() {
            System.out.println("Technical lesson 18:00 and  Event 14:30.");
        }
    },
    SATURDAY{
        @Override
        public void lessonsInWeek() {

        }
    },
    SUNDAY{
        @Override
        public void lessonsInWeek() {

        }
    };
    public abstract void lessonsInWeek();
}
