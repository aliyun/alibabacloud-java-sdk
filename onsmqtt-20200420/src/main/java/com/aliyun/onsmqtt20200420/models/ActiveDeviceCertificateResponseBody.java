// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ActiveDeviceCertificateResponseBody extends TeaModel {
    /**
     * <p>The serial number of the device certificate that you reactivated. The serial number is the unique identifier of a device certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>356217374433******</p>
     */
    @NameInMap("DeviceSn")
    public String deviceSn;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
     */
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
