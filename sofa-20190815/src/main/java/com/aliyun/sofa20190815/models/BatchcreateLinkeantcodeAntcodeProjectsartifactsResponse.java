// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateLinkeantcodeAntcodeProjectsartifactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchcreateLinkeantcodeAntcodeProjectsartifactsResponseBody body;

    public static BatchcreateLinkeantcodeAntcodeProjectsartifactsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateLinkeantcodeAntcodeProjectsartifactsResponse self = new BatchcreateLinkeantcodeAntcodeProjectsartifactsResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateLinkeantcodeAntcodeProjectsartifactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchcreateLinkeantcodeAntcodeProjectsartifactsResponse setBody(BatchcreateLinkeantcodeAntcodeProjectsartifactsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchcreateLinkeantcodeAntcodeProjectsartifactsResponseBody getBody() {
        return this.body;
    }

}
