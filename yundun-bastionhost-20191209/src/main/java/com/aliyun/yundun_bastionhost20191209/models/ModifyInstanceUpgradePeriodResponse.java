// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceUpgradePeriodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceUpgradePeriodResponseBody body;

    public static ModifyInstanceUpgradePeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceUpgradePeriodResponse self = new ModifyInstanceUpgradePeriodResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceUpgradePeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceUpgradePeriodResponse setBody(ModifyInstanceUpgradePeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceUpgradePeriodResponseBody getBody() {
        return this.body;
    }

}
