package com.freud.opc.jeasyopc;

import javafish.clients.opc.browser.JOpcBrowser;

/**
 * ����ĳServer�µ�����OPC server����
 * 
 * @author Freud
 * 
 */
public class JeasyopcTest03 {

	public static void main(String[] args) throws Exception {

		JOpcBrowser.coInitialize();

		String[] opcServers = JOpcBrowser.getOpcServers("localhost");
		System.out.println("------------List All Servers------------");
		for (String server : opcServers) {
			System.out.println("[server]:" + server);
		}

		// uninitialize COM components
		JOpcBrowser.coUninitialize();
	}
}
