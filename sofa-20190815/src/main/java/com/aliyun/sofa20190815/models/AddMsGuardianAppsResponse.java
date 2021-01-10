// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsGuardianAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsGuardianAppsResponseBody body;

    public static AddMsGuardianAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsGuardianAppsResponse self = new AddMsGuardianAppsResponse();
        return TeaModel.build(map, self);
    }

    public AddMsGuardianAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsGuardianAppsResponse setBody(AddMsGuardianAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsGuardianAppsResponseBody getBody() {
        return this.body;
    }

}
