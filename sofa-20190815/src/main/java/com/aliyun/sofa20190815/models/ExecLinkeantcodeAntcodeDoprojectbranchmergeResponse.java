// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeDoprojectbranchmergeResponseBody body;

    public static ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse self = new ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse setBody(ExecLinkeantcodeAntcodeDoprojectbranchmergeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeDoprojectbranchmergeResponseBody getBody() {
        return this.body;
    }

}
