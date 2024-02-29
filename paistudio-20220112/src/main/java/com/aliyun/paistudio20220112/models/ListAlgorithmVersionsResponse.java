// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListAlgorithmVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlgorithmVersionsResponseBody body;

    public static ListAlgorithmVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmVersionsResponse self = new ListAlgorithmVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlgorithmVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlgorithmVersionsResponse setBody(ListAlgorithmVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlgorithmVersionsResponseBody getBody() {
        return this.body;
    }

}
