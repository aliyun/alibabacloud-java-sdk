// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetSpecificationsForLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSpecificationsForLicenseResponseBody body;

    public static GetSpecificationsForLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpecificationsForLicenseResponse self = new GetSpecificationsForLicenseResponse();
        return TeaModel.build(map, self);
    }

    public GetSpecificationsForLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpecificationsForLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpecificationsForLicenseResponse setBody(GetSpecificationsForLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpecificationsForLicenseResponseBody getBody() {
        return this.body;
    }

}
