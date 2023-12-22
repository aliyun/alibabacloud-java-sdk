// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateInstanceResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceResourceResponseBody body;

    public static UpdateInstanceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceResourceResponse self = new UpdateInstanceResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceResourceResponse setBody(UpdateInstanceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceResourceResponseBody getBody() {
        return this.body;
    }

}
