// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeletenamespacememberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeDeletenamespacememberResponseBody body;

    public static DeleteLinkeantcodeAntcodeDeletenamespacememberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeletenamespacememberResponse self = new DeleteLinkeantcodeAntcodeDeletenamespacememberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeletenamespacememberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeDeletenamespacememberResponse setBody(DeleteLinkeantcodeAntcodeDeletenamespacememberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeDeletenamespacememberResponseBody getBody() {
        return this.body;
    }

}
