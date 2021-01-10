// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeantcodeAntcodeCancelreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLinkeantcodeAntcodeCancelreviewResponseBody body;

    public static CancelLinkeantcodeAntcodeCancelreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeantcodeAntcodeCancelreviewResponse self = new CancelLinkeantcodeAntcodeCancelreviewResponse();
        return TeaModel.build(map, self);
    }

    public CancelLinkeantcodeAntcodeCancelreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLinkeantcodeAntcodeCancelreviewResponse setBody(CancelLinkeantcodeAntcodeCancelreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLinkeantcodeAntcodeCancelreviewResponseBody getBody() {
        return this.body;
    }

}
