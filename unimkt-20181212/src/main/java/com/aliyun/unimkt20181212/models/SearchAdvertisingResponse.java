// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class SearchAdvertisingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchAdvertisingResponseBody body;

    public static SearchAdvertisingResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAdvertisingResponse self = new SearchAdvertisingResponse();
        return TeaModel.build(map, self);
    }

    public SearchAdvertisingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAdvertisingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAdvertisingResponse setBody(SearchAdvertisingResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAdvertisingResponseBody getBody() {
        return this.body;
    }

}
