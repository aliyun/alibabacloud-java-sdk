// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateRecommendParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemplateRecommendParametersResponseBody body;

    public static GetTemplateRecommendParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRecommendParametersResponse self = new GetTemplateRecommendParametersResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateRecommendParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateRecommendParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateRecommendParametersResponse setBody(GetTemplateRecommendParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateRecommendParametersResponseBody getBody() {
        return this.body;
    }

}
