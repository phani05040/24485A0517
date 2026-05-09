class LogRequest
{
    private String stack;
    private String level;
    private String packageName;
    private String message;
    public LogRequest(String stack,String level,String packageName,String message)
    {
        this.stack = stack;
        this.level = level;
        this.packageName = packageName;
        this.message = message;
    }
    public String toJson() 
    {
        return "{"
                + "\"stack\":\"" + stack + "\","
                + "\"level\":\"" + level + "\","
                + "\"package\":\"" + packageName + "\","
                + "\"message\":\"" + message + "\""
                + "}";
    }
}
