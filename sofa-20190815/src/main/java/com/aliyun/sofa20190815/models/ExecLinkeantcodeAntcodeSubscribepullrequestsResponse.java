// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeSubscribepullrequestsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeSubscribepullrequestsResponseBody body;

    public static ExecLinkeantcodeAntcodeSubscribepullrequestsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeSubscribepullrequestsResponse self = new ExecLinkeantcodeAntcodeSubscribepullrequestsResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeSubscribepullrequestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeSubscribepullrequestsResponse setBody(ExecLinkeantcodeAntcodeSubscribepullrequestsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeSubscribepullrequestsResponseBody getBody() {
        return this.body;
    }

}
