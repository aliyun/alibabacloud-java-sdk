// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebApplicationTrafficConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebApplicationTrafficConfigBody body;

    public static UpdateWebApplicationTrafficConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebApplicationTrafficConfigResponse self = new UpdateWebApplicationTrafficConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWebApplicationTrafficConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWebApplicationTrafficConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWebApplicationTrafficConfigResponse setBody(WebApplicationTrafficConfigBody body) {
        this.body = body;
        return this;
    }
    public WebApplicationTrafficConfigBody getBody() {
        return this.body;
    }

}
