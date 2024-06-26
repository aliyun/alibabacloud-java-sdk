// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3845BDF5-15A6-4444-B770-78501819****</p>
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
