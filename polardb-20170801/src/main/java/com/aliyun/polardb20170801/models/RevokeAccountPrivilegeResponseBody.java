// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RevokeAccountPrivilegeResponseBody extends TeaModel {
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
