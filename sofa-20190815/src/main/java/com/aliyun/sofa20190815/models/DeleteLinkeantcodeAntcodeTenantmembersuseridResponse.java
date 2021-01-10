// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeTenantmembersuseridResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeTenantmembersuseridResponseBody body;

    public static DeleteLinkeantcodeAntcodeTenantmembersuseridResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeTenantmembersuseridResponse self = new DeleteLinkeantcodeAntcodeTenantmembersuseridResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeTenantmembersuseridResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeTenantmembersuseridResponse setBody(DeleteLinkeantcodeAntcodeTenantmembersuseridResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeTenantmembersuseridResponseBody getBody() {
        return this.body;
    }

}
