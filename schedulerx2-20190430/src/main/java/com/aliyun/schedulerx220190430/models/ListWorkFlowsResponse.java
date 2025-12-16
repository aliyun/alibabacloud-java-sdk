// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListWorkFlowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkFlowsResponseBody body;

    public static ListWorkFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowsResponse self = new ListWorkFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkFlowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkFlowsResponse setBody(ListWorkFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkFlowsResponseBody getBody() {
        return this.body;
    }

}
