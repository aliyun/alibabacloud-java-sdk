// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConvertImageToGrayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ConvertImageToGrayResponse setBody(ConvertImageToGrayResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertImageToGrayResponseBody getBody() {
        return this.body;
    }

}
