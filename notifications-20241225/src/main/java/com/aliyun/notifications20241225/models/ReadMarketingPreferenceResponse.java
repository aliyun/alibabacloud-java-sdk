// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMarketingPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadMarketingPreferenceResponseBody body;

    public static ReadMarketingPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadMarketingPreferenceResponse self = new ReadMarketingPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public ReadMarketingPreferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadMarketingPreferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadMarketingPreferenceResponse setBody(ReadMarketingPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadMarketingPreferenceResponseBody getBody() {
        return this.body;
    }

}
