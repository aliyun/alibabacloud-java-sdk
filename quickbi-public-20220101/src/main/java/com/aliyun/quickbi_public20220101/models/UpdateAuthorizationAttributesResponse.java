// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthorizationAttributesResponseBody body;

    public static UpdateAuthorizationAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationAttributesResponse self = new UpdateAuthorizationAttributesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorizationAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthorizationAttributesResponse setBody(UpdateAuthorizationAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorizationAttributesResponseBody getBody() {
        return this.body;
    }

}
