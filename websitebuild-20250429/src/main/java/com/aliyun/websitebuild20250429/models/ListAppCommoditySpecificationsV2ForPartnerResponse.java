// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppCommoditySpecificationsV2ForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppCommoditySpecificationsV2ForPartnerResponseBody body;

    public static ListAppCommoditySpecificationsV2ForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppCommoditySpecificationsV2ForPartnerResponse self = new ListAppCommoditySpecificationsV2ForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponse setBody(ListAppCommoditySpecificationsV2ForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppCommoditySpecificationsV2ForPartnerResponseBody getBody() {
        return this.body;
    }

}
