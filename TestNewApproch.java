package collectionimpl;

import java.util.*;
public class TestNewApproch
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("** Enter Vegetavle Availability **");
        System.out.println("Enter number of Vegetables: ");
        int n = sc.nextInt();
        int i;
        int vID[] = new int[n];
        int vQn[] = new int[n];
        double vRa[] = new double[n];
        String vDes[] = new String[n];
        for(i = 0; i < n; i++)
        {
            System.out.println("Enter Vegetable ID: ");
            vID[i] = sc.nextInt();
            System.out.println("Enter Total Quantity Available for Sale: ");
            vQn[i] = sc.nextInt();
            System.out.println("Enter Description: ");
            vDes[i] = sc.next();
            System.out.println("Enter the Rate: ");
            vRa[i] = sc.nextDouble();
        }
        System.out.println("** CUSTOMER PURCHASE **");
        System.out.println("Following Items are available for Purchase: ");
        System.out.println("Veg ID\t Total Quantity Available\t Veg Description\t Veg Rate");
        for(i = 0; i < n; i++)
        {
            
            System.out.println(vID[i]+"\t\t"+vQn[i]+"\t\t\t\t"+vDes[i]+"\t\t\t"+vRa[i]);
        }
        System.out.println("** CUSTOMER BILL **");
        System.out.println("Enter the Quantity you want to Purchase: ");
        int pQn[] = new int[1000];
        int pQ[] = new int[1000];
        for(i = 0; i < n; i++)
        {
            System.out.println("Veg ID: "+vID[i]);
            System.out.println("Quantity Available: "+vQn[i]);
            System.out.println("Quantity to be Purchased: ");
            pQn[i] = sc.nextInt();
            if(vQn[i] > pQn[i])
            {
                pQ[i] = pQn[i];
                System.out.println("Added to Cart!");
                vQn[i] = vQn[i] - pQn[i];
            }
            else
            {
                System.out.println("Not Available.");
            }
        }
        double cost[];
        cost = new double[10000];
        System.out.println("Veg ID\t Total Qn Purchased\t Veg Description\t Veg Rate\t Cost");
        
        
        for(i = 0; i < n; i++)
        {
            cost[i] = (pQ[i] * vRa[i]);
            System.out.println(vID[i]+"\t\t"+pQ[i]+"\t\t\t"+vDes[i]+"\t\t"+vRa[i]+"\t\t"+cost[i]);
        }
    }
}
