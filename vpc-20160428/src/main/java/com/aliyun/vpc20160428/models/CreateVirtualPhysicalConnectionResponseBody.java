// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualPhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD14EA74-E9C3-59A9-942A-DFEC7E12818D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the hosted connection.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1mrgfbtmc9brre7****</p>
     */
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
