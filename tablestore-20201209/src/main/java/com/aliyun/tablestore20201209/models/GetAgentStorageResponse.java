// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class GetAgentStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentStorageResponseBody body;

    public static GetAgentStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentStorageResponse self = new GetAgentStorageResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentStorageResponse setBody(GetAgentStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentStorageResponseBody getBody() {
        return this.body;
    }

}
