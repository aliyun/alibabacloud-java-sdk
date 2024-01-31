// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBinlogFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBinlogFilesResponseBody body;

    public static DescribeBinlogFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBinlogFilesResponse self = new DescribeBinlogFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBinlogFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBinlogFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBinlogFilesResponse setBody(DescribeBinlogFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBinlogFilesResponseBody getBody() {
        return this.body;
    }

}
