// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantmembersuseridResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody body;

    public static UpdateLinkeantcodeAntcodeTenantmembersuseridResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantmembersuseridResponse self = new UpdateLinkeantcodeAntcodeTenantmembersuseridResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponse setBody(UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody getBody() {
        return this.body;
    }

}
