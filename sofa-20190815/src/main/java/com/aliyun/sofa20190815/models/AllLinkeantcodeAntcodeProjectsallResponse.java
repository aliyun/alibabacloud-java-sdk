// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllLinkeantcodeAntcodeProjectsallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllLinkeantcodeAntcodeProjectsallResponseBody body;

    public static AllLinkeantcodeAntcodeProjectsallResponse build(java.util.Map<String, ?> map) throws Exception {
        AllLinkeantcodeAntcodeProjectsallResponse self = new AllLinkeantcodeAntcodeProjectsallResponse();
        return TeaModel.build(map, self);
    }

    public AllLinkeantcodeAntcodeProjectsallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllLinkeantcodeAntcodeProjectsallResponse setBody(AllLinkeantcodeAntcodeProjectsallResponseBody body) {
        this.body = body;
        return this;
    }
    public AllLinkeantcodeAntcodeProjectsallResponseBody getBody() {
        return this.body;
    }

}
