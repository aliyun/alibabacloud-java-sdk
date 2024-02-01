// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSslVpnClientsResponseBody body;

    public static DescribeSslVpnClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientsResponse self = new DescribeSslVpnClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSslVpnClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSslVpnClientsResponse setBody(DescribeSslVpnClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSslVpnClientsResponseBody getBody() {
        return this.body;
    }

}
