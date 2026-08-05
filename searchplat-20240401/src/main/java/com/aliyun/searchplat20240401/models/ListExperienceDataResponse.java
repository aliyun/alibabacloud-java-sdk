// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListExperienceDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExperienceDataResponseBody body;

    public static ListExperienceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperienceDataResponse self = new ListExperienceDataResponse();
        return TeaModel.build(map, self);
    }

    public ListExperienceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperienceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperienceDataResponse setBody(ListExperienceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperienceDataResponseBody getBody() {
        return this.body;
    }

}
