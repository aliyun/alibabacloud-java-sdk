// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyDeviceAutoUpgradePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDeviceAutoUpgradePolicyResponseBody body;

    public static ModifyDeviceAutoUpgradePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceAutoUpgradePolicyResponse self = new ModifyDeviceAutoUpgradePolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceAutoUpgradePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDeviceAutoUpgradePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDeviceAutoUpgradePolicyResponse setBody(ModifyDeviceAutoUpgradePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDeviceAutoUpgradePolicyResponseBody getBody() {
        return this.body;
    }

}
