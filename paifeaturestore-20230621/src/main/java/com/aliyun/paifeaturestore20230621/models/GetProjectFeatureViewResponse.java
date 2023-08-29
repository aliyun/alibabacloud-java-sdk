// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectFeatureViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectFeatureViewResponseBody body;

    public static GetProjectFeatureViewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectFeatureViewResponse self = new GetProjectFeatureViewResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectFeatureViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectFeatureViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectFeatureViewResponse setBody(GetProjectFeatureViewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectFeatureViewResponseBody getBody() {
        return this.body;
    }

}
