// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetRmsRdsResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRmsRdsResourcesResponseBody body;

    public static GetRmsRdsResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRmsRdsResourcesResponse self = new GetRmsRdsResourcesResponse();
        return TeaModel.build(map, self);
    }

    public GetRmsRdsResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRmsRdsResourcesResponse setBody(GetRmsRdsResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRmsRdsResourcesResponseBody getBody() {
        return this.body;
    }

}
