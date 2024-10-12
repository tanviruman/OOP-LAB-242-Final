private void SearchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        try{
            File file =new File("Address.txt");
            Scanner sc=new Scanner(file);
            boolean flag=true;
            for(int i=1; sc.hasNextLine(); i++){
                String a=sc.nextLine();

                String b[]=a.split(" ");
                for (String b1 : b) {
                    if (b1.equals(Input.getText())) {
                        Result.setText("User found: "+a);
                        flag=false;
                        break;
                    }
                }
                if(flag==true)
                    Result.setText("User not found");
            }

            sc.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
// TODO add your handling code here:
    }