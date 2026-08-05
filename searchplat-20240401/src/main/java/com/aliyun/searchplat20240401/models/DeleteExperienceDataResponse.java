// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteExperienceDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExperienceDataResponseBody body;

    public static DeleteExperienceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperienceDataResponse self = new DeleteExperienceDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExperienceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExperienceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExperienceDataResponse setBody(DeleteExperienceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExperienceDataResponseBody getBody() {
        return this.body;
    }

}
