// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteDeviceCertificateResponseBody extends TeaModel {
    /**
     * <p>The serial number of the device certificate whose registration information is deleted. The serial number is the unique identifier of a device certificate.</p>
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
