// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunNodeLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPipelineRunNodeLogsResponseBody body;

    public static ListPipelineRunNodeLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunNodeLogsResponse self = new ListPipelineRunNodeLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunNodeLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineRunNodeLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineRunNodeLogsResponse setBody(ListPipelineRunNodeLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineRunNodeLogsResponseBody getBody() {
        return this.body;
    }

}
