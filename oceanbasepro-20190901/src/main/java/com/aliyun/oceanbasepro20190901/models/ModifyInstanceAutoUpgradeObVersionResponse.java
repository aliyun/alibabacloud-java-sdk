// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoUpgradeObVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceAutoUpgradeObVersionResponseBody body;

    public static ModifyInstanceAutoUpgradeObVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoUpgradeObVersionResponse self = new ModifyInstanceAutoUpgradeObVersionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoUpgradeObVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAutoUpgradeObVersionResponse setBody(ModifyInstanceAutoUpgradeObVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAutoUpgradeObVersionResponseBody getBody() {
        return this.body;
    }

}
