// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunNodeStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPipelineRunNodeStatusResponseBody body;

    public static ListPipelineRunNodeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunNodeStatusResponse self = new ListPipelineRunNodeStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunNodeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineRunNodeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineRunNodeStatusResponse setBody(ListPipelineRunNodeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineRunNodeStatusResponseBody getBody() {
        return this.body;
    }

}
