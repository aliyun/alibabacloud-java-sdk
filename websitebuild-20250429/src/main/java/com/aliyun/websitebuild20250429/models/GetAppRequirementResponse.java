// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppRequirementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppRequirementResponseBody body;

    public static GetAppRequirementResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppRequirementResponse self = new GetAppRequirementResponse();
        return TeaModel.build(map, self);
    }

    public GetAppRequirementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppRequirementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppRequirementResponse setBody(GetAppRequirementResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppRequirementResponseBody getBody() {
        return this.body;
    }

}
