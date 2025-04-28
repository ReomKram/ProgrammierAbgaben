import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StoryGame {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
    private static StringBuilder currentStory = new StringBuilder();
    private static List<String> storyContext = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Dynamic Story Game!");
        System.out.println("------------------------------------");
        
        boolean playAgain = true;
        while (playAgain) {
            currentStory = new StringBuilder();
            storyContext.clear();
            playStory();
            saveStory();
            System.out.println("\nWould you like to play again? (yes/no)");
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("yes");
        }
        
        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static void playStory() {
        // Generate dynamic opening
        String opening = generateDynamicOpening();
        currentStory.append(opening).append("\n");
        storyContext.add(opening);
        System.out.println("\n" + opening);
        
        // Generate dynamic story setup
        String setup = generateDynamicSetup();
        currentStory.append(setup).append("\n");
        storyContext.add(setup);
        System.out.println(setup);
        
        // Generate and present dynamic prompts
        String[] prompts = generateDynamicPrompts();
        int choice = getChoice(prompts);
        handleChoice(choice, prompts);
    }

    private static String generateDynamicOpening() {
        String[] timePhrases = {
            "In a time long forgotten",
            "When the stars aligned",
            "During the age of wonders",
            "In an era of great change",
            "When magic still flowed freely",
            "In the days of ancient kingdoms"
        };
        
        String[] settingPhrases = {
            "where legends were born",
            "when heroes walked the earth",
            "amidst great turmoil",
            "in lands unknown",
            "where destiny was written",
            "in a world of endless possibilities"
        };
        
        return timePhrases[random.nextInt(timePhrases.length)] + ", " + 
               settingPhrases[random.nextInt(settingPhrases.length)] + "...";
    }

    private static String generateDynamicSetup() {
        String[] characterTypes = {
            "A wandering scholar", "A mysterious traveler", "A forgotten hero",
            "An exiled noble", "A cursed warrior", "A lost soul",
            "A child of prophecy", "A master of ancient arts"
        };
        
        String[] characterTraits = {
            "with a heart of gold", "bearing a heavy burden",
            "seeking redemption", "driven by destiny",
            "haunted by the past", "yearning for adventure"
        };
        
        String[] locations = {
            "the Whispering Woods", "the Crystal Peaks",
            "the Forgotten Ruins", "the Eternal City",
            "the Shadow Vale", "the Starfall Plains"
        };
        
        String[] quests = {
            "to uncover a long-lost truth",
            "to break an ancient curse",
            "to find the key to salvation",
            "to restore balance to the world",
            "to fulfill an ancient prophecy",
            "to discover their true purpose"
        };
        
        return characterTypes[random.nextInt(characterTypes.length)] + " " +
               characterTraits[random.nextInt(characterTraits.length)] + " " +
               "journeyed to " + locations[random.nextInt(locations.length)] + " " +
               quests[random.nextInt(quests.length)] + ".";
    }

    private static String[] generateDynamicPrompts() {
        String[] promptStructures = {
            "Face the challenge of %s",
            "Seek wisdom from %s",
            "Uncover the secrets of %s"
        };
        
        String[] challenges = {
            "the ancient guardian", "the whispering winds",
            "the shadow that follows", "the forgotten temple",
            "the crystal maze", "the time-worn path"
        };
        
        String[] sources = {
            "the wise old hermit", "the ancient texts",
            "the spirits of the past", "the stars above",
            "the voice within", "the echoes of time"
        };
        
        String[] secrets = {
            "the lost civilization", "the forbidden knowledge",
            "the hidden power", "the true nature",
            "the ancient prophecy", "the forgotten truth"
        };
        
        String[] prompts = new String[3];
        for (int i = 0; i < 3; i++) {
            String structure = promptStructures[i];
            String content = switch (i) {
                case 0 -> challenges[random.nextInt(challenges.length)];
                case 1 -> sources[random.nextInt(sources.length)];
                case 2 -> secrets[random.nextInt(secrets.length)];
                default -> "";
            };
            prompts[i] = String.format(structure, content);
        }
        
        return prompts;
    }

    private static int getChoice(String[] prompts) {
        System.out.println("\nWhat will you do?");
        for (int i = 0; i < prompts.length; i++) {
            System.out.println((i + 1) + ". " + prompts[i]);
        }
        
        int choice = 0;
        while (choice < 1 || choice > prompts.length) {
            System.out.print("Enter your choice (1-" + prompts.length + "): ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > prompts.length) {
                    System.out.println("Please enter a number between 1 and " + prompts.length + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return choice;
    }

    private static void handleChoice(int choice, String[] prompts) {
        currentStory.append("\nChoice: ").append(prompts[choice - 1]).append("\n");
        storyContext.add("Choice made: " + prompts[choice - 1]);
        
        String outcome = generateDynamicOutcome();
        currentStory.append("Outcome: ").append(outcome).append("\n");
        storyContext.add("Outcome: " + outcome);
        System.out.println("\n" + outcome);
        
        String continuation = generateDynamicContinuation();
        currentStory.append("Continuation: ").append(continuation).append("\n");
        storyContext.add("Continuation: " + continuation);
        System.out.println(continuation);
    }

    private static String generateDynamicOutcome() {
        String[] outcomes = {
            "A mysterious figure emerges from the shadows, offering guidance",
            "The ground trembles as ancient magic awakens",
            "A forgotten memory surfaces, revealing a crucial clue",
            "The winds carry whispers of a long-lost prophecy",
            "A hidden path reveals itself, bathed in ethereal light",
            "The stars align, showing the way forward"
        };
        
        return outcomes[random.nextInt(outcomes.length)];
    }

    private static String generateDynamicContinuation() {
        String[] continuations = {
            "The journey takes an unexpected turn as new mysteries unfold",
            "Ancient forces stir, responding to your actions",
            "The path ahead splits into multiple possibilities",
            "A new chapter begins, filled with both danger and hope",
            "The story weaves itself into a more complex tapestry",
            "Destiny's threads intertwine in unexpected ways"
        };
        
        return continuations[random.nextInt(continuations.length)];
    }

    private static void saveStory() {
        String timestamp = LocalDateTime.now().format(formatter);
        String filename = "story_" + timestamp + ".txt";
        
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(currentStory.toString());
            System.out.println("\nYour story has been saved to: " + filename);
        } catch (IOException e) {
            System.out.println("Error saving the story: " + e.getMessage());
        }
    }
} 