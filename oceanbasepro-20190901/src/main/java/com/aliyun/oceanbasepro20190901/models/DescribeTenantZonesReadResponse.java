// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantZonesReadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTenantZonesReadResponseBody body;

    public static DescribeTenantZonesReadResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantZonesReadResponse self = new DescribeTenantZonesReadResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantZonesReadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantZonesReadResponse setBody(DescribeTenantZonesReadResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantZonesReadResponseBody getBody() {
        return this.body;
    }

}
