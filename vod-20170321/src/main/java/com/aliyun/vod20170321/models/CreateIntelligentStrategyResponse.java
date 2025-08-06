// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateIntelligentStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIntelligentStrategyResponseBody body;

    public static CreateIntelligentStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntelligentStrategyResponse self = new CreateIntelligentStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntelligentStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntelligentStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIntelligentStrategyResponse setBody(CreateIntelligentStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntelligentStrategyResponseBody getBody() {
        return this.body;
    }

}
