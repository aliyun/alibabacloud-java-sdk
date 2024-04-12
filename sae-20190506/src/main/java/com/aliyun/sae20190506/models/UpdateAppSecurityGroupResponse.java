// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateAppSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateAppSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppSecurityGroupResponse setBody(UpdateAppSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
