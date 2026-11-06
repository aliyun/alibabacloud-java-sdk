// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowNodeConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkflowNodeConfigurationResponseBody body;

    public static UpdateWorkflowNodeConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowNodeConfigurationResponse self = new UpdateWorkflowNodeConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowNodeConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkflowNodeConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkflowNodeConfigurationResponse setBody(UpdateWorkflowNodeConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkflowNodeConfigurationResponseBody getBody() {
        return this.body;
    }

}
