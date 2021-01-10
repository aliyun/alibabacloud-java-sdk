// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetexecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPipelinegetexecutionResponseBody body;

    public static GetLinkeBahamutPipelinegetexecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetexecutionResponse self = new GetLinkeBahamutPipelinegetexecutionResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetexecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPipelinegetexecutionResponse setBody(GetLinkeBahamutPipelinegetexecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPipelinegetexecutionResponseBody getBody() {
        return this.body;
    }

}
