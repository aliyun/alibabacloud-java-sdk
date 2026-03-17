// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AssociateFlowLogResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A6E1680B-B34F-4BB7-B504-F8ED675E721C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateFlowLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateFlowLogResponseBody self = new AssociateFlowLogResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateFlowLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
