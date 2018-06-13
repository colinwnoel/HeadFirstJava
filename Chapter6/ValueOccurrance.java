package Chapter6;


    public class ValueOccurrance {
        public ValueOccurrance(int val, int occ) {
             value = val;
             occurrances = occ;
        }

        private int value;
        private int occurrances;


        public void setValue(){
                 occurrances += 1;
        }
        public void setValue(int val,int occurance){
            value = val;
            occurrances = occurance;
        }

        public int getValue() {
            return value;
        }

        public int getOcc(){
            return occurrances;
        }
    }
