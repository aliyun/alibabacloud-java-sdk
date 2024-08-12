// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UpdateLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLabelResponseBody body;

    public static UpdateLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLabelResponse self = new UpdateLabelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLabelResponse setBody(UpdateLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLabelResponseBody getBody() {
        return this.body;
    }

}
