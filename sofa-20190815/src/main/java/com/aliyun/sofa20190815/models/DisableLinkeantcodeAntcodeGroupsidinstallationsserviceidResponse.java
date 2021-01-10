// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidResponseBody body;

    public static DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidResponse self = new DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidResponse();
        return TeaModel.build(map, self);
    }

    public DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidResponse setBody(DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidResponseBody getBody() {
        return this.body;
    }

}
