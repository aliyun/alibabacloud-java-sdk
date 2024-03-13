// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateHumanAnimeStyleVideoResponseBody body;

    public static GenerateHumanAnimeStyleVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleVideoResponse self = new GenerateHumanAnimeStyleVideoResponse();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateHumanAnimeStyleVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateHumanAnimeStyleVideoResponse setBody(GenerateHumanAnimeStyleVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateHumanAnimeStyleVideoResponseBody getBody() {
        return this.body;
    }

}
