// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class UpgradeInstanceImageVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeInstanceImageVersionResponseBody body;

    public static UpgradeInstanceImageVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceImageVersionResponse self = new UpgradeInstanceImageVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceImageVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeInstanceImageVersionResponse setBody(UpgradeInstanceImageVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeInstanceImageVersionResponseBody getBody() {
        return this.body;
    }

}
