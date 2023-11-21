// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the Express Connect circuit.</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionResponseBody self = new CreatePhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionResponseBody setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public CreatePhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
