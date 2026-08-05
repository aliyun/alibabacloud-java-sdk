// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateExperienceDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExperienceDataResponseBody body;

    public static CreateExperienceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExperienceDataResponse self = new CreateExperienceDataResponse();
        return TeaModel.build(map, self);
    }

    public CreateExperienceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExperienceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExperienceDataResponse setBody(CreateExperienceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperienceDataResponseBody getBody() {
        return this.body;
    }

}
