// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListPromotionOfferRecordsForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPromotionOfferRecordsForPartnerResponseBody body;

    public static ListPromotionOfferRecordsForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPromotionOfferRecordsForPartnerResponse self = new ListPromotionOfferRecordsForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public ListPromotionOfferRecordsForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPromotionOfferRecordsForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPromotionOfferRecordsForPartnerResponse setBody(ListPromotionOfferRecordsForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPromotionOfferRecordsForPartnerResponseBody getBody() {
        return this.body;
    }

}
