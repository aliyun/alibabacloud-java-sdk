// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachPolicyToGroupResponseBody body;

    public static AttachPolicyToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToGroupResponse self = new AttachPolicyToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AttachPolicyToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachPolicyToGroupResponse setBody(AttachPolicyToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachPolicyToGroupResponseBody getBody() {
        return this.body;
    }

}
