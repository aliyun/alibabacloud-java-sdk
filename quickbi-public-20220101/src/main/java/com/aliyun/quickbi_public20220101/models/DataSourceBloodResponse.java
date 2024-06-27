// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DataSourceBloodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DataSourceBloodResponseBody body;

    public static DataSourceBloodResponse build(java.util.Map<String, ?> map) throws Exception {
        DataSourceBloodResponse self = new DataSourceBloodResponse();
        return TeaModel.build(map, self);
    }

    public DataSourceBloodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DataSourceBloodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DataSourceBloodResponse setBody(DataSourceBloodResponseBody body) {
        this.body = body;
        return this;
    }
    public DataSourceBloodResponseBody getBody() {
        return this.body;
    }

}
