// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DescribeSyncInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSyncInfoResponseBody body;

    public static DescribeSyncInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncInfoResponse self = new DescribeSyncInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSyncInfoResponse setBody(DescribeSyncInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncInfoResponseBody getBody() {
        return this.body;
    }

}
