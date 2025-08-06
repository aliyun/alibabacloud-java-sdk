// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddMediaSequencesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMediaSequencesResponseBody body;

    public static AddMediaSequencesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMediaSequencesResponse self = new AddMediaSequencesResponse();
        return TeaModel.build(map, self);
    }

    public AddMediaSequencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMediaSequencesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMediaSequencesResponse setBody(AddMediaSequencesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMediaSequencesResponseBody getBody() {
        return this.body;
    }

}
