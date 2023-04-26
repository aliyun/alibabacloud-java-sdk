// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListIdentityToBenefitPkgMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIdentityToBenefitPkgMappingResponseBody body;

    public static ListIdentityToBenefitPkgMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityToBenefitPkgMappingResponse self = new ListIdentityToBenefitPkgMappingResponse();
        return TeaModel.build(map, self);
    }

    public ListIdentityToBenefitPkgMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIdentityToBenefitPkgMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIdentityToBenefitPkgMappingResponse setBody(ListIdentityToBenefitPkgMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIdentityToBenefitPkgMappingResponseBody getBody() {
        return this.body;
    }

}
