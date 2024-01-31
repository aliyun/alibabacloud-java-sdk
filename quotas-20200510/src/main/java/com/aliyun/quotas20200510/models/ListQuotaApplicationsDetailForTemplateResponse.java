// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsDetailForTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQuotaApplicationsDetailForTemplateResponseBody body;

    public static ListQuotaApplicationsDetailForTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationsDetailForTemplateResponse self = new ListQuotaApplicationsDetailForTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationsDetailForTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotaApplicationsDetailForTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotaApplicationsDetailForTemplateResponse setBody(ListQuotaApplicationsDetailForTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotaApplicationsDetailForTemplateResponseBody getBody() {
        return this.body;
    }

}
