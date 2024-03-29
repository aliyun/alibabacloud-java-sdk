// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListCalculationJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCalculationJobsResponseBody body;

    public static ListCalculationJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCalculationJobsResponse self = new ListCalculationJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListCalculationJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCalculationJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCalculationJobsResponse setBody(ListCalculationJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCalculationJobsResponseBody getBody() {
        return this.body;
    }

}
