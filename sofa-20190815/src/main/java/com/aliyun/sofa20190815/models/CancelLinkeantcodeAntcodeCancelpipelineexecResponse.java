// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeantcodeAntcodeCancelpipelineexecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLinkeantcodeAntcodeCancelpipelineexecResponseBody body;

    public static CancelLinkeantcodeAntcodeCancelpipelineexecResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeantcodeAntcodeCancelpipelineexecResponse self = new CancelLinkeantcodeAntcodeCancelpipelineexecResponse();
        return TeaModel.build(map, self);
    }

    public CancelLinkeantcodeAntcodeCancelpipelineexecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLinkeantcodeAntcodeCancelpipelineexecResponse setBody(CancelLinkeantcodeAntcodeCancelpipelineexecResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLinkeantcodeAntcodeCancelpipelineexecResponseBody getBody() {
        return this.body;
    }

}
