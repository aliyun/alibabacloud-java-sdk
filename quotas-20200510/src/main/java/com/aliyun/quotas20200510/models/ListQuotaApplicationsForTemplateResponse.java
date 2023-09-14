// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsForTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListQuotaApplicationsForTemplateResponseBody body;

    public static ListQuotaApplicationsForTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationsForTemplateResponse self = new ListQuotaApplicationsForTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationsForTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotaApplicationsForTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotaApplicationsForTemplateResponse setBody(ListQuotaApplicationsForTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotaApplicationsForTemplateResponseBody getBody() {
        return this.body;
    }

}
