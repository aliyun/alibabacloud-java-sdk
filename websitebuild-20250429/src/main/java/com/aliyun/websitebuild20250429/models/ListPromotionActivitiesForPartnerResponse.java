// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListPromotionActivitiesForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPromotionActivitiesForPartnerResponseBody body;

    public static ListPromotionActivitiesForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPromotionActivitiesForPartnerResponse self = new ListPromotionActivitiesForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public ListPromotionActivitiesForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPromotionActivitiesForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPromotionActivitiesForPartnerResponse setBody(ListPromotionActivitiesForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPromotionActivitiesForPartnerResponseBody getBody() {
        return this.body;
    }

}
