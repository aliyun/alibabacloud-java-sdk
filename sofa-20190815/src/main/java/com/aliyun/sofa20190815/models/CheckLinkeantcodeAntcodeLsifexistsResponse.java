// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeantcodeAntcodeLsifexistsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeantcodeAntcodeLsifexistsResponseBody body;

    public static CheckLinkeantcodeAntcodeLsifexistsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeantcodeAntcodeLsifexistsResponse self = new CheckLinkeantcodeAntcodeLsifexistsResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeantcodeAntcodeLsifexistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeantcodeAntcodeLsifexistsResponse setBody(CheckLinkeantcodeAntcodeLsifexistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeantcodeAntcodeLsifexistsResponseBody getBody() {
        return this.body;
    }

}
