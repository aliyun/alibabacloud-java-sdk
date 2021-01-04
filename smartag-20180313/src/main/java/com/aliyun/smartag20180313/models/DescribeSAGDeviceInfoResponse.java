// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSAGDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSAGDeviceInfoResponseBody body;

    public static DescribeSAGDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSAGDeviceInfoResponse self = new DescribeSAGDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSAGDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSAGDeviceInfoResponse setBody(DescribeSAGDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSAGDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
