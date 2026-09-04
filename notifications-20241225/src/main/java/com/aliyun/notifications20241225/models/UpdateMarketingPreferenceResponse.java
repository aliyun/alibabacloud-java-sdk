// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class UpdateMarketingPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMarketingPreferenceResponseBody body;

    public static UpdateMarketingPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMarketingPreferenceResponse self = new UpdateMarketingPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMarketingPreferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMarketingPreferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMarketingPreferenceResponse setBody(UpdateMarketingPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMarketingPreferenceResponseBody getBody() {
        return this.body;
    }

}
