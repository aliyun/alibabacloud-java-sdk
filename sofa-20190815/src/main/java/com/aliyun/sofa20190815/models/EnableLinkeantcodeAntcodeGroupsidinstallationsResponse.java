// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableLinkeantcodeAntcodeGroupsidinstallationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableLinkeantcodeAntcodeGroupsidinstallationsResponseBody body;

    public static EnableLinkeantcodeAntcodeGroupsidinstallationsResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLinkeantcodeAntcodeGroupsidinstallationsResponse self = new EnableLinkeantcodeAntcodeGroupsidinstallationsResponse();
        return TeaModel.build(map, self);
    }

    public EnableLinkeantcodeAntcodeGroupsidinstallationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableLinkeantcodeAntcodeGroupsidinstallationsResponse setBody(EnableLinkeantcodeAntcodeGroupsidinstallationsResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLinkeantcodeAntcodeGroupsidinstallationsResponseBody getBody() {
        return this.body;
    }

}
