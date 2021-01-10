// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddThesaurusForApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddThesaurusForApiResponseBody body;

    public static AddThesaurusForApiResponse build(java.util.Map<String, ?> map) throws Exception {
        AddThesaurusForApiResponse self = new AddThesaurusForApiResponse();
        return TeaModel.build(map, self);
    }

    public AddThesaurusForApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddThesaurusForApiResponse setBody(AddThesaurusForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public AddThesaurusForApiResponseBody getBody() {
        return this.body;
    }

}
