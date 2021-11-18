package com.haseeb;

import java.io.IOException;
import javax.enterprise.context.RequestScoped;
// import io.smallrye.common.annotation.NonBlocking;

import io.smallrye.common.annotation.NonBlocking;
// @NonBlocking
@RequestScoped
public class Repository 
{
    public void callBlockingCode() throws IOException
    {       
         System.out.println("Starting........");
 
         int result;
         result = System.in.read();
         System.out.println("Ending.........");
    }
}
