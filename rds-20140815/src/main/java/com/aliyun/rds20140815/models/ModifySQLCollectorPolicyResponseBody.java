// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySQLCollectorPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorPolicyResponseBody self = new ModifySQLCollectorPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySQLCollectorPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
