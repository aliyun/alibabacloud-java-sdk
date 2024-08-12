// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetAppOtaLatestVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppOtaLatestVersionResponseBody body;

    public static GetAppOtaLatestVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppOtaLatestVersionResponse self = new GetAppOtaLatestVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetAppOtaLatestVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppOtaLatestVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppOtaLatestVersionResponse setBody(GetAppOtaLatestVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppOtaLatestVersionResponseBody getBody() {
        return this.body;
    }

}
