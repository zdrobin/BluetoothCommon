package com.inuker.library.search.le;

import com.inuker.library.search.BluetoothSearchRequest;

public class BluetoothLeSearchRequest extends BluetoothSearchRequest {

	private BluetoothLeSearchRequest() {

	}

	public static BluetoothSearchRequest newInstance() {
		BluetoothSearchRequest request = new BluetoothSearchRequest.Builder()
				.searchBluetoothLeDevice().build();
		return request;
	}

	public static BluetoothSearchRequest newInstance(int duration) {
		BluetoothSearchRequest request = new BluetoothSearchRequest.Builder()
				.searchBluetoothLeDevice(duration).build();
		return request;
	}
}
