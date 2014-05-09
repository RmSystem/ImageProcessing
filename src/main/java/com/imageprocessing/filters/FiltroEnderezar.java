package com.imageprocessing.filters;

import java.awt.Color;

public class FiltroEnderezar {
	
	public static double angle(int i,int j,int[][] pixel){
	    double angle = 0;
	    double num = 0;
	    double denom =0;
	    for(int x=0;x<i;x++){
	    	for(int y=0;y<j;y++){
	            try {
	                int gx = sobelOperatorX(x, y, pixel);
	                int gy = sobelOperatorY(x, y, pixel);
	                num += (2 * gx * gy);
	                denom +=((gx * gx) - (gy * gy));
	            } catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	        }
	    }
	    angle = 0.5 * Math.atan(num/denom);
	    return angle;
	}
	
	public static void rotate(javaxt.io.Image image,double angule)
	{
		image.rotate(angule * 10);
		image.setBackgroundColor(255, 255, 255);
		Color color  = image.getColor(0, 0);
		image.setColor(0, 0, color);
		
	}

	private static int sobelOperatorX(int x,int y,int[][] pixel){
	    int k=2;
	    int Gx=0;
	    Gx = (((pixel[x+1][y-1]+k*pixel[x+1][y]+pixel[x+1][y+1])-(pixel[x-1][y-1]+k*pixel[x-1][y]+pixel[x-1][y+1]))/(k+2));
	    return Gx;
	}

	private static int sobelOperatorY(int x,int y,int[][] pixel){
	    int k=2;
	    int Gy=0;
	    Gy = (((pixel[x-1][y-1]+k*pixel[x][y-1]+pixel[x+1][y-1])-(pixel[x-1][y+1]+k*pixel[x][y+1]+pixel[x+1][y+1]))/(k+2));
	    return Gy;
	}
}
