// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeManagementrecyclebinResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeManagementrecyclebinResponseBody body;

    public static DeleteLinkeantcodeAntcodeManagementrecyclebinResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeManagementrecyclebinResponse self = new DeleteLinkeantcodeAntcodeManagementrecyclebinResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeManagementrecyclebinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeManagementrecyclebinResponse setBody(DeleteLinkeantcodeAntcodeManagementrecyclebinResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeManagementrecyclebinResponseBody getBody() {
        return this.body;
    }

}
