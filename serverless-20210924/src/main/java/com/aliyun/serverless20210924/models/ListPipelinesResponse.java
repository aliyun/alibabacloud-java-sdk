// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListPipelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<Pipeline> body;

    public static ListPipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesResponse self = new ListPipelinesResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelinesResponse setBody(java.util.List<Pipeline> body) {
        this.body = body;
        return this;
    }
    public java.util.List<Pipeline> getBody() {
        return this.body;
    }

}
