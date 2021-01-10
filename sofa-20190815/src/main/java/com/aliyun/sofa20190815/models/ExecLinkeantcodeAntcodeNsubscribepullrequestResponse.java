// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeNsubscribepullrequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody body;

    public static ExecLinkeantcodeAntcodeNsubscribepullrequestResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeNsubscribepullrequestResponse self = new ExecLinkeantcodeAntcodeNsubscribepullrequestResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponse setBody(ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody getBody() {
        return this.body;
    }

}
