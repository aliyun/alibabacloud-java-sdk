// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class QueryCssOrderForLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCssOrderForLicenseResponseBody body;

    public static QueryCssOrderForLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCssOrderForLicenseResponse self = new QueryCssOrderForLicenseResponse();
        return TeaModel.build(map, self);
    }

    public QueryCssOrderForLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCssOrderForLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCssOrderForLicenseResponse setBody(QueryCssOrderForLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCssOrderForLicenseResponseBody getBody() {
        return this.body;
    }

}
