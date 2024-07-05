// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateVsPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVsPullStreamInfoConfigResponseBody body;

    public static UpdateVsPullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVsPullStreamInfoConfigResponse self = new UpdateVsPullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVsPullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVsPullStreamInfoConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVsPullStreamInfoConfigResponse setBody(UpdateVsPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVsPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
