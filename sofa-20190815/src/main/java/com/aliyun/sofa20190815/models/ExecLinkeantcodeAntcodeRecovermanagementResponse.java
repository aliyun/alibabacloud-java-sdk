// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeRecovermanagementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeRecovermanagementResponseBody body;

    public static ExecLinkeantcodeAntcodeRecovermanagementResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeRecovermanagementResponse self = new ExecLinkeantcodeAntcodeRecovermanagementResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeRecovermanagementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeRecovermanagementResponse setBody(ExecLinkeantcodeAntcodeRecovermanagementResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeRecovermanagementResponseBody getBody() {
        return this.body;
    }

}
