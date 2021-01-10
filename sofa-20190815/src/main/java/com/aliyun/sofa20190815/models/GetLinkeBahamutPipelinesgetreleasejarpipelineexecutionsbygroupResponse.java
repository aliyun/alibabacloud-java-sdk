// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponseBody body;

    public static GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse self = new GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponse setBody(GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupResponseBody getBody() {
        return this.body;
    }

}
