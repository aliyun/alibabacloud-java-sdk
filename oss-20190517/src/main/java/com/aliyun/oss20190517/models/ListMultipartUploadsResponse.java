// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListMultipartUploadsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMultipartUploadsResponseBody body;

    public static ListMultipartUploadsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultipartUploadsResponse self = new ListMultipartUploadsResponse();
        return TeaModel.build(map, self);
    }

    public ListMultipartUploadsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultipartUploadsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultipartUploadsResponse setBody(ListMultipartUploadsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultipartUploadsResponseBody getBody() {
        return this.body;
    }

}
