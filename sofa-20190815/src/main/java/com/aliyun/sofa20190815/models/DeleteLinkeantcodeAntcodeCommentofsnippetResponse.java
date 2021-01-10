// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeCommentofsnippetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeCommentofsnippetResponseBody body;

    public static DeleteLinkeantcodeAntcodeCommentofsnippetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeCommentofsnippetResponse self = new DeleteLinkeantcodeAntcodeCommentofsnippetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeCommentofsnippetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeCommentofsnippetResponse setBody(DeleteLinkeantcodeAntcodeCommentofsnippetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeCommentofsnippetResponseBody getBody() {
        return this.body;
    }

}
