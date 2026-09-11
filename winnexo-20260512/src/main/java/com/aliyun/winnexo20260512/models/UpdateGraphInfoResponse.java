// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGraphInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGraphInfoResponseBody body;

    public static UpdateGraphInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGraphInfoResponse self = new UpdateGraphInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGraphInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGraphInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGraphInfoResponse setBody(UpdateGraphInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGraphInfoResponseBody getBody() {
        return this.body;
    }

}
