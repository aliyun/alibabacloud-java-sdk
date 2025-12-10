// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListNodeOutputsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodeOutputsResponseBody body;

    public static ListNodeOutputsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeOutputsResponse self = new ListNodeOutputsResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeOutputsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeOutputsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeOutputsResponse setBody(ListNodeOutputsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeOutputsResponseBody getBody() {
        return this.body;
    }

}
