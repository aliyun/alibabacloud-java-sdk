// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponseBody body;

    public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponse setBody(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestnoteResponseBody getBody() {
        return this.body;
    }

}
