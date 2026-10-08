// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeRCSecurityGroupPermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeRCSecurityGroupPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeRCSecurityGroupPermissionResponseBody self = new RevokeRCSecurityGroupPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeRCSecurityGroupPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
