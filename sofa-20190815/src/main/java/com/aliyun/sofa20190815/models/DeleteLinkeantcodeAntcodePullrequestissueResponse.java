// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodePullrequestissueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodePullrequestissueResponseBody body;

    public static DeleteLinkeantcodeAntcodePullrequestissueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodePullrequestissueResponse self = new DeleteLinkeantcodeAntcodePullrequestissueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodePullrequestissueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodePullrequestissueResponse setBody(DeleteLinkeantcodeAntcodePullrequestissueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodePullrequestissueResponseBody getBody() {
        return this.body;
    }

}
