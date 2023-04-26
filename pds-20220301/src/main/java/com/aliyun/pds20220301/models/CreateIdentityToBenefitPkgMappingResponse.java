// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateIdentityToBenefitPkgMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    public static CreateIdentityToBenefitPkgMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityToBenefitPkgMappingResponse self = new CreateIdentityToBenefitPkgMappingResponse();
        return TeaModel.build(map, self);
    }

    public CreateIdentityToBenefitPkgMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIdentityToBenefitPkgMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
