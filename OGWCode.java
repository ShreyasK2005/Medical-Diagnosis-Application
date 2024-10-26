 import java.util.*;
 import java.util.Scanner;
 public class OGWCode
 {
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      String s = "";
      int f = 0;
      double h = 0;
      int a  = 0;
      int br = 0;
      boolean stop = true;
      String tracker = "";
      String name = "";
      System.out.println("You must be an age of 6 or older to complete this Survey.");
      System.out.println("Please respond with \"yes\" or \"no\" or a number based on the question.");
      System.out.println();
      
       System.out.println("What is your age?");
       a = input.nextInt();
      
       System.out.println("Have you been having Chest pain, chest tightness, or chest pressure?");
       s = input.next();
       if(symptomChecker(s) == true)
       {
         f++;
         tracker += "Chest Pain, ";
         name = "Chest Pain";
         System.out.println();
         preventSymptoms(name);
       }
       System.out.println("Do you feel shortness of breath at rest?");
       s = input.next();
       if(symptomChecker(s) == true)
       {
         f++;
         tracker += "Shortness of breath, ";
         name = "Shortness of breath";
         System.out.println();
         preventSymptoms(name);

       }
       System.out.println("Do you feel Pain in jaw, neck, or throat?");
       s = input.next();
       if(symptomChecker(s) == true)
       {
         f++;
         tracker += "Neck, Jaw, or throat Pain, ";
         name = "Neck, Jaw, or throat Pain";
         System.out.println();
         preventSymptoms(name);
       }
       System.out.println("Do you feel Fatigue?");
       s = input.next();
       if(symptomChecker(s) == true)
       {
         f++;
         tracker += "Fatigue, ";
         name = "Fatigue";
         System.out.println();
         preventSymptoms(name);
       }
       System.out.println("Do you feel dizzines or light headed?");
       s = input.next();
       if(symptomChecker(s) == true)
       {
         f++;
         tracker += "Dizziness, ";
         name = "Dizziness";
         System.out.println();
         preventSymptoms(name);
       }
       System.out.println("What is your normal heart rate?");
       h = input.nextDouble();
       if(heartRateChecker(h, a) == "Scary")
       {
         br++;
         f++;
         tracker += " Tachycardia.";
         name = "Heart rate";
         System.out.println();
         preventSymptoms(name);
       }
       if(heartRateChecker(h, a) == "Bradycardia")
       {
         br++;
         f++;
         tracker+="Bradycardia.";
         System.out.println();
         System.out.println("Low heart rates, also known as Bradycardia, can come from damage to the heart tissue, heart surgeries, certain medications such as sedatives, and drugs.");
         System.out.println("Actions that could be taken for the prevention of Braycadia stems from the severity of the disease, in certain situations requiring no treatment, but in others, medication or surgery prescribed from doctors.");
       }
       if(f > 2 || br > 0)
       {
         System.out.println();
         System.out.println();
         System.out.println("You have been dealing with symptoms such as " + tracker);
         System.out.println("You may be at risk of heart disease such as Cardiomyapothy.");
         System.out.println();
         System.out.println();
         System.out.println("Potential Surgeries (disscussed by doctor) for Cardiomyapothy may include Spetal myecetomy which is open heart surgery (implied for people of young age), and helps improve blood flow.");
         System.out.println("Implanted objects such as implantable cardioverter defibrillator which helps maintain a normal heart beat, pacemaker to maintain a normal heart rate, cardiac resynchronization therapy device which helps communication between left and right ventricle.");
         System.out.println("Heart Transplant, when a poor heart is replaced with a healthy one from a donor.");
         System.out.println();
         System.out.println();
         System.out.println("Please contact your local doctor immediately");
       }
       else
       {
         System.out.println();
         System.out.println();
         System.out.println("You are in good health.");
         System.out.println("Keep excersising, be on a stable diet which includes whole grain products, protein, fruits, and vegetables.");
         System.out.println("Maintain a reasonable Bio Mass Index based of weight and height as well.");
       }
       System.out.println();
       System.out.println();
     }
    public static String heartRateChecker(double h, int age)
    {
      String checker = "";
      if(age >= 6 && age <= 10 && h >= 70 && h <= 110)
      {
        checker = "healthy";
        return checker;
      }
      else if(age >= 6 && age <= 10 && h < 70)
      {
        checker = "Bradycardia";
        return checker;
      }
      if(age >= 11 && age <= 14 && h >= 60 && h <= 105)
      {
        checker = "healthy";
        return checker;
      }
      else if(age >= 11 && age <= 14 && h < 60)
      {    
        checker = "Bradycardia";
        return checker;
      }
      if(age >= 15 && h >= 60 && h <= 100)
      {
        checker = "healthy";
        return checker;
      }
      else if(age >= 15 && h < 60)
      {
        checker = "Bradycardia";
        return checker;
      }
      checker = "Scary";
      return checker;
    }
    public static boolean symptomChecker(String y)
    {
      if(y.toLowerCase().equals("yes"))
      {
        return true;
      }
      else if(y.toLowerCase().equals("no"))
      {
        return false;
      }
      return false;
    }
    public static void preventSymptoms(String t)
    {
      if(t.equals("Chest Pain"))
      {
        System.out.println("Information about symptom: ");
        System.out.println("Chest pain, pressure, or tightness can stem from smoking, high alcohol consumption, obesity, and conditions such as diabetes and high blood pressure.");
        System.out.println("To deal with chest pain, pressure, or tightness you can use medications such as Nitroglycerin an Artery Relaxer, Aspirin, Antidepressants, and Blood thinners, which effectively allow for better blood flow, prevention of blood clots, and acid reductions in the stomach all of which are serious causes for the symptom.");
        System.out.println("You can also avoid foods with high sugar, salt, and focus on more whole grain products, you can also get more sleep to reduce stress.");
        System.out.println();
        System.out.println();
      }
      else if(t.equals("Shortness of breath"))
      {
        System.out.println("Information about symptom: ");
        System.out.println("Shortness of breath can stem from obesity, straining exercises, seriously high and low-level temperatures.");
        System.out.println("To deal with short amounts of breath you can exercise, reduce stress by meditating, and have healthier diets like ones with low salt and sugar as well as whole products.");
        System.out.println("However, in some cases, an immediate check-up with the doctor will be necessary, such as heart pain.");
        System.out.println();
        System.out.println();
      }
      else if(t.equals("Neck, Jaw, or throat Pain"))
      {
        System.out.println("Information about symptoms: ");
        System.out.println("Causes for Neck Pain could include carrying heavy objects, emotional stress, Muscle Strain, bad posture, sleeping with too many or fewer pillows.");
        System.out.println("Causes for Jaw Pain could include pain/ headaches behind the eyes, tooth pain, or a potential heart attack.");
        System.out.println("Causes for Throat Pain could include Allergies, Dryness such as dry indoor air, outdoor air pollution also known as irritants, cancerous tumors, and muscle strain.");
        System.out.println("However, it could also be the flu, COVID-19, or a common cold.");
        System.out.println("Treatments could include physical therapy for posture and neck muscle exercises, electrical nerve stimulation which sends small pulses among spots of pain for pain relief, as well as traction, and Short term immobilization which helps maintain neck posture and stretch the neck.");
        System.out.println("Treatments for jaw pain could be gently stretching, cold packs on the jaw as well as keeping your guard up.");
        System.out.println("Treatments include drinking cool liquids, gargling with salt water, and using humidifiers."); 
        System.out.println();
        System.out.println();       
      } 
      else if(t.equals("Fatigue"))
      {
        System.out.println("Information about symptom: ");
        System.out.println("Fatigue can result from mental health issues like depression, lack of sleep, stress, drugs such as steroids, antidepressants, and sedatives. As well as diseases such as Coronary Heart Disease.");
        System.out.println("To avoid fatigue you can exercise, sleep more, avoid actions that increase depression, and do activities that relax the mind like yoga.");
        System.out.println();
        System.out.println();
      }
      else if(t.equals("Dizziness"))
      {
        System.out.println("Information about symptom: ");
        System.out.println("Causes for dizziness could include migraines, infections, and vertigo which invokes a feeling of spinning.");
        System.out.println("It can also include Neurological conditions such as Parkinson's, Amnesia, multiple sclerosis, which provoke low iron levels, low blood sugar, dehydration, and Carbon-Monoxide poisoning which is a series of headaches, and dizziness.");
        System.out.println("Treatments could include physical therapy such as balance therapy, head position maneuvers like canalith repositioning which helps rid of vertigo quickly.");
        System.out.println("Anti-Anxiety drugs, water pills, and preventive migraine medicine.");
        System.out.println();
        System.out.println();
      }
      else if(t.equals("Heart rate"))
      {
        System.out.println("Information about symptom: ");
        System.out.println("Tachycardia (High heart rate) stem from stress, caffine, or too much excersise.");
        System.out.println("To prevent this, one could lower blood pressure using ACE inhibitors, beta-blockers, calcium channel blockers, and receptor blockers which lower blood pressure.");
        System.out.println("Calcium channel blockers and beta-blockers also slow down the heart rate along with antiarrhythmics which maintains heart rate.");
        System.out.println("Anticoagulants can also be used to stop the forming of blood clots, and water pills can help remove excess fluid to avoid rapid heart rates.");
        System.out.println();
        System.out.println();
      }
    }
 }