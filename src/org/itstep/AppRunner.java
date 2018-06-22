package org.itstep;

import java.util.ArrayList;
import java.util.Arrays;

import org.itstep.Controller;
import org.itstep.Model;
import org.itstep.View;

public class AppRunner {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList(Arrays.asList(1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 6, 9));
		Model model = new Model(6, list);
		View view = new View();
		Controller controller = new Controller(view, model);

		controller.getElementOfArray();
	}
}
