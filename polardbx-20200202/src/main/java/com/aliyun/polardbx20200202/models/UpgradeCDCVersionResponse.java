// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradeCDCVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeCDCVersionResponseBody body;

    public static UpgradeCDCVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeCDCVersionResponse self = new UpgradeCDCVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeCDCVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeCDCVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeCDCVersionResponse setBody(UpgradeCDCVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeCDCVersionResponseBody getBody() {
        return this.body;
    }

}
