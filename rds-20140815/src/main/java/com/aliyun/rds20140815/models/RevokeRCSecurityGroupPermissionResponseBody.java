// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeRCSecurityGroupPermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
     */
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
