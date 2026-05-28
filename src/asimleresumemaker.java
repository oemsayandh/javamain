import java.util.Scanner;
public class asimleresumemaker {
    public static void main(String[] args){
        String name;
        String email;
        String phone;
        String school;
        String degree;
        String jobTittle;
        String company;
        String experience;
        String skill1;
        String skill2;
        String skill3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name :");
        name = scanner.nextLine();
        System.out.println("plz enter your email :");
        email = scanner.nextLine();
        System.out.println("whats your phone :");
        phone = scanner.nextLine();
        System.out.println("whats your school :");
        school = scanner.nextLine();
        System.out.println("whats your degree :");
        degree = scanner.nextLine();
        System.out.println("whats your jobtitle :");
        jobTittle = scanner.nextLine();
        System.out.println("whats your company :");
        company = scanner.nextLine();
        System.out.println("whats your expereince :");
        experience = scanner.nextLine();
        System.out.println("whats your main skill :");
        skill1 = scanner.nextLine();
        System.out.println("whats your second skill :");
        skill2 = scanner.nextLine();
        System.out.println("whats your third skill :");
        skill3 = scanner.nextLine();

        System.out.println("RESUME\n" +
                "PERSONAL INFORMATION\n" +
                "\n" +
                "\nName: " + name  +
                "\nEmail: " +email +
                "\nPhone: " + phone);
        System.out.println("\n -----------------------------------------------------");
        System.out.println("PROFESSIONAL SUMMARY\n" +
                "\n" +
                "Dedicated and motivated professional with experience in the field " + "\n of" +jobTittle + "."+" Skilled in communication, teamwork, problem-solving, and technical abilities related to the industry."+"\n Passionate about learning new technologies, improving efficiency,"+"\n and contributing positively to organizational success.");
        System.out.println("\n --------------------------------------------------------------------------");
        System.out.println("\n EDUCATION\n" +
                "\n" +
                "School/College:" + school +"\n" +
                "Degree: " + degree + "\n" +
                "\n" +
                "Built a sttrong academic foundation with practical knowledge, project experience, and professional development skills.");
        System.out.println("\n --------------------------------------------------------------------------------------");
        System.out.println("WORK EXPERIENCE\n" +
                "\n" + jobTittle + "\n" +
                "Company: " + company + "\n" +
                "Experience: " + experience + "\n" +
                "\n" +
                "Key Responsibilities\n" +
                "Managed daily operational and professional responsibilities efficiently.\n" +
                "Worked collaboratively with team members to achieve company goals.\n" +
                "Assisted in handling projects, documentation, and workflow improvements.\n" +
                "Maintained professional communication with clients and colleagues.\n" +
                "Applied technical and analytical skills to solve work-related challenges.\n" +
                "Achievements\n" +
                "Successfully completed tasks and assignments within deadlines.\n" +
                "Improved productivity and contributed to team performance.\n" +
                "Gainned valuable professional and technical experience.");
        System.out.println("\n -------------------------------------------------------------------------");
        System.out.println("SKILLS\n" +
                "\n"+ skill1 +
                "\n" + skill2 + "\n" +
                skill3 );
        System.out.println("\n -----------------------------------------------------------------------------------");
        System.out.println("STRENGTHS \n" +
                "Excellent communication skills\n" +
                "Team collaboration and leadership\n" +
                "Quick learner and adaptable\n" +
                "Strong problem-solving ability\n" +
                "Good time management and organization");
        System.out.println("\n-------------------------------------------------------------------------------------------------");
        System.out.println("CAREER OBJECTIVE\n" +
                "To secure a challenging role where I can utilize my skills, knowledge, and experience to contribute " + "\n to organizational growth while continuously developing my professional career.");

        scanner.close();


    }
}
