// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableLinkeantcodeAntcodeNamespacesidinstallationsserviceidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableLinkeantcodeAntcodeNamespacesidinstallationsserviceidResponseBody body;

    public static DisableLinkeantcodeAntcodeNamespacesidinstallationsserviceidResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLinkeantcodeAntcodeNamespacesidinstallationsserviceidResponse self = new DisableLinkeantcodeAntcodeNamespacesidinstallationsserviceidResponse();
        return TeaModel.build(map, self);
    }

    public DisableLinkeantcodeAntcodeNamespacesidinstallationsserviceidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableLinkeantcodeAntcodeNamespacesidinstallationsserviceidResponse setBody(DisableLinkeantcodeAntcodeNamespacesidinstallationsserviceidResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableLinkeantcodeAntcodeNamespacesidinstallationsserviceidResponseBody getBody() {
        return this.body;
    }

}
