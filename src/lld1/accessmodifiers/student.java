package lld1.accessmodifiers;

public class student {
        private String name;
        String batchName;
        protected int age;
        public double psp;

        void changeBatch(String newBatchName){
            batchName = newBatchName;
        }
        void mockInterview() {
            System.out.println("Yes given");
        }
    }



