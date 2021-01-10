// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeMembersdeletenamespacememberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeMembersdeletenamespacememberResponseBody body;

    public static DeleteLinkeantcodeAntcodeMembersdeletenamespacememberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeMembersdeletenamespacememberResponse self = new DeleteLinkeantcodeAntcodeMembersdeletenamespacememberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeMembersdeletenamespacememberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeMembersdeletenamespacememberResponse setBody(DeleteLinkeantcodeAntcodeMembersdeletenamespacememberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeMembersdeletenamespacememberResponseBody getBody() {
        return this.body;
    }

}
