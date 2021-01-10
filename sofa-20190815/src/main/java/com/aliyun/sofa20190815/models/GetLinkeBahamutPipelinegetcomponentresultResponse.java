// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetcomponentresultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPipelinegetcomponentresultResponseBody body;

    public static GetLinkeBahamutPipelinegetcomponentresultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetcomponentresultResponse self = new GetLinkeBahamutPipelinegetcomponentresultResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPipelinegetcomponentresultResponse setBody(GetLinkeBahamutPipelinegetcomponentresultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPipelinegetcomponentresultResponseBody getBody() {
        return this.body;
    }

}
