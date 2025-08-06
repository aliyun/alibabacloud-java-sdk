// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetIntelligentStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIntelligentStrategyResponseBody body;

    public static GetIntelligentStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntelligentStrategyResponse self = new GetIntelligentStrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetIntelligentStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntelligentStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIntelligentStrategyResponse setBody(GetIntelligentStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntelligentStrategyResponseBody getBody() {
        return this.body;
    }

}
