// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgServiceRateLimitRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsSgServiceRateLimitRulesResponseBody body;

    public static AddMsSgServiceRateLimitRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgServiceRateLimitRulesResponse self = new AddMsSgServiceRateLimitRulesResponse();
        return TeaModel.build(map, self);
    }

    public AddMsSgServiceRateLimitRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsSgServiceRateLimitRulesResponse setBody(AddMsSgServiceRateLimitRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsSgServiceRateLimitRulesResponseBody getBody() {
        return this.body;
    }

}
