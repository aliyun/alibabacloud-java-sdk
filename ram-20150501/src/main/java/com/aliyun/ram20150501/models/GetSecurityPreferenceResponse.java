// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetSecurityPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSecurityPreferenceResponseBody body;

    public static GetSecurityPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityPreferenceResponse self = new GetSecurityPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityPreferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityPreferenceResponse setBody(GetSecurityPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityPreferenceResponseBody getBody() {
        return this.body;
    }

}
