// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponseBody body;

    public static GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse self = new GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponse setBody(GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineResponseBody getBody() {
        return this.body;
    }

}
