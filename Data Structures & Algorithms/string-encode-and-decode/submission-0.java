class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb =  new StringBuilder();

        for(String item : strs)
        {   
            sb.append(item.length());
            sb.append('#');
            sb.append(item);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        int i=0;
                List<String> list = new ArrayList<>();


        while(i<str.length()){

                 int j=i;

              while(str.charAt(j) != '#'){
                j++;
              }   

        int length = Integer.parseInt(str.substring(i,j));


        String word = str.substring(j+1,j+1+length);
        
        list.add(word);

        i=j+1+length;

        }

        return list;

    }
}
