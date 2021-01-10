// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeComplexfindfilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeComplexfindfilesResponseBody body;

    public static ExecLinkeantcodeAntcodeComplexfindfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeComplexfindfilesResponse self = new ExecLinkeantcodeAntcodeComplexfindfilesResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeComplexfindfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeComplexfindfilesResponse setBody(ExecLinkeantcodeAntcodeComplexfindfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeComplexfindfilesResponseBody getBody() {
        return this.body;
    }

}
