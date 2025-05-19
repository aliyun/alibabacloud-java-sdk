// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListSampleConsistencyJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSampleConsistencyJobsResponseBody body;

    public static ListSampleConsistencyJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSampleConsistencyJobsResponse self = new ListSampleConsistencyJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListSampleConsistencyJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSampleConsistencyJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSampleConsistencyJobsResponse setBody(ListSampleConsistencyJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSampleConsistencyJobsResponseBody getBody() {
        return this.body;
    }

}
