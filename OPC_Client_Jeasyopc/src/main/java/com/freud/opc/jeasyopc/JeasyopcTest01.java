package com.freud.opc.jeasyopc;

import javafish.clients.opc.JOpc;

/**
 * ���ӵ�OPC Server, ÿ��200����鿴һ��״̬��1����֮��ر�����
 * 
 * @author Freud
 * 
 */
public class JeasyopcTest01 {
	public static int iter = 0;

	public static void main(String[] args) throws Exception {

		JOpc.coInitialize();
		JOpc jopc = new JOpc("localhost", "Matrikon.OPC.Simulation",
				"JCustomOPC");

		jopc.connect();
		while (true) {
			Thread.sleep(200);
			System.out.println("Client is connected: " + jopc.ping());
			iter++;
			if (iter == 5) {
				break;
			}
		}
		JOpc.coUninitialize();
	}
}
