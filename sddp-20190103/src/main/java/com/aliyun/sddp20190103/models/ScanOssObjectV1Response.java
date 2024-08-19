// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ScanOssObjectV1Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScanOssObjectV1ResponseBody body;

    public static ScanOssObjectV1Response build(java.util.Map<String, ?> map) throws Exception {
        ScanOssObjectV1Response self = new ScanOssObjectV1Response();
        return TeaModel.build(map, self);
    }

    public ScanOssObjectV1Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanOssObjectV1Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScanOssObjectV1Response setBody(ScanOssObjectV1ResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanOssObjectV1ResponseBody getBody() {
        return this.body;
    }

}
