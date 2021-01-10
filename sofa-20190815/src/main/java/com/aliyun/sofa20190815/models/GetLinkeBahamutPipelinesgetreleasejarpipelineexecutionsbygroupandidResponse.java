// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody body;

    public static GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse self = new GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponse setBody(GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody getBody() {
        return this.body;
    }

}
