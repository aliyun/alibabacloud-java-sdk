// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeManagementtagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeManagementtagResponseBody body;

    public static DeleteLinkeantcodeAntcodeManagementtagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeManagementtagResponse self = new DeleteLinkeantcodeAntcodeManagementtagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeManagementtagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeManagementtagResponse setBody(DeleteLinkeantcodeAntcodeManagementtagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeManagementtagResponseBody getBody() {
        return this.body;
    }

}
