// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadAllMarketingPreferencesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadAllMarketingPreferencesResponseBody body;

    public static ReadAllMarketingPreferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadAllMarketingPreferencesResponse self = new ReadAllMarketingPreferencesResponse();
        return TeaModel.build(map, self);
    }

    public ReadAllMarketingPreferencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadAllMarketingPreferencesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadAllMarketingPreferencesResponse setBody(ReadAllMarketingPreferencesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadAllMarketingPreferencesResponseBody getBody() {
        return this.body;
    }

}
