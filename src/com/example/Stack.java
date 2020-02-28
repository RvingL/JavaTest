package com.example;

import character.Hero;

public interface Stack {

    void push(Hero hero);
    Hero pull();
    Hero peek();
}
