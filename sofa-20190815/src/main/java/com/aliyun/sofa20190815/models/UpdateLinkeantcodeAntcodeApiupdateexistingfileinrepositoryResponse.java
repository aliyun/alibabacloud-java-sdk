// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody body;

    public static UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse self = new UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse setBody(UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody getBody() {
        return this.body;
    }

}
