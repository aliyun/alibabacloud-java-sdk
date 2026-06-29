// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CreateAgentStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentStorageResponseBody body;

    public static CreateAgentStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentStorageResponse self = new CreateAgentStorageResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentStorageResponse setBody(CreateAgentStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentStorageResponseBody getBody() {
        return this.body;
    }

}
