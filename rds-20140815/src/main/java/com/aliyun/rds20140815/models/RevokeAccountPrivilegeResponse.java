// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeAccountPrivilegeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RevokeAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeAccountPrivilegeResponse self = new RevokeAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public RevokeAccountPrivilegeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
