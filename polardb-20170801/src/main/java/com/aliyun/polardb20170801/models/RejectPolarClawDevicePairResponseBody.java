// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RejectPolarClawDevicePairResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>device-784x37k0vko734fk</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>req-abc-123</p>
     */
    @NameInMap("PairRequestId")
    public String pairRequestId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RejectPolarClawDevicePairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RejectPolarClawDevicePairResponseBody self = new RejectPolarClawDevicePairResponseBody();
        return TeaModel.build(map, self);
    }

    public RejectPolarClawDevicePairResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RejectPolarClawDevicePairResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RejectPolarClawDevicePairResponseBody setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RejectPolarClawDevicePairResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RejectPolarClawDevicePairResponseBody setPairRequestId(String pairRequestId) {
        this.pairRequestId = pairRequestId;
        return this;
    }
    public String getPairRequestId() {
        return this.pairRequestId;
    }

    public RejectPolarClawDevicePairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
