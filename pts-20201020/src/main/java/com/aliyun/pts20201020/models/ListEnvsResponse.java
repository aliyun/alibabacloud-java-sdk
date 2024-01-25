// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListEnvsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvsResponseBody body;

    public static ListEnvsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvsResponse self = new ListEnvsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvsResponse setBody(ListEnvsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvsResponseBody getBody() {
        return this.body;
    }

}
