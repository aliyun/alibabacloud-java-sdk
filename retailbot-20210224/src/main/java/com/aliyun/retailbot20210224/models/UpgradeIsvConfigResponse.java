// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpgradeIsvConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeIsvConfigResponseBody body;

    public static UpgradeIsvConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeIsvConfigResponse self = new UpgradeIsvConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeIsvConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeIsvConfigResponse setBody(UpgradeIsvConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeIsvConfigResponseBody getBody() {
        return this.body;
    }

}
