// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionRiskyTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExecutionRiskyTasksResponseBody body;

    public static ListExecutionRiskyTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionRiskyTasksResponse self = new ListExecutionRiskyTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutionRiskyTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutionRiskyTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExecutionRiskyTasksResponse setBody(ListExecutionRiskyTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutionRiskyTasksResponseBody getBody() {
        return this.body;
    }

}
