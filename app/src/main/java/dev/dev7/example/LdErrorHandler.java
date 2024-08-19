package dev.dev7.example;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class LdErrorHandler implements Thread.UncaughtExceptionHandler {

    private Context context;

    public LdErrorHandler(Context context) {
        this.context = context;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        // Log the exception or send it to a server
        Log.e("MyExceptionHandler", "Uncaught exception: ", ex);

        // Create an intent to start the ErrorActivity
        Intent intent = new Intent(context, LdErrorActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.putExtra("error_message", ex.getMessage());
        context.startActivity(intent);

        // Exit the application
       android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
