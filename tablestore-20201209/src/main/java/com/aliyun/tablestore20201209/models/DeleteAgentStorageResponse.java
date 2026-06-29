// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteAgentStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentStorageResponseBody body;

    public static DeleteAgentStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentStorageResponse self = new DeleteAgentStorageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentStorageResponse setBody(DeleteAgentStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentStorageResponseBody getBody() {
        return this.body;
    }

}
