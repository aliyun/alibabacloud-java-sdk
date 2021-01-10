// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetjarlogurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPipelinegetjarlogurlResponseBody body;

    public static GetLinkeBahamutPipelinegetjarlogurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetjarlogurlResponse self = new GetLinkeBahamutPipelinegetjarlogurlResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetjarlogurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPipelinegetjarlogurlResponse setBody(GetLinkeBahamutPipelinegetjarlogurlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPipelinegetjarlogurlResponseBody getBody() {
        return this.body;
    }

}
