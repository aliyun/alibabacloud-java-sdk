// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateOrGetVirtualLicenseOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrGetVirtualLicenseOrderResponseBody body;

    public static CreateOrGetVirtualLicenseOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrGetVirtualLicenseOrderResponse self = new CreateOrGetVirtualLicenseOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrGetVirtualLicenseOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrGetVirtualLicenseOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrGetVirtualLicenseOrderResponse setBody(CreateOrGetVirtualLicenseOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrGetVirtualLicenseOrderResponseBody getBody() {
        return this.body;
    }

}
