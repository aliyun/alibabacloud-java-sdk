// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpgradePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradePackageResponseBody body;

    public static UpgradePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradePackageResponse self = new UpgradePackageResponse();
        return TeaModel.build(map, self);
    }

    public UpgradePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradePackageResponse setBody(UpgradePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradePackageResponseBody getBody() {
        return this.body;
    }

}
