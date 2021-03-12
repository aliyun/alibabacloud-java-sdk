// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class InstallPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstallPackageResponseBody body;

    public static InstallPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallPackageResponse self = new InstallPackageResponse();
        return TeaModel.build(map, self);
    }

    public InstallPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallPackageResponse setBody(InstallPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallPackageResponseBody getBody() {
        return this.body;
    }

}
