// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetiterationpipelinegroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationgetiterationpipelinegroupsResponseBody body;

    public static GetLinkeBahamutIterationgetiterationpipelinegroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetiterationpipelinegroupsResponse self = new GetLinkeBahamutIterationgetiterationpipelinegroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsResponse setBody(GetLinkeBahamutIterationgetiterationpipelinegroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationgetiterationpipelinegroupsResponseBody getBody() {
        return this.body;
    }

}
