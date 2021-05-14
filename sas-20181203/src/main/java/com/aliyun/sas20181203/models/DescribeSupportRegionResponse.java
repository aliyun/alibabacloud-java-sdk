// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSupportRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSupportRegionResponseBody body;

    public static DescribeSupportRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportRegionResponse self = new DescribeSupportRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportRegionResponse setBody(DescribeSupportRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportRegionResponseBody getBody() {
        return this.body;
    }

}
