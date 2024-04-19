// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRulesCountListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRulesCountListResponseBody body;

    public static GetRulesCountListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRulesCountListResponse self = new GetRulesCountListResponse();
        return TeaModel.build(map, self);
    }

    public GetRulesCountListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRulesCountListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRulesCountListResponse setBody(GetRulesCountListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRulesCountListResponseBody getBody() {
        return this.body;
    }

}
