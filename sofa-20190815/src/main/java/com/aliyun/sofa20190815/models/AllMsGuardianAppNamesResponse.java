// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllMsGuardianAppNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllMsGuardianAppNamesResponseBody body;

    public static AllMsGuardianAppNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        AllMsGuardianAppNamesResponse self = new AllMsGuardianAppNamesResponse();
        return TeaModel.build(map, self);
    }

    public AllMsGuardianAppNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllMsGuardianAppNamesResponse setBody(AllMsGuardianAppNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public AllMsGuardianAppNamesResponseBody getBody() {
        return this.body;
    }

}
