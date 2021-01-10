// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodePullrequestssourcebranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody body;

    public static RemoveLinkeantcodeAntcodePullrequestssourcebranchResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodePullrequestssourcebranchResponse self = new RemoveLinkeantcodeAntcodePullrequestssourcebranchResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodePullrequestssourcebranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeantcodeAntcodePullrequestssourcebranchResponse setBody(RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeantcodeAntcodePullrequestssourcebranchResponseBody getBody() {
        return this.body;
    }

}
