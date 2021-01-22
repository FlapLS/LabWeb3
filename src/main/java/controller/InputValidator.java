package controller;

import model.Point;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.Arrays;
import java.util.List;

public class InputValidator {
	private static final List<Integer> rValues = Arrays.asList(1,2,3,4,5);

	public static boolean isPointValid(Point point) {
		return isXValid(point.getX()) &&
				isYValid(point.getY()) &&
				isRValid(point.getR())
				;
	}
	
	public static boolean isYValid(double y) {
		return y > -3 &&
				y < 5;
	}
	
	public static boolean isRValid(Integer r) {
		return rValues.contains(r) && r !=null;
	}
	
	public static boolean isXValid(Double x) {
		return x != null;
	}
}

