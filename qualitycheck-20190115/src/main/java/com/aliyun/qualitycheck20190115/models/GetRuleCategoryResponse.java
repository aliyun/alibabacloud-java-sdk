// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRuleCategoryResponseBody body;

    public static GetRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleCategoryResponse self = new GetRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleCategoryResponse setBody(GetRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
