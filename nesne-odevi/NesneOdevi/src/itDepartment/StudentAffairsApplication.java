package itDepartment;

public class StudentAffairsApplication {
/*
 * Ramazan Fatih Karadeniz
 * 2017280029
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStudent std1= new UnderGraduate();
		std1.setStdNo(2008291014);
		std1.setStdName("HAMİYET");
		std1.setStdSirName("MANDIRALI");
		std1.setStdDepartment("MATEMATİK");
		std1.addLesson("MAT101", "Matematik1", 6, 62);
		std1.addLesson("MAT107", "Soyut Matematik", 6, 60);
		std1.addLesson("FSH333", "Hayat Bilgisi", 8, 60);
		
		IStudent std2= new UnderGraduate();
		std2.setStdNo(2008291022);
		std2.setStdName("TANER");
		std2.setStdSirName("İNER");
		std2.setStdDepartment("ASTROFİZİK");
		std2.addLesson("MAT101", "Matematik1", 6, 95);
		std2.addLesson("MAT107", "Soyut Matematik", 6, 90);
		std2.addLesson("FSH333", "Hayat Bilgisi", 8, 100);
		std2.addLesson("AST101", "Astrofiziğe Giriş", 12, 88);
		
		IStudent std3= new PostGraduate("İSTANBUL ÜNİVERSİTESİ", "TARİH");
		std3.setStdNo(2009291062);
		std3.setStdName("ADİL KEMAL");
		std3.setStdSirName("KÜKRER");
		std3.setStdDepartment("TARİH");
		std3.addLesson("TAR505", "Tatar Tarihi", 18, 79);
		std3.addLesson("TAR511", "Uzakdoğu Halkları", 18, 100);

		
		IStudent std4= new PostGraduate("DOKUZ EYLÜL ÜNİVERSİTESİ", "BİLGİSAYAR BİLİMLERİ");
		std4.setStdNo(2010432000);
		std4.setStdName("SENEM");
		std4.setStdSirName("BİLGİÇ");
		std4.setStdDepartment("BİLGİSAYAR BİLİMLERİ");
		std4.addLesson("CSC5001	", "Fuzzy Data Analysis", 8, 78);
		std4.addLesson("CSC5019	", "Software Requirements Engineering", 8, 40);
		std4.addLesson("MAT5101	", "Applied Mathematics", 9, 83);
	
		IStudent std5= new Doctorate("EGE ÜNİVERSİTESİ", "BEDEN EĞİTİMİ VE SPOR","UNVERSITY OF BRITISH COLUMBIA","KINESIOLOGY");
		std5.setStdNo(2009291030);
		std5.setStdName("DOĞAÇ");
		std5.setStdSirName("SAZAN");
		std5.setStdDepartment("SPOR BİLİMLERİ");
		std5.addLesson("SPB603", "Rehabilitatif Spor", 18, 95);
		std5.addLesson("SPB630", "Sporda Sponsorluk", 6, 100);

	
		System.out.println(std1.toString());
		System.out.println(std1.cumulativeSuccessGrade());
		
		System.out.println(std2.toString());
		System.out.println(std2.cumulativeSuccessGrade());
		
		System.out.println(std3.toString());
		System.out.println(std3.cumulativeSuccessGrade());
		
		System.out.println(std4.toString());
		System.out.println(std4.cumulativeSuccessGrade());
		
		System.out.println(std5.toString());
		System.out.println(std5.cumulativeSuccessGrade());
		
	
	}

}
