// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenUploadPictureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenUploadPictureResponseBody body;

    public static DescribeScreenUploadPictureResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenUploadPictureResponse self = new DescribeScreenUploadPictureResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenUploadPictureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenUploadPictureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenUploadPictureResponse setBody(DescribeScreenUploadPictureResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenUploadPictureResponseBody getBody() {
        return this.body;
    }

}
