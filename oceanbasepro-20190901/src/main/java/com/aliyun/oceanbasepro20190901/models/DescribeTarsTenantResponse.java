// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTarsTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTarsTenantResponseBody body;

    public static DescribeTarsTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTarsTenantResponse self = new DescribeTarsTenantResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTarsTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTarsTenantResponse setBody(DescribeTarsTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTarsTenantResponseBody getBody() {
        return this.body;
    }

}
