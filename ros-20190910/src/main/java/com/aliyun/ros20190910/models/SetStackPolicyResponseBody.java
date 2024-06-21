// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetStackPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetStackPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetStackPolicyResponseBody self = new SetStackPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetStackPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
