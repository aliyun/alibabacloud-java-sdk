// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DataSetBloodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DataSetBloodResponseBody body;

    public static DataSetBloodResponse build(java.util.Map<String, ?> map) throws Exception {
        DataSetBloodResponse self = new DataSetBloodResponse();
        return TeaModel.build(map, self);
    }

    public DataSetBloodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DataSetBloodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DataSetBloodResponse setBody(DataSetBloodResponseBody body) {
        this.body = body;
        return this;
    }
    public DataSetBloodResponseBody getBody() {
        return this.body;
    }

}
