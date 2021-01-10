// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody body;

    public static UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse self = new UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse setBody(UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseBody getBody() {
        return this.body;
    }

}
