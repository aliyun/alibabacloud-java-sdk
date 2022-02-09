// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantZonesElectableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTenantZonesElectableResponseBody body;

    public static DescribeTenantZonesElectableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantZonesElectableResponse self = new DescribeTenantZonesElectableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantZonesElectableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantZonesElectableResponse setBody(DescribeTenantZonesElectableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantZonesElectableResponseBody getBody() {
        return this.body;
    }

}
