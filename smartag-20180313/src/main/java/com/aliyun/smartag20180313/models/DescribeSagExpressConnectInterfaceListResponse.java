// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagExpressConnectInterfaceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagExpressConnectInterfaceListResponseBody body;

    public static DescribeSagExpressConnectInterfaceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagExpressConnectInterfaceListResponse self = new DescribeSagExpressConnectInterfaceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagExpressConnectInterfaceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagExpressConnectInterfaceListResponse setBody(DescribeSagExpressConnectInterfaceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagExpressConnectInterfaceListResponseBody getBody() {
        return this.body;
    }

}
