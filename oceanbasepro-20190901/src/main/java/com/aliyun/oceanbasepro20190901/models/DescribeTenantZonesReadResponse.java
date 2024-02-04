// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantZonesReadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeTenantZonesReadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTenantZonesReadResponse setBody(DescribeTenantZonesReadResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantZonesReadResponseBody getBody() {
        return this.body;
    }

}
