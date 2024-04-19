// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteWarningConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWarningConfigResponseBody body;

    public static DeleteWarningConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarningConfigResponse self = new DeleteWarningConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWarningConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWarningConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWarningConfigResponse setBody(DeleteWarningConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWarningConfigResponseBody getBody() {
        return this.body;
    }

}
