// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradeColumnarVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeColumnarVersionResponseBody body;

    public static UpgradeColumnarVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeColumnarVersionResponse self = new UpgradeColumnarVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeColumnarVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeColumnarVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeColumnarVersionResponse setBody(UpgradeColumnarVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeColumnarVersionResponseBody getBody() {
        return this.body;
    }

}
