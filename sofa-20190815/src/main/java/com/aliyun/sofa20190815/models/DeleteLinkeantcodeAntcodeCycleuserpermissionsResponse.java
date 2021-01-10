// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeCycleuserpermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeCycleuserpermissionsResponseBody body;

    public static DeleteLinkeantcodeAntcodeCycleuserpermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeCycleuserpermissionsResponse self = new DeleteLinkeantcodeAntcodeCycleuserpermissionsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeCycleuserpermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeCycleuserpermissionsResponse setBody(DeleteLinkeantcodeAntcodeCycleuserpermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeCycleuserpermissionsResponseBody getBody() {
        return this.body;
    }

}
