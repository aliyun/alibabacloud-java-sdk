// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class SearchMCTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchMCTablesResponseBody body;

    public static SearchMCTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMCTablesResponse self = new SearchMCTablesResponse();
        return TeaModel.build(map, self);
    }

    public SearchMCTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMCTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMCTablesResponse setBody(SearchMCTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMCTablesResponseBody getBody() {
        return this.body;
    }

}
