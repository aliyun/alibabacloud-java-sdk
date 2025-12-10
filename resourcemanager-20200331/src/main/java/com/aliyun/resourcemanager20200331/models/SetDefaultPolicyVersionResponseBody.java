// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SetDefaultPolicyVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultPolicyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultPolicyVersionResponseBody self = new SetDefaultPolicyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultPolicyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
