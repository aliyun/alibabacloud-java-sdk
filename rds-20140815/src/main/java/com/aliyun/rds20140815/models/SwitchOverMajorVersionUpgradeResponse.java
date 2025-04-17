// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchOverMajorVersionUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchOverMajorVersionUpgradeResponseBody body;

    public static SwitchOverMajorVersionUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchOverMajorVersionUpgradeResponse self = new SwitchOverMajorVersionUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public SwitchOverMajorVersionUpgradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchOverMajorVersionUpgradeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchOverMajorVersionUpgradeResponse setBody(SwitchOverMajorVersionUpgradeResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchOverMajorVersionUpgradeResponseBody getBody() {
        return this.body;
    }

}
