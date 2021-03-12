// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class InitializeASMRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InitializeASMRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeASMRoleResponseBody self = new InitializeASMRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeASMRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
