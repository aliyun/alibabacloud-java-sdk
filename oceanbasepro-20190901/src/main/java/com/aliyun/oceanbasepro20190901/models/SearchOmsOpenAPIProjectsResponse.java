// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchOmsOpenAPIProjectsResponseBody body;

    public static SearchOmsOpenAPIProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchOmsOpenAPIProjectsResponse self = new SearchOmsOpenAPIProjectsResponse();
        return TeaModel.build(map, self);
    }

    public SearchOmsOpenAPIProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchOmsOpenAPIProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchOmsOpenAPIProjectsResponse setBody(SearchOmsOpenAPIProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchOmsOpenAPIProjectsResponseBody getBody() {
        return this.body;
    }

}
