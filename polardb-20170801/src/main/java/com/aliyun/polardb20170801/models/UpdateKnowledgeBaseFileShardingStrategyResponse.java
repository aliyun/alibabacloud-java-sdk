// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseFileShardingStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeBaseFileShardingStrategyResponseBody body;

    public static UpdateKnowledgeBaseFileShardingStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseFileShardingStrategyResponse self = new UpdateKnowledgeBaseFileShardingStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseFileShardingStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeBaseFileShardingStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeBaseFileShardingStrategyResponse setBody(UpdateKnowledgeBaseFileShardingStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeBaseFileShardingStrategyResponseBody getBody() {
        return this.body;
    }

}
