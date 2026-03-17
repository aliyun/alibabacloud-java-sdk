// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagExpressConnectInterfaceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeSagExpressConnectInterfaceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagExpressConnectInterfaceListResponse setBody(DescribeSagExpressConnectInterfaceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagExpressConnectInterfaceListResponseBody getBody() {
        return this.body;
    }

}
