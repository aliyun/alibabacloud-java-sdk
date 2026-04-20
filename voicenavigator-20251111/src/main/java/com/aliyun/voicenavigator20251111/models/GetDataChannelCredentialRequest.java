// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetDataChannelCredentialRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>d4c38420-<strong><strong>-43bc-b001-56bfc274</strong></strong></p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <strong>example:</strong>
     * <p>c28fc549-d88f-4f6e-85ad-a0806e5e39c0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDataChannelCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataChannelCredentialRequest self = new GetDataChannelCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetDataChannelCredentialRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDataChannelCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
