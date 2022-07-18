// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ActiveDeviceCertificateResponseBody extends TeaModel {
    @NameInMap("DeviceSn")
    public String deviceSn;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ActiveDeviceCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveDeviceCertificateResponseBody self = new ActiveDeviceCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveDeviceCertificateResponseBody setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public ActiveDeviceCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
