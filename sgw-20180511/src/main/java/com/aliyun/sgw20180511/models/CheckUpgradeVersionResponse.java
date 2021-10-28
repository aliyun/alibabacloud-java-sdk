// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckUpgradeVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUpgradeVersionResponseBody body;

    public static CheckUpgradeVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUpgradeVersionResponse self = new CheckUpgradeVersionResponse();
        return TeaModel.build(map, self);
    }

    public CheckUpgradeVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUpgradeVersionResponse setBody(CheckUpgradeVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUpgradeVersionResponseBody getBody() {
        return this.body;
    }

}
