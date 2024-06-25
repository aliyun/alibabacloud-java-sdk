// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantAccountPrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantAccountPrivilegeResponseBody self = new GrantAccountPrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantAccountPrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
