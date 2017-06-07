package br.com.example.kallebchat;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static android.content.ContentValues.TAG;

/**
 * Created by gadiel-kalleb on 08/04/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public  void onMessageReceived(RemoteMessage remoteMessage){

        /* TODO(developer): Handle FCM messages here.
        // Se o aplicativo estiver no primeiro plano, manipule dados e mensagens de notificação aqui.
        // Além disso, se você pretende gerar suas próprias notificações como resultado de uma FCM recebida
        // mensagem, aqui é onde isso deve ser iniciado. Veja o método sendNotification abaixo.*/
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        Log.d(TAG, "Notification Message Body: " + remoteMessage.getNotification().getBody());
    }
}

