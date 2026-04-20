// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateCallCenterProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCallCenterProviderResponseBody body;

    public static UpdateCallCenterProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCallCenterProviderResponse self = new UpdateCallCenterProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCallCenterProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCallCenterProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCallCenterProviderResponse setBody(UpdateCallCenterProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCallCenterProviderResponseBody getBody() {
        return this.body;
    }

}
