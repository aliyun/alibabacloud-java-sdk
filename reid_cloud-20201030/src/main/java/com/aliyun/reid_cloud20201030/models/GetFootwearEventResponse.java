// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class GetFootwearEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFootwearEventResponseBody body;

    public static GetFootwearEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFootwearEventResponse self = new GetFootwearEventResponse();
        return TeaModel.build(map, self);
    }

    public GetFootwearEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFootwearEventResponse setBody(GetFootwearEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFootwearEventResponseBody getBody() {
        return this.body;
    }

}
