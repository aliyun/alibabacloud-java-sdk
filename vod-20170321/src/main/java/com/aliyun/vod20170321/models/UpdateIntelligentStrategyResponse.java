// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateIntelligentStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIntelligentStrategyResponseBody body;

    public static UpdateIntelligentStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntelligentStrategyResponse self = new UpdateIntelligentStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIntelligentStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIntelligentStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIntelligentStrategyResponse setBody(UpdateIntelligentStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIntelligentStrategyResponseBody getBody() {
        return this.body;
    }

}
