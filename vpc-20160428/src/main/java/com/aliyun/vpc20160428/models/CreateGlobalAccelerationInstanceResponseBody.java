// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateGlobalAccelerationInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("GlobalAccelerationInstanceId")
    public String globalAccelerationInstanceId;

    public static CreateGlobalAccelerationInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalAccelerationInstanceResponseBody self = new CreateGlobalAccelerationInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGlobalAccelerationInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGlobalAccelerationInstanceResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public CreateGlobalAccelerationInstanceResponseBody setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
        this.globalAccelerationInstanceId = globalAccelerationInstanceId;
        return this;
    }
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

}
