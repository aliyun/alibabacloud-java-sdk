// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetexecutionsbygroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPipelinegetexecutionsbygroupResponseBody body;

    public static GetLinkeBahamutPipelinegetexecutionsbygroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetexecutionsbygroupResponse self = new GetLinkeBahamutPipelinegetexecutionsbygroupResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetexecutionsbygroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPipelinegetexecutionsbygroupResponse setBody(GetLinkeBahamutPipelinegetexecutionsbygroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPipelinegetexecutionsbygroupResponseBody getBody() {
        return this.body;
    }

}
