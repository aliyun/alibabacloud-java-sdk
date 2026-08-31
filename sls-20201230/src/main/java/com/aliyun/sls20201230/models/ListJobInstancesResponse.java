// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListJobInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobInstancesResponseBody body;

    public static ListJobInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobInstancesResponse self = new ListJobInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListJobInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobInstancesResponse setBody(ListJobInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobInstancesResponseBody getBody() {
        return this.body;
    }

}
