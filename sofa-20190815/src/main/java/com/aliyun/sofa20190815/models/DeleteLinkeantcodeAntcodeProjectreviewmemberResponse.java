// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeProjectreviewmemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeProjectreviewmemberResponseBody body;

    public static DeleteLinkeantcodeAntcodeProjectreviewmemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeProjectreviewmemberResponse self = new DeleteLinkeantcodeAntcodeProjectreviewmemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeProjectreviewmemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewmemberResponse setBody(DeleteLinkeantcodeAntcodeProjectreviewmemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeProjectreviewmemberResponseBody getBody() {
        return this.body;
    }

}
