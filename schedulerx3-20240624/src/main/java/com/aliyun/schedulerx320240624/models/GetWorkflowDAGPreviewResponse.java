// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetWorkflowDAGPreviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkflowDAGPreviewResponseBody body;

    public static GetWorkflowDAGPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDAGPreviewResponse self = new GetWorkflowDAGPreviewResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDAGPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowDAGPreviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkflowDAGPreviewResponse setBody(GetWorkflowDAGPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowDAGPreviewResponseBody getBody() {
        return this.body;
    }

}
