// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetIcpFilingInfoForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIcpFilingInfoForPartnerResponseBody body;

    public static GetIcpFilingInfoForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIcpFilingInfoForPartnerResponse self = new GetIcpFilingInfoForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public GetIcpFilingInfoForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIcpFilingInfoForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIcpFilingInfoForPartnerResponse setBody(GetIcpFilingInfoForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIcpFilingInfoForPartnerResponseBody getBody() {
        return this.body;
    }

}
