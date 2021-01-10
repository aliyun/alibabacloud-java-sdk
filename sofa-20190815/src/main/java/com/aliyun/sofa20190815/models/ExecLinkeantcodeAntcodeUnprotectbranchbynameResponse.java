// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeUnprotectbranchbynameResponseBody body;

    public static ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse self = new ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse setBody(ExecLinkeantcodeAntcodeUnprotectbranchbynameResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeUnprotectbranchbynameResponseBody getBody() {
        return this.body;
    }

}
