// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeDeleteprojectmemberResponseBody body;

    public static DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse self = new DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse setBody(DeleteLinkeantcodeAntcodeDeleteprojectmemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeDeleteprojectmemberResponseBody getBody() {
        return this.body;
    }

}
