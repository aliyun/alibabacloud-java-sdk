// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeRerunfailedbypipelineResponseBody body;

    public static ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse self = new ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse setBody(ExecLinkeantcodeAntcodeRerunfailedbypipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeRerunfailedbypipelineResponseBody getBody() {
        return this.body;
    }

}
