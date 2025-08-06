// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlanSpecificationForLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPlanSpecificationForLicenseResponseBody body;

    public static GetPlanSpecificationForLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlanSpecificationForLicenseResponse self = new GetPlanSpecificationForLicenseResponse();
        return TeaModel.build(map, self);
    }

    public GetPlanSpecificationForLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPlanSpecificationForLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPlanSpecificationForLicenseResponse setBody(GetPlanSpecificationForLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPlanSpecificationForLicenseResponseBody getBody() {
        return this.body;
    }

}
