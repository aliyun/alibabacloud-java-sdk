// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CheckDatasetOssBucketCORSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDatasetOssBucketCORSResponseBody body;

    public static CheckDatasetOssBucketCORSResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDatasetOssBucketCORSResponse self = new CheckDatasetOssBucketCORSResponse();
        return TeaModel.build(map, self);
    }

    public CheckDatasetOssBucketCORSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDatasetOssBucketCORSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDatasetOssBucketCORSResponse setBody(CheckDatasetOssBucketCORSResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDatasetOssBucketCORSResponseBody getBody() {
        return this.body;
    }

}
