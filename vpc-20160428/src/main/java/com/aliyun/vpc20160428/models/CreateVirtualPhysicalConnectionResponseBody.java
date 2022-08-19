// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualPhysicalConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VirtualPhysicalConnection")
    public String virtualPhysicalConnection;

    public static CreateVirtualPhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualPhysicalConnectionResponseBody self = new CreateVirtualPhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualPhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirtualPhysicalConnectionResponseBody setVirtualPhysicalConnection(String virtualPhysicalConnection) {
        this.virtualPhysicalConnection = virtualPhysicalConnection;
        return this;
    }
    public String getVirtualPhysicalConnection() {
        return this.virtualPhysicalConnection;
    }

}
