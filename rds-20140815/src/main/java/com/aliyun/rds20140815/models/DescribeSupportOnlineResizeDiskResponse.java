// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSupportOnlineResizeDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupportOnlineResizeDiskResponseBody body;

    public static DescribeSupportOnlineResizeDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportOnlineResizeDiskResponse self = new DescribeSupportOnlineResizeDiskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportOnlineResizeDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportOnlineResizeDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupportOnlineResizeDiskResponse setBody(DescribeSupportOnlineResizeDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportOnlineResizeDiskResponseBody getBody() {
        return this.body;
    }

}
