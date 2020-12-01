// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateAppSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppSecurityGroupResponseBody body;

    public static UpdateAppSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSecurityGroupResponse self = new UpdateAppSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppSecurityGroupResponse setBody(UpdateAppSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
