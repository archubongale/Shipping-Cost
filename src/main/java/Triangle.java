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

public class Triangle {

	private Integer mSide1;
	private Integer mSide2;
  private Integer mSide3;

  private String mEquilateralTriangle = "You created an Equilateral Triangle.";
  private String mIsoscelesTriangle ="You created an Isosceles Triangle.";
  private String mScaleneTriangle = "You created a Scalene Triangle.";


	public Triangle(Integer side1, Integer side2, Integer side3){
 		mSide1 = side1;
  	mSide2 = side2;
    mSide3 = side3;
		}

		public int getSide1() {
	  		return mSide1;
		}
		public int getSide2() {
	  		return mSide2;
		}
	  public int getSide3() {
	    	return mSide3;}

		public boolean isTriangle() {
	    return((mSide1 + mSide2) > mSide3 &&
	       (mSide2 + mSide3) > mSide1 &&
	        (mSide3 + mSide1) > mSide2);


		}

	  public String kindOfTriangle() {
	    if ((mSide1 == mSide2) && (mSide2 == mSide3 ) && (mSide3 == mSide1))
			{
	      return mEquilateralTriangle;
	    }
	    else if((mSide1 == mSide2 ) ||
	            (mSide2 == mSide3 ) ||
	            (mSide3 == mSide1))
      {
        return mIsoscelesTriangle;
      }
	    else
			{
	    	return mScaleneTriangle;
	  	}
		}
}
