// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAgentListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentListResponseBody body;

    public static GetAgentListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentListResponse self = new GetAgentListResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentListResponse setBody(GetAgentListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentListResponseBody getBody() {
        return this.body;
    }

}
