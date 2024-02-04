// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListAllLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllLabelsResponseBody body;

    public static ListAllLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllLabelsResponse self = new ListAllLabelsResponse();
        return TeaModel.build(map, self);
    }

    public ListAllLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllLabelsResponse setBody(ListAllLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllLabelsResponseBody getBody() {
        return this.body;
    }

}
