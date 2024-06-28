// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpconnFromVbrResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5356F028-0F5C-56FC-8574-897D24379041</p>
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

    public static CreateVpconnFromVbrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpconnFromVbrResponseBody self = new CreateVpconnFromVbrResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpconnFromVbrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpconnFromVbrResponseBody setVirtualPhysicalConnection(String virtualPhysicalConnection) {
        this.virtualPhysicalConnection = virtualPhysicalConnection;
        return this;
    }
    public String getVirtualPhysicalConnection() {
        return this.virtualPhysicalConnection;
    }

}
