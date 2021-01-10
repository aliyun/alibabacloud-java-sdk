// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeRemoveprojectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeantcodeAntcodeRemoveprojectResponseBody body;

    public static RemoveLinkeantcodeAntcodeRemoveprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeRemoveprojectResponse self = new RemoveLinkeantcodeAntcodeRemoveprojectResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeRemoveprojectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeantcodeAntcodeRemoveprojectResponse setBody(RemoveLinkeantcodeAntcodeRemoveprojectResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeantcodeAntcodeRemoveprojectResponseBody getBody() {
        return this.body;
    }

}
