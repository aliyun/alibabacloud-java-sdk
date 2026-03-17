// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AssociateACLResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C9A75915-0260-4335-851A-D866A7ED396C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateACLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateACLResponseBody self = new AssociateACLResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateACLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
