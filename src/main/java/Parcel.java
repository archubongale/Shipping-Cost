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

public class Parcel{

	private Integer mheight;
	private Integer mwidth;
  private Integer mlength;
	private Integer mzipCodeFrom, mzipCodeTo;
	private Integer mweigth;

  //private String mEquilateralTriangle = "You created an Equilateral Triangle.";

	public Dimensions(Integer height, Integer width, Integer length){
 		mHeight = height;
  	mWidth = width;
    mLength = length;
		}

		public int getHeight() {
	  		return mHeight;
		}
		public int getWidth() {
	  		return mWidth;
		}
	  public int getLength() {
	    	return mLength;}

		public Integer Volume(){
			return (length*width*height);
		}

		public Integer costOfShipping()

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
