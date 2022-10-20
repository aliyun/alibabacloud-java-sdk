// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class EditThesaurusForApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditThesaurusForApiResponseBody body;

    public static EditThesaurusForApiResponse build(java.util.Map<String, ?> map) throws Exception {
        EditThesaurusForApiResponse self = new EditThesaurusForApiResponse();
        return TeaModel.build(map, self);
    }

    public EditThesaurusForApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditThesaurusForApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditThesaurusForApiResponse setBody(EditThesaurusForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public EditThesaurusForApiResponseBody getBody() {
        return this.body;
    }

}
