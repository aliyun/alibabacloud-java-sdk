// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourceDriftsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStackResourceDriftsResponseBody body;

    public static ListStackResourceDriftsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourceDriftsResponse self = new ListStackResourceDriftsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackResourceDriftsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackResourceDriftsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStackResourceDriftsResponse setBody(ListStackResourceDriftsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackResourceDriftsResponseBody getBody() {
        return this.body;
    }

}
