// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackPolicyBody")
    @Validation(required = true)
    public java.util.Map<String, ?> stackPolicyBody;

    public static GetStackPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackPolicyResponse self = new GetStackPolicyResponse();
        return TeaModel.build(map, self);
    }

}
