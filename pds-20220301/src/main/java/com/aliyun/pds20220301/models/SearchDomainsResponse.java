// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchDomainsResponseBody body;

    public static SearchDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchDomainsResponse self = new SearchDomainsResponse();
        return TeaModel.build(map, self);
    }

    public SearchDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchDomainsResponse setBody(SearchDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchDomainsResponseBody getBody() {
        return this.body;
    }

}
