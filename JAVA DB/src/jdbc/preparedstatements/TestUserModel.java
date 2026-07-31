package jdbc.preparedstatements;

import java.text.SimpleDateFormat;

public class TestUserModel {

	public static void main(String[] args) throws Exception{
		//testAdd();
		//testUpdate();
		testDelete();
	}

	@SuppressWarnings("unused")
	private static void testAdd() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserModel model = new UserModel();
		
		model.add(8,"Aman","Waghmare","amanw@gmail.com","aman123",sdf.parse("2008-07-14"));
		
	}
	
   @SuppressWarnings("unused")
private static void testUpdate() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserModel model = new UserModel();
		
		model.update(8,"Aman","Waghmare","amanw@gmail.com","notaman",sdf.parse("2008-07-14"));
		
	}
   
   private static void testDelete() throws Exception {
		
		UserModel model = new UserModel();
		
		model.delete(8);
		
	}
}
