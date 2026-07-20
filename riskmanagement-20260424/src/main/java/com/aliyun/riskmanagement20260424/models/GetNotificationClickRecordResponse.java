// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetNotificationClickRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNotificationClickRecordResponseBody body;

    public static GetNotificationClickRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNotificationClickRecordResponse self = new GetNotificationClickRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetNotificationClickRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNotificationClickRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNotificationClickRecordResponse setBody(GetNotificationClickRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNotificationClickRecordResponseBody getBody() {
        return this.body;
    }

}
