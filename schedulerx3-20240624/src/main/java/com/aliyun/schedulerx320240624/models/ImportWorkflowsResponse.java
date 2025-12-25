// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ImportWorkflowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportWorkflowsResponseBody body;

    public static ImportWorkflowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportWorkflowsResponse self = new ImportWorkflowsResponse();
        return TeaModel.build(map, self);
    }

    public ImportWorkflowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportWorkflowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportWorkflowsResponse setBody(ImportWorkflowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportWorkflowsResponseBody getBody() {
        return this.body;
    }

}
