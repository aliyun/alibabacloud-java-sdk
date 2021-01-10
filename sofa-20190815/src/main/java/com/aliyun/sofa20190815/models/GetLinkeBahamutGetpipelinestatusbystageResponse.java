// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetpipelinestatusbystageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutGetpipelinestatusbystageResponseBody body;

    public static GetLinkeBahamutGetpipelinestatusbystageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetpipelinestatusbystageResponse self = new GetLinkeBahamutGetpipelinestatusbystageResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutGetpipelinestatusbystageResponse setBody(GetLinkeBahamutGetpipelinestatusbystageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutGetpipelinestatusbystageResponseBody getBody() {
        return this.body;
    }

}
