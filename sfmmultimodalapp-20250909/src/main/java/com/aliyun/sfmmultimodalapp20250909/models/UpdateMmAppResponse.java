// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmAppResponseBody body;

    public static UpdateMmAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppResponse self = new UpdateMmAppResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmAppResponse setBody(UpdateMmAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmAppResponseBody getBody() {
        return this.body;
    }

}
