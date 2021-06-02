// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotspotTagResponseBody body;

    public static GetHotspotTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotTagResponse self = new GetHotspotTagResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotspotTagResponse setBody(GetHotspotTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotspotTagResponseBody getBody() {
        return this.body;
    }

}
