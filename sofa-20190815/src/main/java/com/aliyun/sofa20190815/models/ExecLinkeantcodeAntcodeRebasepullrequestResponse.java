// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeRebasepullrequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody body;

    public static ExecLinkeantcodeAntcodeRebasepullrequestResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeRebasepullrequestResponse self = new ExecLinkeantcodeAntcodeRebasepullrequestResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponse setBody(ExecLinkeantcodeAntcodeRebasepullrequestResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody getBody() {
        return this.body;
    }

}
