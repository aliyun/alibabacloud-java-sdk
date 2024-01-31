// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAgentlessScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentlessScanTaskResponseBody body;

    public static CreateAgentlessScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentlessScanTaskResponse self = new CreateAgentlessScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentlessScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentlessScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentlessScanTaskResponse setBody(CreateAgentlessScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentlessScanTaskResponseBody getBody() {
        return this.body;
    }

}
