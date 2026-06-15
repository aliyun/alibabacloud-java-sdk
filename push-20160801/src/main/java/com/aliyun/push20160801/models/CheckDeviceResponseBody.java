// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckDeviceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the device is active.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Available")
    public Boolean available;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDeviceResponseBody self = new CheckDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDeviceResponseBody setAvailable(Boolean available) {
        this.available = available;
        return this;
    }
    public Boolean getAvailable() {
        return this.available;
    }

    public CheckDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
