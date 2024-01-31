// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDTCSecurityIpHostsForSQLServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDTCSecurityIpHostsForSQLServerResponseBody body;

    public static DescribeDTCSecurityIpHostsForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDTCSecurityIpHostsForSQLServerResponse self = new DescribeDTCSecurityIpHostsForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDTCSecurityIpHostsForSQLServerResponse setBody(DescribeDTCSecurityIpHostsForSQLServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDTCSecurityIpHostsForSQLServerResponseBody getBody() {
        return this.body;
    }

}
