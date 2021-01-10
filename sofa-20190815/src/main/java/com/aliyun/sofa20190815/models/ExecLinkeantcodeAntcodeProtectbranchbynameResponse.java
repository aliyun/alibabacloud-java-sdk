// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeProtectbranchbynameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody body;

    public static ExecLinkeantcodeAntcodeProtectbranchbynameResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeProtectbranchbynameResponse self = new ExecLinkeantcodeAntcodeProtectbranchbynameResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponse setBody(ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody getBody() {
        return this.body;
    }

}
