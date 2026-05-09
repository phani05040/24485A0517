class Logger 
{
    public static void Log(String stack,String level,String packageName,String message)
    {
        LogRequest request=new LogRequest(stack,level,packageName,message);
        String response=HttpService.post(Constants.LOG_API,request.toJson());
        System.out.println("\nThe Hisstory");
        System.out.println(request.toJson());
        System.out.println(response);
        System.out.println("\n This Si absolutely brought from the json query \n");
    }
}
