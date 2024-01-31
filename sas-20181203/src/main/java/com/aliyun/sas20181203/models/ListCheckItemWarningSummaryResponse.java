// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckItemWarningSummaryResponseBody body;

    public static ListCheckItemWarningSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemWarningSummaryResponse self = new ListCheckItemWarningSummaryResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckItemWarningSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckItemWarningSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckItemWarningSummaryResponse setBody(ListCheckItemWarningSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckItemWarningSummaryResponseBody getBody() {
        return this.body;
    }

}
