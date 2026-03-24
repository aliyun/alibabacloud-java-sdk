// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterCheckResultResponseBody body;

    public static ListClusterCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterCheckResultResponse self = new ListClusterCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterCheckResultResponse setBody(ListClusterCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterCheckResultResponseBody getBody() {
        return this.body;
    }

}
