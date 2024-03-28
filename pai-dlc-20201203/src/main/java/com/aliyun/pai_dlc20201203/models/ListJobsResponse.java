// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobsResponseBody body;

    public static ListJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponse self = new ListJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobsResponse setBody(ListJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobsResponseBody getBody() {
        return this.body;
    }

}
