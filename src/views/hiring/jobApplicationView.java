package views.hiring;

import clientconnector.ClientServerConnector;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import interfaces.MessageTypes;
import models.JobApplication;
import models.RequestBody;
import models.User;

import java.io.IOException;
import java.util.Scanner;
import static utils.MessagePrinter.printConsoleMessage;
/*
This is job application view
@author Ariane Itetero
 */
public class jobApplicationView {
    public static void main(String[] args) throws IOException {
        printConsoleMessage(MessageTypes.ACTION, false,"====================================");
        printConsoleMessage(MessageTypes.ACTION, false,"\t\t\tJOB APPLICATION MENU         \n");
        printConsoleMessage(MessageTypes.ACTION, false,"------------------------------------");
        printConsoleMessage(MessageTypes.NORMAL, false,"\t\t1.VIEW ALL JOBS POSTED            \n");
        printConsoleMessage(MessageTypes.NORMAL, false,"\t\t2.APPLY FOR A JOB   \n");
        printConsoleMessage(MessageTypes.NORMAL, false,"\t\t3.VIEW YOUR APPLICATIONS          \n");
        printConsoleMessage(MessageTypes.NORMAL, false,"\t\t4.UPDATE APPLICATION           \n");
        printConsoleMessage(MessageTypes.NORMAL, false,"\t\t5.DELETE APPLICATION             \n");
        printConsoleMessage(MessageTypes.NORMAL, false,"\t\t6.RETURN HOME            \n");
        printConsoleMessage(MessageTypes.NORMAL, false,"====================================");
        printConsoleMessage(MessageTypes.NORMAL, false,"\n\n\t\tEnter your choice: ");
        Scanner input=new Scanner(System.in);
        Integer choice=input.nextInt();
        switch(choice){
            case 1:
                viewPosts();
            case 2:
                applyForJob();
            case 3:
                viewApplications();
            case 4:
                updateApplication();
            case 5:
                deleteApplication();
            case 6:
                goToHome();
        }
    }

    private static void goToHome() {
    }

    private static void deleteApplication() {
    }

    private static void updateApplication() {
    }

    private static void viewApplications() {
//            RequestBody requestBody = new RequestBody();
//            requestBody.setUrl("/users");
//            requestBody.setAction("getUsers");
//            requestBody.setObject(null);
//
//            ResponseBody responseBody = new ClientServerConnector().ConnectToServer(requestBody);
//            System.out.println("\t\t\t\t LIST OF USERS\t");
//            System.out.format("+-------+-----------------+-----------------+---------------------------+---------------------------+--------------+-----------------+---------------------------+-----------------+%n");
//            System.out.println(String.format("| %5s | %-15s | %-15s | %-25s | %-25s | %-12s | %-15s | %-25s | %-15s |","#Id ","First name", "Last name","Username","Email","Gender","User category","Birth date","User Location"));
//            System.out.format("+-------+-----------------+-----------------+---------------------------+---------------------------+--------------+-----------------+---------------------------+-----------------+%n");
//            for (Object response: responseBody.getResponse()){
//                User user = (User) response;
//
////            System.out.println("\t "+ user.getUserId() + "\t\t" + user.getFirstName()+" \t\t "+user.getLastName() + "\t\t"
////            + user.getUserName() + "\t\t" + user.getGender() + "\t\t" + user.getEmail() + "\t\t" + user.getBirthDate() + "\t\t"
////            + user.getLocation());
//                System.out.println(
//                        String.format("| %5s | %-15s | %-15s | %-25s | %-25s | %-12s | %-15s | %-25s | %-15s |",
//                                user.getUserId(),
//                                user.getFirstName(),
//                                user.getLastName(),
//                                user.getUserName(),
//                                user.getEmail(),
//                                user.getGender(),
//                                user.getBirthDate(),
//                                user.getUserCategory(),
//                                user.getLocation())
//                );
//            }
        }
    private static void viewPosts() {
    }

    public static void applyForJob() throws IOException{
        Scanner scanner=new Scanner(System.in);
        printConsoleMessage(MessageTypes.ACTION, false,"\t\tENTER DETAILS OF EMPLOYMENT DESIRED\n");
        printConsoleMessage(MessageTypes.NORMAL, false," Id: ");
        String id=scanner.nextLine();
        int idd=Integer.parseInt(id);
        printConsoleMessage(MessageTypes.NORMAL, false,"User Id: ");
        String userId=scanner.nextLine();
        int userrId=Integer.parseInt(userId);
       printConsoleMessage(MessageTypes.NORMAL, false,"Job Id: ");
       String jobIdd=scanner.nextLine();
       int jobId=Integer.parseInt(jobIdd);
        printConsoleMessage(MessageTypes.NORMAL, false,"Current address: ");
        String address=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"Position: ");
        String position=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"Available date: ");
        String availableDate=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"Salary desired: ");
        String salary=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"Payment method: ");
        String paymentMethod=scanner.nextLine();
        printConsoleMessage(MessageTypes.ACTION, false,"\n\t\tENTER DETAILS OF PREVIOUS EMPLOYMENT\n");
        printConsoleMessage(MessageTypes.NORMAL, false,"Previous employer: ");
        String prevEmp=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"Previous employer phone Number : ");
        String prevEmpPhone=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"Previous employer email: ");
        String prevEmpEmail=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"Previous position: ");
        String prevPos=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"Reason for leaving: ");
        String reason=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"Previous salary: ");
        String prevSalary=scanner.nextLine();
        printConsoleMessage(MessageTypes.ACTION, false,"\n\t\tENTER DETAILS OF REFERENCES\n");
        printConsoleMessage(MessageTypes.NORMAL, false,"Full names: ");
        String refNames=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"Contact ");
        String contact=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"\n\n Attach the certificate ");
        String certificate=scanner.nextLine();
        printConsoleMessage(MessageTypes.NORMAL, false,"\n\n Attach the resume ");
        String resume=scanner.nextLine();

        JobApplication apply = new JobApplication();
        apply.setUserId(userrId);
        apply.setId(idd);
         apply.setJobId(jobId);
         apply.setCurrentAddress(address);
         apply.setPositionAppliedFor(position);
         apply.setAvailableDate(availableDate);
         apply.setSalaryDesired(salary);
         apply.setPaymentMethod(paymentMethod);
         apply.setPrevEmployer(prevEmp);
         apply.setPrevEmpPhone(prevEmpPhone);
         apply.setPrevEmpEmail(prevEmpEmail);
         apply.setPrevPosition(prevPos);
         apply.setReason(reason);
         apply.setReferenceName(refNames);
         apply.setReferencePhone(contact);
         apply.setCertificate(certificate);
         apply.setResume(resume);

        RequestBody requestBody = new RequestBody();
        requestBody.setUrl("/createApplication");
        requestBody.setAction("createApplication");
        requestBody.setObject(apply);

        String requestString = new ObjectMapper().writeValueAsString(requestBody);

        ClientServerConnector clientServerConnector = new ClientServerConnector();
        String response = clientServerConnector.connectToServer(requestString);

        //System.out.println("Response : " +response);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonResponse = objectMapper.readTree(response);

        int status = jsonResponse.get("status").asInt();
        String message = jsonResponse.get("message").asText();
        String actionDone = jsonResponse.get("actionToDo").asText();

        printConsoleMessage(MessageTypes.NORMAL, false,"========================================================================");
        printConsoleMessage(MessageTypes.NORMAL, false,"STATUS ||         MESSAGE        ||             ACTION DON              ");
        printConsoleMessage(MessageTypes.NORMAL, false,"========================================================================");
        printConsoleMessage(MessageTypes.NORMAL, false,status+"    ||" + message +"   ||" + actionDone);
        printConsoleMessage(MessageTypes.NORMAL, false,"========================================================================");

    }
}
