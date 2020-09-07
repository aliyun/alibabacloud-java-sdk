// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifySQLCollectorPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorPolicyResponse self = new ModifySQLCollectorPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifySQLCollectorPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
