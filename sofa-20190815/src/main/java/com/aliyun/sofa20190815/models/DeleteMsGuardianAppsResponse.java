// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsGuardianAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsGuardianAppsResponseBody body;

    public static DeleteMsGuardianAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsGuardianAppsResponse self = new DeleteMsGuardianAppsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsGuardianAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsGuardianAppsResponse setBody(DeleteMsGuardianAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsGuardianAppsResponseBody getBody() {
        return this.body;
    }

}
