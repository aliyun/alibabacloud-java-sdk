// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PushUserAnalyzerEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushUserAnalyzerEntriesResponseBody body;

    public static PushUserAnalyzerEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        PushUserAnalyzerEntriesResponse self = new PushUserAnalyzerEntriesResponse();
        return TeaModel.build(map, self);
    }

    public PushUserAnalyzerEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushUserAnalyzerEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushUserAnalyzerEntriesResponse setBody(PushUserAnalyzerEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public PushUserAnalyzerEntriesResponseBody getBody() {
        return this.body;
    }

}
