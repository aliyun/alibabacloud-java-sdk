// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeMergepullrequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody body;

    public static ExecLinkeantcodeAntcodeMergepullrequestResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeMergepullrequestResponse self = new ExecLinkeantcodeAntcodeMergepullrequestResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponse setBody(ExecLinkeantcodeAntcodeMergepullrequestResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody getBody() {
        return this.body;
    }

}
