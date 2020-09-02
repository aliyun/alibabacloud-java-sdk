// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateGlobalAccelerationInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GlobalAccelerationInstanceId")
    @Validation(required = true)
    public String globalAccelerationInstanceId;

    @NameInMap("IpAddress")
    @Validation(required = true)
    public String ipAddress;

    public static CreateGlobalAccelerationInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalAccelerationInstanceResponse self = new CreateGlobalAccelerationInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGlobalAccelerationInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGlobalAccelerationInstanceResponse setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
        this.globalAccelerationInstanceId = globalAccelerationInstanceId;
        return this;
    }
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    public CreateGlobalAccelerationInstanceResponse setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

}
