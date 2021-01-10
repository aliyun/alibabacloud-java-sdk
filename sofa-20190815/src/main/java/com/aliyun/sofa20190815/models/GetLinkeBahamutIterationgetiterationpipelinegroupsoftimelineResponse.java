// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponseBody body;

    public static GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse self = new GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponse setBody(GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineResponseBody getBody() {
        return this.body;
    }

}
