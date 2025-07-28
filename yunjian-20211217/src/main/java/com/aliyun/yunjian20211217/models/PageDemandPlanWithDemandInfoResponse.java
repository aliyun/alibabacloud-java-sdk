// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class PageDemandPlanWithDemandInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageDemandPlanWithDemandInfoResponseBody body;

    public static PageDemandPlanWithDemandInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        PageDemandPlanWithDemandInfoResponse self = new PageDemandPlanWithDemandInfoResponse();
        return TeaModel.build(map, self);
    }

    public PageDemandPlanWithDemandInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageDemandPlanWithDemandInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageDemandPlanWithDemandInfoResponse setBody(PageDemandPlanWithDemandInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public PageDemandPlanWithDemandInfoResponseBody getBody() {
        return this.body;
    }

}
