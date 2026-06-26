// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GrantPromotionOfferForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantPromotionOfferForPartnerResponseBody body;

    public static GrantPromotionOfferForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantPromotionOfferForPartnerResponse self = new GrantPromotionOfferForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public GrantPromotionOfferForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantPromotionOfferForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantPromotionOfferForPartnerResponse setBody(GrantPromotionOfferForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantPromotionOfferForPartnerResponseBody getBody() {
        return this.body;
    }

}
