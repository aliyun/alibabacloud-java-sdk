// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteDeviceCertificateResponseBody extends TeaModel {
    @NameInMap("DeviceSn")
    public String deviceSn;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeviceCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceCertificateResponseBody self = new DeleteDeviceCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceCertificateResponseBody setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public DeleteDeviceCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
