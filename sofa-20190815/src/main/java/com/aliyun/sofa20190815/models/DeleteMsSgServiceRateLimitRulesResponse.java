// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsSgServiceRateLimitRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsSgServiceRateLimitRulesResponseBody body;

    public static DeleteMsSgServiceRateLimitRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsSgServiceRateLimitRulesResponse self = new DeleteMsSgServiceRateLimitRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsSgServiceRateLimitRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsSgServiceRateLimitRulesResponse setBody(DeleteMsSgServiceRateLimitRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsSgServiceRateLimitRulesResponseBody getBody() {
        return this.body;
    }

}
