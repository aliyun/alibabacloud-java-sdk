// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeInstallationsserfviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeInstallationsserfviceResponseBody body;

    public static DeleteLinkeantcodeAntcodeInstallationsserfviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeInstallationsserfviceResponse self = new DeleteLinkeantcodeAntcodeInstallationsserfviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeInstallationsserfviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeInstallationsserfviceResponse setBody(DeleteLinkeantcodeAntcodeInstallationsserfviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeInstallationsserfviceResponseBody getBody() {
        return this.body;
    }

}
