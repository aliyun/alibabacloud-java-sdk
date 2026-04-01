// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1D3D5995-6BDD-43B5-93B8-2C41A2ACD6AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloneParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneParameterGroupResponseBody self = new CloneParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
