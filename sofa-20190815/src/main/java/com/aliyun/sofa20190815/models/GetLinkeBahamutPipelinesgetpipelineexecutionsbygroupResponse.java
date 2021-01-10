// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody body;

    public static GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse self = new GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponse setBody(GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupResponseBody getBody() {
        return this.body;
    }

}
