// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResetWorkflowNodeConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetWorkflowNodeConfigurationResponseBody body;

    public static ResetWorkflowNodeConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetWorkflowNodeConfigurationResponse self = new ResetWorkflowNodeConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ResetWorkflowNodeConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetWorkflowNodeConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetWorkflowNodeConfigurationResponse setBody(ResetWorkflowNodeConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetWorkflowNodeConfigurationResponseBody getBody() {
        return this.body;
    }

}
