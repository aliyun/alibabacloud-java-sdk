// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DelRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DelRuleCategoryResponseBody body;

    public static DelRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DelRuleCategoryResponse self = new DelRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DelRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelRuleCategoryResponse setBody(DelRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DelRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
