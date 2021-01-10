// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableLinkeantcodeAntcodeNamespacesidinstallationsResponseBody body;

    public static EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse self = new EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse();
        return TeaModel.build(map, self);
    }

    public EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse setBody(EnableLinkeantcodeAntcodeNamespacesidinstallationsResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLinkeantcodeAntcodeNamespacesidinstallationsResponseBody getBody() {
        return this.body;
    }

}
