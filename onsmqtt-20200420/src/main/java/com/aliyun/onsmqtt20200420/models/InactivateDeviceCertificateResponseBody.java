// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class InactivateDeviceCertificateResponseBody extends TeaModel {
    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("RequestId")
    public String requestId;

    public static InactivateDeviceCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InactivateDeviceCertificateResponseBody self = new InactivateDeviceCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public InactivateDeviceCertificateResponseBody setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public InactivateDeviceCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
