// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWifiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagWifiResponseBody body;

    public static DescribeSagWifiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWifiResponse self = new DescribeSagWifiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagWifiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagWifiResponse setBody(DescribeSagWifiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagWifiResponseBody getBody() {
        return this.body;
    }

}
