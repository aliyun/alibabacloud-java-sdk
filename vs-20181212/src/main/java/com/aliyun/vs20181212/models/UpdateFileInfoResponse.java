// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateFileInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFileInfoResponseBody body;

    public static UpdateFileInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileInfoResponse self = new UpdateFileInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileInfoResponse setBody(UpdateFileInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileInfoResponseBody getBody() {
        return this.body;
    }

}
