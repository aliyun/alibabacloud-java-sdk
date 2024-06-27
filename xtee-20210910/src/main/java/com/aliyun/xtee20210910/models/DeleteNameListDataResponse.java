// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteNameListDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNameListDataResponseBody body;

    public static DeleteNameListDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNameListDataResponse self = new DeleteNameListDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNameListDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNameListDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNameListDataResponse setBody(DeleteNameListDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNameListDataResponseBody getBody() {
        return this.body;
    }

}
