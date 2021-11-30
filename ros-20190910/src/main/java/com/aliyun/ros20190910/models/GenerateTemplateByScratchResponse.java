// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplateByScratchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateTemplateByScratchResponseBody body;

    public static GenerateTemplateByScratchResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTemplateByScratchResponse self = new GenerateTemplateByScratchResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTemplateByScratchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTemplateByScratchResponse setBody(GenerateTemplateByScratchResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTemplateByScratchResponseBody getBody() {
        return this.body;
    }

}
