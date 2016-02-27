package hello;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by devmaany on 26/2/16.
 */
public class TrackData {
    private List positions;
    private List parameters;
    public List getPositions() {
        return positions;
    }

    public void setPositions(List positions) {
        this.positions = positions;
    }

    public List getParameters() {
        return parameters;
    }

    public void setParameters(List parameters) {
        this.parameters = parameters;
    }
}
/*class Position{
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}*/
