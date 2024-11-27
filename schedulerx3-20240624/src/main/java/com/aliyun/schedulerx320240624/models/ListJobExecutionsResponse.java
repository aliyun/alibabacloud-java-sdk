// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListJobExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobExecutionsResponseBody body;

    public static ListJobExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutionsResponse self = new ListJobExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListJobExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobExecutionsResponse setBody(ListJobExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobExecutionsResponseBody getBody() {
        return this.body;
    }

}
