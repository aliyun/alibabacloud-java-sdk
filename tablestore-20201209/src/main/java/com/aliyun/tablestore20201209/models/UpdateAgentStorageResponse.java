// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateAgentStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentStorageResponseBody body;

    public static UpdateAgentStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentStorageResponse self = new UpdateAgentStorageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentStorageResponse setBody(UpdateAgentStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentStorageResponseBody getBody() {
        return this.body;
    }

}
