// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeProjectslabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeProjectslabelResponseBody body;

    public static DeleteLinkeantcodeAntcodeProjectslabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeProjectslabelResponse self = new DeleteLinkeantcodeAntcodeProjectslabelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeProjectslabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeProjectslabelResponse setBody(DeleteLinkeantcodeAntcodeProjectslabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeProjectslabelResponseBody getBody() {
        return this.body;
    }

}
