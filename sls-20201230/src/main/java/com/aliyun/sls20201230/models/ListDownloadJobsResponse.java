// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListDownloadJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDownloadJobsResponseBody body;

    public static ListDownloadJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDownloadJobsResponse self = new ListDownloadJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListDownloadJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDownloadJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDownloadJobsResponse setBody(ListDownloadJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDownloadJobsResponseBody getBody() {
        return this.body;
    }

}
