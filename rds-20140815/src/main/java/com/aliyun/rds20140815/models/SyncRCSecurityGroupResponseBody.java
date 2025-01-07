// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SyncRCSecurityGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>300333A0-68E5-59CE-94AD-75153D17639E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SyncRCSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncRCSecurityGroupResponseBody self = new SyncRCSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncRCSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
