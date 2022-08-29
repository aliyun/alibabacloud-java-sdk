// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFileResponseBody body;

    public static ListFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileResponse self = new ListFileResponse();
        return TeaModel.build(map, self);
    }

    public ListFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileResponse setBody(ListFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileResponseBody getBody() {
        return this.body;
    }

}
