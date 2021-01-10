// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody body;

    public static RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse self = new RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponse setBody(RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionResponseBody getBody() {
        return this.body;
    }

}
