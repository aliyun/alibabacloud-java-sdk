// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgServiceRateLimitRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsSgServiceRateLimitRulesResponseBody body;

    public static UpdateMsSgServiceRateLimitRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgServiceRateLimitRulesResponse self = new UpdateMsSgServiceRateLimitRulesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgServiceRateLimitRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsSgServiceRateLimitRulesResponse setBody(UpdateMsSgServiceRateLimitRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsSgServiceRateLimitRulesResponseBody getBody() {
        return this.body;
    }

}
