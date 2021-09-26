// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DescribeSyncInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSyncInfoResponse setBody(DescribeSyncInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncInfoResponseBody getBody() {
        return this.body;
    }

}
