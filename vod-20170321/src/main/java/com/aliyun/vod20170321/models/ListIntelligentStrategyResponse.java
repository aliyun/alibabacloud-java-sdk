// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListIntelligentStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntelligentStrategyResponseBody body;

    public static ListIntelligentStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntelligentStrategyResponse self = new ListIntelligentStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ListIntelligentStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntelligentStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntelligentStrategyResponse setBody(ListIntelligentStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntelligentStrategyResponseBody getBody() {
        return this.body;
    }

}
