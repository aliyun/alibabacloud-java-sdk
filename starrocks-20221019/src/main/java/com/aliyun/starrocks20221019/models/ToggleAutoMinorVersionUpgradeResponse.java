// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ToggleAutoMinorVersionUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ToggleAutoMinorVersionUpgradeResponseBody body;

    public static ToggleAutoMinorVersionUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        ToggleAutoMinorVersionUpgradeResponse self = new ToggleAutoMinorVersionUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public ToggleAutoMinorVersionUpgradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ToggleAutoMinorVersionUpgradeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ToggleAutoMinorVersionUpgradeResponse setBody(ToggleAutoMinorVersionUpgradeResponseBody body) {
        this.body = body;
        return this;
    }
    public ToggleAutoMinorVersionUpgradeResponseBody getBody() {
        return this.body;
    }

}
