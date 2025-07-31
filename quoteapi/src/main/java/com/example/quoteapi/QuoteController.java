package com.example.quoteapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    // A hardcoded list of quotes. No database needed!
    private final List<String> quotes = List.of(
        "The only way to do great work is to love what you do.",
        "The purpose of our lives is to be happy.",
        "Get busy living or get busy dying.",
        "You only live once, but if you do it right, once is enough.",
        "Life is what happens when you're busy making other plans.",
        "The future belongs to those who believe in the beauty of their dreams.",
        "It is never too late to be what you might have been.",
        "The only thing we have to fear is fear itself.",
        "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.",
        "In three words I can sum up everything I've learned about life: it goes on.",
        "If you want to live a happy life, tie it to a goal, not to people or things.",
        "Strive not to be a success, but rather to be of value.",
        "The best way to predict the future is to create it.",
        "You miss 100% of the shots you don't take.",
        "Whether you think you can or you think you can't, you're right.",
        "I have not failed. I've just found 10,000 ways that won't work.",
        "A person who never made a mistake never tried anything new.",
        "The journey of a thousand miles begins with a single step.",
        "That which does not kill us makes us stronger.",
        "The greatest glory in living lies not in never falling, but in rising every time we fall.",
        "The way to get started is to quit talking and begin doing.",
        "Your time is limited, so don't waste it living someone else's life.",
        "If life were predictable it would cease to be life, and be without flavor.",
        "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough.",
        "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success.",
        "Life is either a daring adventure or nothing at all.",
        "Many of life's failures are people who did not realize how close they were to success when they gave up.",
        "You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose.",
        "The only impossible journey is the one you never begin.",
        "In the end, it's not the years in your life that count. It's the life in your years.",
        "Life is a succession of lessons which must be lived to be understood.",
        "Go confidently in the direction of your dreams! Live the life you've imagined.",
        "The two most important days in your life are the day you are born and the day you find out why.",
        "Keep smiling, because life is a beautiful thing and there's so much to smile about.",
        "Success is not final, failure is not fatal: it is the courage to continue that counts.",
        "Never let the fear of striking out keep you from playing the game.",
        "Life is really simple, but we insist on making it complicated.",
        "The secret of success is to do the common thing uncommonly well.",
        "I find that the harder I work, the more luck I seem to have.",
        "Don't be afraid to give up the good to go for the great.",
        "There are no secrets to success. It is the result of preparation, hard work, and learning from failure.",
        "The only limit to our realization of tomorrow will be our doubts of today.",
        "What you get by achieving your goals is not as important as what you become by achieving your goals.",
        "It does not matter how slowly you go as long as you do not stop.",
        "Everything you’ve ever wanted is on the other side of fear.",
        "Believe you can and you're halfway there.",
        "Act as if what you do makes a difference. It does.",
        "The mind is everything. What you think you become."
    );

    private final Random random = new Random();

    // This method will run when someone visits http://localhost:8080/api/quote
    @GetMapping("/api/quote")
    @CrossOrigin(origins = "http://localhost:3000") // IMPORTANT: Allows our React app to call this API
    public String getRandomQuote() {
        // Return a random quote from our list
        return quotes.get(random.nextInt(quotes.size()));
    }
}
