// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleDimensionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRuleDimensionResponseBody body;

    public static GetRuleDimensionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleDimensionResponse self = new GetRuleDimensionResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleDimensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleDimensionResponse setBody(GetRuleDimensionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleDimensionResponseBody getBody() {
        return this.body;
    }

}
