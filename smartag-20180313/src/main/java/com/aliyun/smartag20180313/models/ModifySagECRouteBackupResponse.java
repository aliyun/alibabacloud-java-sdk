// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagECRouteBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagECRouteBackupResponseBody body;

    public static ModifySagECRouteBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagECRouteBackupResponse self = new ModifySagECRouteBackupResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagECRouteBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagECRouteBackupResponse setBody(ModifySagECRouteBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagECRouteBackupResponseBody getBody() {
        return this.body;
    }

}
