// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetKnowledgeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKnowledgeDataResponseBody body;

    public static GetKnowledgeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeDataResponse self = new GetKnowledgeDataResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKnowledgeDataResponse setBody(GetKnowledgeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgeDataResponseBody getBody() {
        return this.body;
    }

}
