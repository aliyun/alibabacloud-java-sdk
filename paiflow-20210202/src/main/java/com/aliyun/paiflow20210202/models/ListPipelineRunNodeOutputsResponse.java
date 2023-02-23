// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunNodeOutputsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPipelineRunNodeOutputsResponseBody body;

    public static ListPipelineRunNodeOutputsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunNodeOutputsResponse self = new ListPipelineRunNodeOutputsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunNodeOutputsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineRunNodeOutputsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineRunNodeOutputsResponse setBody(ListPipelineRunNodeOutputsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineRunNodeOutputsResponseBody getBody() {
        return this.body;
    }

}
