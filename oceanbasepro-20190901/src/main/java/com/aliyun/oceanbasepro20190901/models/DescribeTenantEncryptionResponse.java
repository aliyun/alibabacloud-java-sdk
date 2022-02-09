// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantEncryptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTenantEncryptionResponseBody body;

    public static DescribeTenantEncryptionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantEncryptionResponse self = new DescribeTenantEncryptionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantEncryptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantEncryptionResponse setBody(DescribeTenantEncryptionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantEncryptionResponseBody getBody() {
        return this.body;
    }

}
