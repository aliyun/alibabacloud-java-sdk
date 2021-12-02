// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateGlobalAccelerationInstanceResponseBody extends TeaModel {
    @NameInMap("GlobalAccelerationInstanceId")
    public String globalAccelerationInstanceId;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGlobalAccelerationInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalAccelerationInstanceResponseBody self = new CreateGlobalAccelerationInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGlobalAccelerationInstanceResponseBody setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
        this.globalAccelerationInstanceId = globalAccelerationInstanceId;
        return this;
    }
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    public CreateGlobalAccelerationInstanceResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public CreateGlobalAccelerationInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
