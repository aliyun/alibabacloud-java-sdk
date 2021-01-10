// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponseBody body;

    public static DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse self = new DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponse setBody(DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeDeletepipelinetimingconfigResponseBody getBody() {
        return this.body;
    }

}
