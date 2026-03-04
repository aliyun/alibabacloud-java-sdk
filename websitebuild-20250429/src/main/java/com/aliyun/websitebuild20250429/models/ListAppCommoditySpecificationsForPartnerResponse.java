// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppCommoditySpecificationsForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppCommoditySpecificationsForPartnerResponseBody body;

    public static ListAppCommoditySpecificationsForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppCommoditySpecificationsForPartnerResponse self = new ListAppCommoditySpecificationsForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public ListAppCommoditySpecificationsForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppCommoditySpecificationsForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppCommoditySpecificationsForPartnerResponse setBody(ListAppCommoditySpecificationsForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppCommoditySpecificationsForPartnerResponseBody getBody() {
        return this.body;
    }

}
