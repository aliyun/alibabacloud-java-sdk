// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class GetStackPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static GetStackPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackPolicyResponse self = new GetStackPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetStackPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
