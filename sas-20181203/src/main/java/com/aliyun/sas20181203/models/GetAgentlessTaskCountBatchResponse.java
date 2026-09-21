// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAgentlessTaskCountBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentlessTaskCountBatchResponseBody body;

    public static GetAgentlessTaskCountBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentlessTaskCountBatchResponse self = new GetAgentlessTaskCountBatchResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentlessTaskCountBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentlessTaskCountBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentlessTaskCountBatchResponse setBody(GetAgentlessTaskCountBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentlessTaskCountBatchResponseBody getBody() {
        return this.body;
    }

}
