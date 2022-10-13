// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowResponseBody body;

    public static ListFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowResponse self = new ListFlowResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowResponse setBody(ListFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowResponseBody getBody() {
        return this.body;
    }

}
