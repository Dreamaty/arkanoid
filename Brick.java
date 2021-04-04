package com.javarush.task.task24.task2413;

/**
 * Класс для объекта "кирпич".
 */
public class Brick extends BaseObject {
    //picture to draw
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    public Brick(double x, double y) {
        super(x, y, 3);
    }

    /**
     * Draw itself on canvas
     */
    @Override
    void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'H');
    }

    /**
     * Nothing
     */
    @Override
    void move() {
        //do nothing
    }
}
