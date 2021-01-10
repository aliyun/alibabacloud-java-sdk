// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsGuardianAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsGuardianAppsResponseBody body;

    public static GetMsGuardianAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsGuardianAppsResponse self = new GetMsGuardianAppsResponse();
        return TeaModel.build(map, self);
    }

    public GetMsGuardianAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsGuardianAppsResponse setBody(GetMsGuardianAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsGuardianAppsResponseBody getBody() {
        return this.body;
    }

}
