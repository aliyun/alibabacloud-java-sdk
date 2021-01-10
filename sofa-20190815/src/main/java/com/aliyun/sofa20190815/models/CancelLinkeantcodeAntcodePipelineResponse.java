// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeantcodeAntcodePipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLinkeantcodeAntcodePipelineResponseBody body;

    public static CancelLinkeantcodeAntcodePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeantcodeAntcodePipelineResponse self = new CancelLinkeantcodeAntcodePipelineResponse();
        return TeaModel.build(map, self);
    }

    public CancelLinkeantcodeAntcodePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLinkeantcodeAntcodePipelineResponse setBody(CancelLinkeantcodeAntcodePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLinkeantcodeAntcodePipelineResponseBody getBody() {
        return this.body;
    }

}
