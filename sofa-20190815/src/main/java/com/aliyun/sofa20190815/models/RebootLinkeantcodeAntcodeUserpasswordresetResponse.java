// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RebootLinkeantcodeAntcodeUserpasswordresetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebootLinkeantcodeAntcodeUserpasswordresetResponseBody body;

    public static RebootLinkeantcodeAntcodeUserpasswordresetResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootLinkeantcodeAntcodeUserpasswordresetResponse self = new RebootLinkeantcodeAntcodeUserpasswordresetResponse();
        return TeaModel.build(map, self);
    }

    public RebootLinkeantcodeAntcodeUserpasswordresetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootLinkeantcodeAntcodeUserpasswordresetResponse setBody(RebootLinkeantcodeAntcodeUserpasswordresetResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootLinkeantcodeAntcodeUserpasswordresetResponseBody getBody() {
        return this.body;
    }

}
