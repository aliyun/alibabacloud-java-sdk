// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeApplicationVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeApplicationVersionResponseBody body;

    public static UpgradeApplicationVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeApplicationVersionResponse self = new UpgradeApplicationVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeApplicationVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeApplicationVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeApplicationVersionResponse setBody(UpgradeApplicationVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeApplicationVersionResponseBody getBody() {
        return this.body;
    }

}
