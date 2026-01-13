// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecallManagementJobsResponseBody body;

    public static ListRecallManagementJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementJobsResponse self = new ListRecallManagementJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecallManagementJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecallManagementJobsResponse setBody(ListRecallManagementJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecallManagementJobsResponseBody getBody() {
        return this.body;
    }

}
