// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteVsPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVsPullStreamInfoConfigResponseBody body;

    public static DeleteVsPullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVsPullStreamInfoConfigResponse self = new DeleteVsPullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVsPullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVsPullStreamInfoConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVsPullStreamInfoConfigResponse setBody(DeleteVsPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVsPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
