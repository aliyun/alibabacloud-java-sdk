// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;Update:<em>&quot;, &quot;Effect&quot;: &quot;Allow&quot;,&quot;Principal&quot;: &quot;</em>&quot;,&quot;Resource&quot;: &quot;*&quot;}]}</p>
     */
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
