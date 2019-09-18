Scanner keyboard = new Scanner(System.in);
        int enemyChoicePlaceholder = (int) (3 *Math.random()) + 1;
        char enemyChoice;
        int enemyScore = 0;
        int playerScore = 0; 
        
        if(enemyChoicePlaceholder == 1){
            enemyChoice = 'P';
        }
        else if (enemyChoicePlaceholder == 2){
            enemyChoice = 'S';
        }
        else{
            enemyChoice = 'R';
        }
        
        while(true){
        System.out.println("Choose between R/P/S: ");
        String playerChoice = keyboard.nextLine();
        char myChoice = playerChoice.charAt(0);
        myChoice = Character.toUpperCase(myChoice);
               
        System.out.println("Player Choice: " + myChoice + "\nEnemy Choice: " +enemyChoice);
        
        if(myChoice == 'R'){
            if(enemyChoice == 'S'){
                System.out.println("Enemy: I chose Scissors and you chose Rock so you win!");
                playerScore = playerScore + 1;
                System.out.println("Player Score: " + playerScore + "\nEnemy Score: "+ enemyScore);
            }else if(enemyChoice == 'P'){
                System.out.println("Enemy: I chose Papers and you chose Rock so I win!");
                enemyScore++;
                System.out.println("Player Score: " + playerScore + "\nEnemy Score: "+ enemyScore);
            }else if(myChoice == enemyChoice){
                System.out.println("Draw!");
            }
        }
        
        if(myChoice == 'P'){
            if(enemyChoice == 'R'){
                System.out.println("Enemy: I chose Rock and you chose Paper so you win!");
                playerScore = playerScore + 1;
                System.out.println("Player Score: " + playerScore + "\nEnemy Score: "+ enemyScore);
            }else if(enemyChoice == 'S'){
                System.out.println("Enemy: I chose Scissors and you chose Paper so I win!");
                enemyScore++;
                System.out.println("Player Score: " + playerScore + "\nEnemy Score: "+ enemyScore);
            }else if(myChoice == enemyChoice){
                System.out.println("Draw!");
            }
        }
        
        if(myChoice == 'S'){
            if(enemyChoice == 'P'){
                System.out.println("Enemy: I chose Paper and you chose Scissors so you win!");
                playerScore = playerScore + 1;
                System.out.println("Player Score: " + playerScore + "\nEnemy Score: "+ enemyScore);
            }else if(enemyChoice == 'R'){
                System.out.println("Enemy: I chose Rock and you chose Scissors so I win!");
                enemyScore = enemyScore + 1;
                System.out.println("Player Score: " + playerScore + "\nEnemy Score: "+ enemyScore);
            }else if(myChoice == enemyChoice){
                System.out.println("Draw!");
            }
        }
        
        if(playerScore >=5){
            System.out.println("Player Wins!");
            System.out.println("Player Score: " + playerScore + "\nEnemy Score: " + enemyScore);
            break;
        }
        else if(enemyScore >=5){
            System.out.println("Enemy Wins!");
            System.out.println("Enemy Score: " + enemyScore + "\nPlayer Score: " + playerScore);
            break;
        }
            System.out.println("Try again? (Y/N)");
            String again = keyboard.nextLine();
            char decision = again.charAt(0);
            decision = Character.toUpperCase(decision);
            
            if(decision == 'N'){
                break;
            }
    }