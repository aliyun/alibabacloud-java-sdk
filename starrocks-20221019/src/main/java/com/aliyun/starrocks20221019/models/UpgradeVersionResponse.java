// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpgradeVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeVersionResponseBody body;

    public static UpgradeVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeVersionResponse self = new UpgradeVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeVersionResponse setBody(UpgradeVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeVersionResponseBody getBody() {
        return this.body;
    }

}
