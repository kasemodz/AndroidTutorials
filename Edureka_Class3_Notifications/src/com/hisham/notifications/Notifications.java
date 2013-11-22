package com.hisham.notifications;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Notifications extends Activity {

	Button btnNotification;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notifications);

		btnNotification = (Button) findViewById(R.id.btnGenerateNotifications);
		btnNotification.setOnClickListener(new OnClickListener() {

			@TargetApi(16)
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// Prepare intent which is triggered if the
				// notification is selected
				Intent intent = new Intent(Notifications.this,
						NotificationClickedActivity.class);
				PendingIntent pendIntent = PendingIntent.getActivity(
						Notifications.this, 0, intent, 0);

				// String mail = "Why Learn Android? "
				// +
				// "Android is fast becoming one of the biggest platforms for programmers today. "
				// +
				// "There is a huge demand for skilled Android Developers all over the world. "
				// +
				// "Most businesses across multiple domains are building Android Apps both for enterprise and retail products. "
				// + "Whether you are student or in the IT industry, "
				// +
				// "possessing Android Development skills will help you take the next big leap in your career.";

				// Build notification
				// Actions are just fake
				Notification notiMail = new Notification.Builder(
						Notifications.this)
						.setContentTitle("support@edureka.in")
						.setContentText("Subject - Android Class")
						.setSmallIcon(R.drawable.ic_launcher)
						.setContentIntent(pendIntent).setAutoCancel(true)
						// Uncomment the below lines to see a different style of
						// notification
						// .setStyle(new
						// Notification.BigTextStyle().bigText(mail))
						// .addAction(R.drawable.ic_launcher,
						// "Join Edureka",pendIntent)
						.build();

				NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
				/*
				 * // Another way to Hide the notification after its selected
				 * notiMail.flags = Notification.FLAG_AUTO_CANCEL;
				 */

				notificationManager.notify(0, notiMail);

			}
		});
	}

	// @Override
	// protected void onPause() {
	// // TODO Auto-generated method stub
	// super.onPause();
	//
	// //finish();
	// }

}
