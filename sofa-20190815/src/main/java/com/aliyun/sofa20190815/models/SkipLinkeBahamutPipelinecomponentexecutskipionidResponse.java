// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipLinkeBahamutPipelinecomponentexecutskipionidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SkipLinkeBahamutPipelinecomponentexecutskipionidResponseBody body;

    public static SkipLinkeBahamutPipelinecomponentexecutskipionidResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipLinkeBahamutPipelinecomponentexecutskipionidResponse self = new SkipLinkeBahamutPipelinecomponentexecutskipionidResponse();
        return TeaModel.build(map, self);
    }

    public SkipLinkeBahamutPipelinecomponentexecutskipionidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipLinkeBahamutPipelinecomponentexecutskipionidResponse setBody(SkipLinkeBahamutPipelinecomponentexecutskipionidResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipLinkeBahamutPipelinecomponentexecutskipionidResponseBody getBody() {
        return this.body;
    }

}
