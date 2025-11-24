// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GrantUserPermissionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A7C9E37-C171-584F-9A99-869B48C4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantUserPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionsResponseBody self = new GrantUserPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
