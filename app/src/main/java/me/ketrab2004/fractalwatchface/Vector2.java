package me.ketrab2004.fractalwatchface;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class Vector2 {
    public float x, y, angle;
    public Vector2(float x, float y, @Nullable Float angle){
        this.x = x;
        this.y = y;

        if (angle != null){
            this.angle = angle;
        }
    }

    @Override
    public String toString() {
        return "("+ this.x + ", "+ this.y+")";
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2 vector2 = (Vector2) o;
        return x == vector2.x &&
                y == vector2.y;
    } */


    public void multiplyFloat(float a){
        this.x *= a;
        this.y *= a;
    }

    public void addVector2(@NotNull Vector2 a){
        this.x += a.x;
        this.y += a.y;
    }

    public void fromAngleDegrees(float a){
        a *= 0.0174532925f; //degrees to radians
        this.x = (float) Math.sin(a);
        this.y = (float) -Math.cos(a);
        this.angle = a;
    }
}
