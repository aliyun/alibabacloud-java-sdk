// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody body;

    public static UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponse self = new UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponse setBody(UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdatepipelinetimingconfigResponseBody getBody() {
        return this.body;
    }

}
