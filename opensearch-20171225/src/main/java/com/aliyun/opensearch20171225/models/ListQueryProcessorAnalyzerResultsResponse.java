// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorAnalyzerResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListQueryProcessorAnalyzerResultsResponseBody body;

    public static ListQueryProcessorAnalyzerResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorAnalyzerResultsResponse self = new ListQueryProcessorAnalyzerResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorAnalyzerResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueryProcessorAnalyzerResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueryProcessorAnalyzerResultsResponse setBody(ListQueryProcessorAnalyzerResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueryProcessorAnalyzerResultsResponseBody getBody() {
        return this.body;
    }

}
