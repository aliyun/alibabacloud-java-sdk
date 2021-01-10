// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeProjectbranchmergeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeProjectbranchmergeResponseBody body;

    public static ExecLinkeantcodeAntcodeProjectbranchmergeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeProjectbranchmergeResponse self = new ExecLinkeantcodeAntcodeProjectbranchmergeResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeProjectbranchmergeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeProjectbranchmergeResponse setBody(ExecLinkeantcodeAntcodeProjectbranchmergeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeProjectbranchmergeResponseBody getBody() {
        return this.body;
    }

}
