// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgServiceRateLimitRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgServiceRateLimitRulesResponseBody body;

    public static ListMsSgServiceRateLimitRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgServiceRateLimitRulesResponse self = new ListMsSgServiceRateLimitRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgServiceRateLimitRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgServiceRateLimitRulesResponse setBody(ListMsSgServiceRateLimitRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgServiceRateLimitRulesResponseBody getBody() {
        return this.body;
    }

}
