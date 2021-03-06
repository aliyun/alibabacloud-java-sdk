// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackPolicyBody")
    public java.util.Map<String, ?> stackPolicyBody;

    public static GetStackPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackPolicyResponseBody self = new GetStackPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackPolicyResponseBody setStackPolicyBody(java.util.Map<String, ?> stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public java.util.Map<String, ?> getStackPolicyBody() {
        return this.stackPolicyBody;
    }

}
