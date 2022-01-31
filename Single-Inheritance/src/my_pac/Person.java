package my_pac;

class Person {

		private String name;
		private String dateOfBirth;
		private String gender;
		private String mobileNumber;
		private String bloodGroup;

		Person(){}
			public String getName(){
				return name;
			}
			
			public void setName(String name){
				this.name= name;
			}
			
			public String getDOB(){
				return dateOfBirth;
			}
			
			public void setDOB(String DOB){
				this.dateOfBirth=DOB;
			}
			public String getGender(){
				return gender;
			}
			public void setGender(String gender){
				this.gender=gender;
			}
			public String getNum(){
				return mobileNumber;
			}
			public void setNum(String num){
				this.mobileNumber=num;
			}
			public String getBG(){
				return bloodGroup;
			}
			public void setBG(String BG){
				this.bloodGroup=BG;
			}

}
