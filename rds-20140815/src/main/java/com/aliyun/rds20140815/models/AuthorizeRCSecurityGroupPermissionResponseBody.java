// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AuthorizeRCSecurityGroupPermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0688F1D2-CDA8-5617-A43C-ADAC61D80D43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeRCSecurityGroupPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRCSecurityGroupPermissionResponseBody self = new AuthorizeRCSecurityGroupPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeRCSecurityGroupPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
