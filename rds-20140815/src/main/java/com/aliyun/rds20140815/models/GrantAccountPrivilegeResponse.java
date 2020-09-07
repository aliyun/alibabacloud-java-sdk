// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GrantAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantAccountPrivilegeResponse self = new GrantAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public GrantAccountPrivilegeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
