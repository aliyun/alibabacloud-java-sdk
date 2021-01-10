// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetcomponentresultvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody body;

    public static GetLinkeBahamutPipelinegetcomponentresultvResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetcomponentresultvResponse self = new GetLinkeBahamutPipelinegetcomponentresultvResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPipelinegetcomponentresultvResponse setBody(GetLinkeBahamutPipelinegetcomponentresultvResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPipelinegetcomponentresultvResponseBody getBody() {
        return this.body;
    }

}
