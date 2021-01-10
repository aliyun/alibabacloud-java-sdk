// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeTenantinstallationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeTenantinstallationsResponseBody body;

    public static AddLinkeantcodeAntcodeTenantinstallationsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeTenantinstallationsResponse self = new AddLinkeantcodeAntcodeTenantinstallationsResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeTenantinstallationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeTenantinstallationsResponse setBody(AddLinkeantcodeAntcodeTenantinstallationsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeTenantinstallationsResponseBody getBody() {
        return this.body;
    }

}
