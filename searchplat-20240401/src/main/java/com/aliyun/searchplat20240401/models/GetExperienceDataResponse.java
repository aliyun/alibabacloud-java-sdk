// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetExperienceDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperienceDataResponseBody body;

    public static GetExperienceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperienceDataResponse self = new GetExperienceDataResponse();
        return TeaModel.build(map, self);
    }

    public GetExperienceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperienceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperienceDataResponse setBody(GetExperienceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperienceDataResponseBody getBody() {
        return this.body;
    }

}
