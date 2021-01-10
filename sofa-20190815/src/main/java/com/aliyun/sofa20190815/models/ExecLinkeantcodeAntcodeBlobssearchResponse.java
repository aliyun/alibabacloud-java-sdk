// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeBlobssearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeBlobssearchResponseBody body;

    public static ExecLinkeantcodeAntcodeBlobssearchResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeBlobssearchResponse self = new ExecLinkeantcodeAntcodeBlobssearchResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeBlobssearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeBlobssearchResponse setBody(ExecLinkeantcodeAntcodeBlobssearchResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeBlobssearchResponseBody getBody() {
        return this.body;
    }

}
