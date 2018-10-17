package week5_6;

import week5_6.Layer;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> layers;

    public Diagram(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public Diagram() {
        this.layers = new ArrayList<>();
    }

    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void setLayers(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public void addLayer(Layer layer) {
        this.layers.add(layer);
    }

    public void removeTriangle() {
        for (Layer layer : layers) {
            layer.removeTriangle();
        }
    }

    public void removeCircle() {
        for (Layer layer : layers) {
            layer.removeCircle();
        }
    }
    public void printLayers() {
        for (Layer layer : layers) {
            System.out.println("Layer: ");
            layer.printShapes();
        }
    }}
