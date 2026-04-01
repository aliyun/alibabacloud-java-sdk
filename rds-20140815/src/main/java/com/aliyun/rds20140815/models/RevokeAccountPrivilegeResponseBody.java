// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeAccountPrivilegeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E22099CA-A61E-4992-A0B7-CE82DC175626</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeAccountPrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeAccountPrivilegeResponseBody self = new RevokeAccountPrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeAccountPrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
