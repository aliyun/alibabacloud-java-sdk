// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListWorkerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkerInstancesResponseBody body;

    public static ListWorkerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkerInstancesResponse self = new ListWorkerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkerInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkerInstancesResponse setBody(ListWorkerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkerInstancesResponseBody getBody() {
        return this.body;
    }

}
