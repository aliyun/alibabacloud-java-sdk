// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody body;

    public static UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse self = new UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse setBody(UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody getBody() {
        return this.body;
    }

}
