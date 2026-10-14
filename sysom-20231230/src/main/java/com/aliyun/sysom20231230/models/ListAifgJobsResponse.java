// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAifgJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAifgJobsResponseBody body;

    public static ListAifgJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAifgJobsResponse self = new ListAifgJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListAifgJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAifgJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAifgJobsResponse setBody(ListAifgJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAifgJobsResponseBody getBody() {
        return this.body;
    }

}
