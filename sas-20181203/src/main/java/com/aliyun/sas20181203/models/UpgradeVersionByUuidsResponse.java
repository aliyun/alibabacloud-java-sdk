// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpgradeVersionByUuidsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeVersionByUuidsResponseBody body;

    public static UpgradeVersionByUuidsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeVersionByUuidsResponse self = new UpgradeVersionByUuidsResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeVersionByUuidsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeVersionByUuidsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeVersionByUuidsResponse setBody(UpgradeVersionByUuidsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeVersionByUuidsResponseBody getBody() {
        return this.body;
    }

}
