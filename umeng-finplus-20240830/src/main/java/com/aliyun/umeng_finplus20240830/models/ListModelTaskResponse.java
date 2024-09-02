// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class ListModelTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelTaskResponseBody body;

    public static ListModelTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelTaskResponse self = new ListModelTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListModelTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelTaskResponse setBody(ListModelTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelTaskResponseBody getBody() {
        return this.body;
    }

}
