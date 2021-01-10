// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgettoppipelinesofuserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody body;

    public static GetLinkeBahamutPipelinesgettoppipelinesofuserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgettoppipelinesofuserResponse self = new GetLinkeBahamutPipelinesgettoppipelinesofuserResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponse setBody(GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody getBody() {
        return this.body;
    }

}
