// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteIntelligentStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIntelligentStrategyResponseBody body;

    public static DeleteIntelligentStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntelligentStrategyResponse self = new DeleteIntelligentStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIntelligentStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIntelligentStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIntelligentStrategyResponse setBody(DeleteIntelligentStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIntelligentStrategyResponseBody getBody() {
        return this.body;
    }

}
