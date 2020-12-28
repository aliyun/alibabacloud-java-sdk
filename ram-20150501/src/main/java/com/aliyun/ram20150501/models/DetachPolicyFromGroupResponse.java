// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachPolicyFromGroupResponseBody body;

    public static DetachPolicyFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromGroupResponse self = new DetachPolicyFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public DetachPolicyFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachPolicyFromGroupResponse setBody(DetachPolicyFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachPolicyFromGroupResponseBody getBody() {
        return this.body;
    }

}
