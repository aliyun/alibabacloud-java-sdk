// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSPlanTimeseriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSPlanTimeseriesResponseBody body;

    public static GetAKSPlanTimeseriesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSPlanTimeseriesResponse self = new GetAKSPlanTimeseriesResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSPlanTimeseriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSPlanTimeseriesResponse setBody(GetAKSPlanTimeseriesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSPlanTimeseriesResponseBody getBody() {
        return this.body;
    }

}
