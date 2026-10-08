// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SyncRCSecurityGroupResponseBody extends TeaModel {
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
