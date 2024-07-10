// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebApplicationScalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebApplicationScalingConfigBody body;

    public static UpdateWebApplicationScalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebApplicationScalingConfigResponse self = new UpdateWebApplicationScalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWebApplicationScalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWebApplicationScalingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWebApplicationScalingConfigResponse setBody(WebApplicationScalingConfigBody body) {
        this.body = body;
        return this;
    }
    public WebApplicationScalingConfigBody getBody() {
        return this.body;
    }

}
