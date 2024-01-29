// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectFeatureEntityHotIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectFeatureEntityHotIdsResponseBody body;

    public static GetProjectFeatureEntityHotIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectFeatureEntityHotIdsResponse self = new GetProjectFeatureEntityHotIdsResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectFeatureEntityHotIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectFeatureEntityHotIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectFeatureEntityHotIdsResponse setBody(GetProjectFeatureEntityHotIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectFeatureEntityHotIdsResponseBody getBody() {
        return this.body;
    }

}
