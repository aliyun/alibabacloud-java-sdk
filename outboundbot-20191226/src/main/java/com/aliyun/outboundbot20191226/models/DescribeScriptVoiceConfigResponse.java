// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeScriptVoiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScriptVoiceConfigResponseBody body;

    public static DescribeScriptVoiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScriptVoiceConfigResponse self = new DescribeScriptVoiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScriptVoiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScriptVoiceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScriptVoiceConfigResponse setBody(DescribeScriptVoiceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScriptVoiceConfigResponseBody getBody() {
        return this.body;
    }

}
