// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeBahamutPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLinkeBahamutPipelineResponseBody body;

    public static CancelLinkeBahamutPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeBahamutPipelineResponse self = new CancelLinkeBahamutPipelineResponse();
        return TeaModel.build(map, self);
    }

    public CancelLinkeBahamutPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLinkeBahamutPipelineResponse setBody(CancelLinkeBahamutPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLinkeBahamutPipelineResponseBody getBody() {
        return this.body;
    }

}
