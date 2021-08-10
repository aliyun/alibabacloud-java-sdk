// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotSceneDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotspotSceneDataResponseBody body;

    public static GetHotspotSceneDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotSceneDataResponse self = new GetHotspotSceneDataResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotSceneDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotspotSceneDataResponse setBody(GetHotspotSceneDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotspotSceneDataResponseBody getBody() {
        return this.body;
    }

}
