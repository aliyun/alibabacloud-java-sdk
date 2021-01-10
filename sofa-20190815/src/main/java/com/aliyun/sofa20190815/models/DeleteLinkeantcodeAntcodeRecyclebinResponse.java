// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeRecyclebinResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeRecyclebinResponseBody body;

    public static DeleteLinkeantcodeAntcodeRecyclebinResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeRecyclebinResponse self = new DeleteLinkeantcodeAntcodeRecyclebinResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeRecyclebinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeRecyclebinResponse setBody(DeleteLinkeantcodeAntcodeRecyclebinResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeRecyclebinResponseBody getBody() {
        return this.body;
    }

}
