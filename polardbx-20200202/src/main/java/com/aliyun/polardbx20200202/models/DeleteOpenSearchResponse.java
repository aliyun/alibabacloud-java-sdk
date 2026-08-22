// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteOpenSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOpenSearchResponseBody body;

    public static DeleteOpenSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenSearchResponse self = new DeleteOpenSearchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOpenSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOpenSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOpenSearchResponse setBody(DeleteOpenSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOpenSearchResponseBody getBody() {
        return this.body;
    }

}
