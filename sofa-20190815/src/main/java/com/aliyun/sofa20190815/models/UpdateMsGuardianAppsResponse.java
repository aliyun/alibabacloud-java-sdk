// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsGuardianAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsGuardianAppsResponseBody body;

    public static UpdateMsGuardianAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsGuardianAppsResponse self = new UpdateMsGuardianAppsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsGuardianAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsGuardianAppsResponse setBody(UpdateMsGuardianAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsGuardianAppsResponseBody getBody() {
        return this.body;
    }

}
