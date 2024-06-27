// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteNameListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNameListResponseBody body;

    public static DeleteNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNameListResponse self = new DeleteNameListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNameListResponse setBody(DeleteNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNameListResponseBody getBody() {
        return this.body;
    }

}
