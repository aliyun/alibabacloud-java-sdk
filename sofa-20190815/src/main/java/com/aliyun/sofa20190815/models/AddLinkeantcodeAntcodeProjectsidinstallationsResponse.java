// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeProjectsidinstallationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeProjectsidinstallationsResponseBody body;

    public static AddLinkeantcodeAntcodeProjectsidinstallationsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeProjectsidinstallationsResponse self = new AddLinkeantcodeAntcodeProjectsidinstallationsResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeProjectsidinstallationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeProjectsidinstallationsResponse setBody(AddLinkeantcodeAntcodeProjectsidinstallationsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeProjectsidinstallationsResponseBody getBody() {
        return this.body;
    }

}
