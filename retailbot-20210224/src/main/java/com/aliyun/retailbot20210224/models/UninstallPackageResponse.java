// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UninstallPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UninstallPackageResponseBody body;

    public static UninstallPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallPackageResponse self = new UninstallPackageResponse();
        return TeaModel.build(map, self);
    }

    public UninstallPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallPackageResponse setBody(UninstallPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallPackageResponseBody getBody() {
        return this.body;
    }

}
