// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetlibhostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPipelinegetlibhostResponseBody body;

    public static GetLinkeBahamutPipelinegetlibhostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetlibhostResponse self = new GetLinkeBahamutPipelinegetlibhostResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetlibhostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPipelinegetlibhostResponse setBody(GetLinkeBahamutPipelinegetlibhostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPipelinegetlibhostResponseBody getBody() {
        return this.body;
    }

}
