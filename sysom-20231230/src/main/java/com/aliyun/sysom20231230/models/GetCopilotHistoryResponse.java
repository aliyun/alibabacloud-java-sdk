// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetCopilotHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCopilotHistoryResponseBody body;

    public static GetCopilotHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCopilotHistoryResponse self = new GetCopilotHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetCopilotHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCopilotHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCopilotHistoryResponse setBody(GetCopilotHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCopilotHistoryResponseBody getBody() {
        return this.body;
    }

}
