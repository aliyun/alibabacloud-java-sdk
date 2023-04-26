// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetIdentityToBenefitPkgMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IdentityToBenefitPkgMapping body;

    public static GetIdentityToBenefitPkgMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityToBenefitPkgMappingResponse self = new GetIdentityToBenefitPkgMappingResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityToBenefitPkgMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityToBenefitPkgMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityToBenefitPkgMappingResponse setBody(IdentityToBenefitPkgMapping body) {
        this.body = body;
        return this;
    }
    public IdentityToBenefitPkgMapping getBody() {
        return this.body;
    }

}
