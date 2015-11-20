
package hernandez_3_mygame;
import java.util.Scanner;// used so can type stuff in

public class Hernandez_3_MYGame {
   static int useraction; //your options will be by typing in integers
    static boolean playagain; // to play again when you lose
    static int action; 
   
    public static void main(String[] args) {
      playagain=true;
        System.out.println("You have no arms.");
        System.out.println("What do you do now?");
        System.out.println("SCREAM?(1) TRY TO HIGH FIVE YOURSELF, REALIZE THAT'S NOT GOING TO HAPPEN, AND CRY?(2) SHRUG?(3) LAUUUGH!?(4)");
        Scanner userinput = new Scanner(System.in);
       useraction = userinput.nextInt();
       // type it in twice for confirmation
      
              
           
         
        
        while(playagain){ // so you can play again if you get a dead end
//           scream();
//            cry();
//            shrug();
             if(useraction == 1){
               scream();
               //for running method 1 of the game
           }
            else if(useraction == 2){
               cry();
               //for running method 2
           }
            else if(useraction == 3){
                shrug();
                //for running method 3
            }
            else if(useraction == 4){
                laugh();
                //for running method 4
            }
           
        }}
   private static void scream(){
       // option choice one
     Scanner userinput = new Scanner(System.in);
       useraction = userinput.nextInt(); // so you can type in your choice 
       System.out.println("This is an appropriate reaction. A small frog hops towards you, wanting to know what's wrong. What do you do?");
               System.out.println("DEVOUR THE FROG, SHOWING NO MERCY?(1) BECKON THE FROG TOWARDS YOURSELF?(2) STEP ON IT?(3) LAUGH LIKE THERE'S NO TOMORROW? (4)");
                useraction = userinput.nextInt(); 
               if(useraction == 1){ //for your next input 
                   System.out.println("You eat the frog and feel great about it. There is clearly something wrong with you. Your mother walkes in offering you tea, ignoring that your mouth is stuffed with frog.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now? ");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");   
                   useraction = userinput.nextInt(); // third input, should be last if player picks correctly
                   if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       //dead end, it starts you off from the beginning
                     
                }
                  else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! Try again from the beginning.");
                       playagain=true;
                       //dead end, it starts you off from the beginning
                   }
                   
                 else if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                      //good(ish) ending!
                  }
                   
                   
               }
               else if(useraction == 2){
                   System.out.println("You pet the frog. It likes you. Your mother walkes in offering you tea.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now? ");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)"); 
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   } 
                   else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                       //dead end, it starts you off from the beginning
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       //dead end, it starts you off from the beginning
                   }
               }
               else if(useraction ==3){
                   System.out.println("That's animal cruelty, you diry ape. The frog slaps you with its tounge. Your mother walkes in offering you tea.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now?");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                      //good ending
                       
                   }
                   else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                       //dead end, it starts you off from the beginning
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       //dead end, it starts you off from the beginning
                   }
               }
               else if(useraction == 4){
                   System.out.println("NOTHING ABOUT THIS IS FUNNY!Your mother walkes in offering you tea, ignoring your crazed laughter.");
                    System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now?");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");
                  useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   }
                    else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                       //dead end, it starts you off from the beginning
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       //dead end, it starts you off from the beginning
                       
                   }
                   
               }
       
        
    
            
        }
   private static void cry(){
       // first choice two
       Scanner userinput = new Scanner(System.in);
       useraction = userinput.nextInt();
       System.out.println("You should've know that wouldn't work, you weirdo. A small frog hops towards you, wanting to know what's wrong. What do you do?");
               System.out.println("DEVOUR THE FROG, SHOWING NO MERCY?(1) BECKON THE FROG TOWARDS YOURSELF?(2) STEP ON IT?(3) LAUGH LIKE THERE'S NO TOMORROW? (4)");
               useraction = userinput.nextInt(); 
               if(useraction == 1){
                System.out.println("You eat the frog and feel great about it. There is clearly something wrong with you. Your mother walkes in offering you tea, ignoring that your mouth is stuffed with frog.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now? ");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");   
                   useraction = userinput.nextInt(); 
                   if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                     
                }
                  else if(useraction == 2){
                       System.out.println("The tea tastes like... lilacs? You were poisoned! ");
                       playagain=true;
                   }
                   
                 else if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                  }
                   
                   
               }
               else if(useraction == 2){
                   System.out.println("You pet the frog. It likes you. Your mother walkes in offering you tea.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now? ");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)"); 
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   } 
                   else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                   }
               }
               else if(useraction ==3){
                   System.out.println("That's animal cruelty, you diry ape. The frog slaps you with its tounge. Your mother walkes in offering you tea.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now?");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   }
                   else if(useraction == 2){
                       System.out.println("The tea tastes like... lilacs? You were poisoned! ");
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       
                   }
               }
               else if(useraction == 4){
                   System.out.println("NOTHING ABOUT THIS IS FUNNY!Your mother walkes in offering you tea, ignoring your crazed laughter.");
                    System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now?");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   }
                    else if(useraction == 2){
                       System.out.println("The tea tastes like... lilacs? You were poisoned! ");
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       
                   }
                   
               }  
       
       
   }
   private static void shrug(){
       //for choice one option 3
       Scanner userinput = new Scanner(System.in);
       useraction = userinput.nextInt();
          System.out.println("Wow. Just wow. A small frog hops towards you, questioning your presence. What do you do?");
                System.out.println("You eat the frog and feel great about it. There is clearly something wrong with you. Your mother walkes in offering you tea, ignoring that your mouth is stuffed with frog.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now? ");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");   
                   useraction = userinput.nextInt(); 
                   if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                     
                }
                  else if(useraction == 2){
                       System.out.println("The tea tastes like... lilacs? You were poisoned! ");
                       playagain=true;
                   }
                   
                 else if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                  }
                   
                   
               
               else if(useraction == 2){
                   System.out.println("You pet the frog. It likes you. Your mother walkes in offering you tea.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now? ");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)"); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   } 
                   else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       //nightshade is a poisonous plant by the way
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                   }
               }
               else if(useraction ==3){
                   System.out.println("That's animal cruelty, you diry ape. The frog slaps you with its tounge. Your mother walkes in offering you tea.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now?");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   }
                   else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       
                   }
               }
               else if(useraction == 4){
                   System.out.println("NOTHING ABOUT THIS IS FUNNY!Your mother walkes in offering you tea, ignoring your crazed laughter.");
                    System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now?");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   }
                    else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       
                   }
                   else if(useraction == 2){
                   System.out.println("You pet the frog. It likes you. Your mother walkes in offering you tea.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now? ");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)"); 
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   } 
                   else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                   }
               }
               else if(useraction ==3){
                   System.out.println("That's animal cruelty, you diry ape. The frog slaps you with its tounge. Your mother walkes in offering you tea.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now?");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   }
                   else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       
                   }
               }
               else if(useraction == 4){
                   System.out.println("NOTHING ABOUT THIS IS FUNNY!Your mother walkes in offering you tea, ignoring your crazed laughter.");
                    System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now?");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   }
                    else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       
                   }
                   
               }
           }
       
   }
   private static void laugh(){
       //for choice 1 option 4
       Scanner userinput = new Scanner(System.in);
       useraction = userinput.nextInt();
                    System.out.println("Um... Calm down there, buddy. A small frog hops towards you, wondering what's so funny. What do you do?");
               System.out.println("DEVOUR THE FROG, SHOWING NO MERCY?(1) BECKON THE FROG TOWARDS YOURSELF?(2) STEP ON IT?(3) LAUGH LIKE THERE'S NO TOMORROW? (4)");
                useraction = userinput.nextInt(); 
               if(useraction == 1){
                   System.out.println("You eat the frog and feel great about it. There is clearly something wrong with you. Your mother walkes in offering you tea, ignoring that your mouth is stuffed with frog.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now? ");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");   
                   if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                     
                }
                  else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                   }
                   
                 else if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                  }
                   
                   
               }
               else if(useraction == 2){
                   System.out.println("You pet the frog. It likes you. Your mother walkes in offering you tea.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now? ");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)"); 
                  useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   } 
                   else if(useraction == 2){
                       System.out.println("The tea tastes like... nightshade? You were poisoned! ");
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                   }
               }
               else if(useraction ==3){
                   System.out.println("That's animal cruelty, you diry ape. The frog slaps you with its tounge. Your mother walkes in offering you tea.");
                   System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now?");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");
                  useraction = userinput.nextInt(); 
                   if(useraction == 1){
                      System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("Are you absolutely certain your reality is real?");
                      playagain=false;
                       
                   }
                   else if(useraction == 2){
                       System.out.println("The tea tastes like... lilacs? You were poisoned! ");
                       playagain=true;
                       
                   }
                   else if(useraction == 3){
                       System.out.println("You need Jesus. You automatically lose.");
                       playagain=true;
                       
                   }
                   
               }
             if(useraction == 4){
                 System.out.println("NOTHING ABOUT THIS IS FUNNY!Your mother walkes in offering you tea, ignoring your crazed laughter.");
                  System.out.println("She walks over to you and forcefully shoves the tea mug in your mouth. You look at her face. This isn't your mother. What do you do now? ");
                   System.out.println("HEAD-BUTT THE MANAICAL WITCH AND CRAWL AWAY LIKE AN INCHWORM?(1) DRINK THE TEA AND CRY?(2) SUMMON SATAN?(3)");   
                   useraction = userinput.nextInt(); 
                   if(useraction == 1){
                        System.out.println("You're too slow!");
                      System.out.println("She catches you. You kick her and finally manage to stand up. You make a run for it.");
                      System.out.println("She summons a trident and throws it at you. You feel the spear go through you.");
                      System.out.println("You wake up! It was all a bad dream!");
                      System.out.println("On the dresser beside you, an alarm clock is ringing. Will you turn it off?");
                      System.out.println("Your only option is yes. You try to reach over to turn the alarm clock off but...");
                      System.out.println("You still don't have any arms.");
                      System.out.println("You hear laughter in the hallway.... The laughter quickly turns to screaming. Footsteps approach your door.");
                      System.out.println("You hear a voice....");
                      System.out.println("Y o u  w e r e  n e v e r  a l i v e.");
                      System.out.println("Welcome to your permanent demise. You got what you deserved.");
                      playagain=false;
                      //bad ending only available inputing 4 for all options
                       
                       
                   }
                   
                   
             }
       
   }
   
        
    }
    

