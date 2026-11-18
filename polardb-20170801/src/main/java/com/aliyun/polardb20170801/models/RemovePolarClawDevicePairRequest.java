// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemovePolarClawDevicePairRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the paired device to be removed. The physical device must first initiate pairing through the PolarClaw mobile app and be approved by calling ApprovePolarClawDevicePair. After approval, the device is added to the paired device list returned by ListPolarClawDevicePairs, from which you can obtain the DeviceId. Pairing initiation cannot be completed solely through API calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device-mac-789</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    public static RemovePolarClawDevicePairRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePolarClawDevicePairRequest self = new RemovePolarClawDevicePairRequest();
        return TeaModel.build(map, self);
    }

    public RemovePolarClawDevicePairRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RemovePolarClawDevicePairRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
