// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AttachVbrToVpconnResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the hosted connection.</p>
     */
    @NameInMap("VirtualPhysicalConnection")
    public String virtualPhysicalConnection;

    public static AttachVbrToVpconnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachVbrToVpconnResponseBody self = new AttachVbrToVpconnResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachVbrToVpconnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachVbrToVpconnResponseBody setVirtualPhysicalConnection(String virtualPhysicalConnection) {
        this.virtualPhysicalConnection = virtualPhysicalConnection;
        return this;
    }
    public String getVirtualPhysicalConnection() {
        return this.virtualPhysicalConnection;
    }

}
