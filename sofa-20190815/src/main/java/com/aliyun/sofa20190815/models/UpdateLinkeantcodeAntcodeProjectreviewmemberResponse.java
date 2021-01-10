// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectreviewmemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeProjectreviewmemberResponseBody body;

    public static UpdateLinkeantcodeAntcodeProjectreviewmemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectreviewmemberResponse self = new UpdateLinkeantcodeAntcodeProjectreviewmemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectreviewmemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewmemberResponse setBody(UpdateLinkeantcodeAntcodeProjectreviewmemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeProjectreviewmemberResponseBody getBody() {
        return this.body;
    }

}
