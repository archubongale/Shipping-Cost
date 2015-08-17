import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.out;
import java.lang.*;

import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;

import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

	public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "/templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      model.put("template", "/templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/triangle", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
			model.put("template", "/templates/triangle.vtl");

			String side1 = request.queryParams("side1");
			Integer integerSide1 = Integer.parseInt(side1);

			String side2 = request.queryParams("side2");
			Integer integerSide2 = Integer.parseInt(side2);

			String side3 = request.queryParams("side3");
			Integer integerSide3 = Integer.parseInt(side3);

      Triangle myTriangle = new Triangle(integerSide1, integerSide2, integerSide3);

      model.put("myTriangle", myTriangle);


      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
