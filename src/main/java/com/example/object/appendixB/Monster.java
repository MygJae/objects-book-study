package com.example.object.appendixB;

public class Monster implements Collidable {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean collideWith(Collidable other) {
        return false;
    }

    @Override
    public Point getPosition() {
        return null;
    }

    @Override
    public void update(Graphics graphics) {
    }
}
