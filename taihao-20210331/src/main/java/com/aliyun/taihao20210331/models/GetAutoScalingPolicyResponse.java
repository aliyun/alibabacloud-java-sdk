// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetAutoScalingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAutoScalingPolicyResponseBody body;

    public static GetAutoScalingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingPolicyResponse self = new GetAutoScalingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoScalingPolicyResponse setBody(GetAutoScalingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoScalingPolicyResponseBody getBody() {
        return this.body;
    }

}
