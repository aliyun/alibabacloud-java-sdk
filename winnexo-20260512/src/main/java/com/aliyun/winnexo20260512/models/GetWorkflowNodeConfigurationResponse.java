// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkflowNodeConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkflowNodeConfigurationResponseBody body;

    public static GetWorkflowNodeConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowNodeConfigurationResponse self = new GetWorkflowNodeConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowNodeConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowNodeConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkflowNodeConfigurationResponse setBody(GetWorkflowNodeConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowNodeConfigurationResponseBody getBody() {
        return this.body;
    }

}
