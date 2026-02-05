// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLServerUpgradeVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLServerUpgradeVersionsResponseBody body;

    public static DescribeSQLServerUpgradeVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLServerUpgradeVersionsResponse self = new DescribeSQLServerUpgradeVersionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLServerUpgradeVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLServerUpgradeVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLServerUpgradeVersionsResponse setBody(DescribeSQLServerUpgradeVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLServerUpgradeVersionsResponseBody getBody() {
        return this.body;
    }

}
