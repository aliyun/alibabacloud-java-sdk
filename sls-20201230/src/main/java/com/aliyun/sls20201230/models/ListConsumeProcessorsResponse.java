// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListConsumeProcessorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumeProcessorsResponseBody body;

    public static ListConsumeProcessorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumeProcessorsResponse self = new ListConsumeProcessorsResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumeProcessorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumeProcessorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumeProcessorsResponse setBody(ListConsumeProcessorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumeProcessorsResponseBody getBody() {
        return this.body;
    }

}
