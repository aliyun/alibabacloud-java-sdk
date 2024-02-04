// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConvertImageToGrayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertImageToGrayResponseBody body;

    public static ConvertImageToGrayResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertImageToGrayResponse self = new ConvertImageToGrayResponse();
        return TeaModel.build(map, self);
    }

    public ConvertImageToGrayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertImageToGrayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertImageToGrayResponse setBody(ConvertImageToGrayResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertImageToGrayResponseBody getBody() {
        return this.body;
    }

}
