// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzerEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserAnalyzerEntriesResponseBody body;

    public static ListUserAnalyzerEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzerEntriesResponse self = new ListUserAnalyzerEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserAnalyzerEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserAnalyzerEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserAnalyzerEntriesResponse setBody(ListUserAnalyzerEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserAnalyzerEntriesResponseBody getBody() {
        return this.body;
    }

}
