// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppInstanceForAdminResponseBody body;

    public static GetAppInstanceForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceForAdminResponse self = new GetAppInstanceForAdminResponse();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppInstanceForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppInstanceForAdminResponse setBody(GetAppInstanceForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppInstanceForAdminResponseBody getBody() {
        return this.body;
    }

}
