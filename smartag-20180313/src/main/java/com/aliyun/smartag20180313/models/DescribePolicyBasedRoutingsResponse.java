// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribePolicyBasedRoutingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePolicyBasedRoutingsResponseBody body;

    public static DescribePolicyBasedRoutingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyBasedRoutingsResponse self = new DescribePolicyBasedRoutingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyBasedRoutingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolicyBasedRoutingsResponse setBody(DescribePolicyBasedRoutingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolicyBasedRoutingsResponseBody getBody() {
        return this.body;
    }

}
