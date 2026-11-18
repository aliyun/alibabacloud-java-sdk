// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoCharacterReplaceJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoCharacterReplaceJobResponseBody body;

    public static GetVideoCharacterReplaceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCharacterReplaceJobResponse self = new GetVideoCharacterReplaceJobResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoCharacterReplaceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoCharacterReplaceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoCharacterReplaceJobResponse setBody(GetVideoCharacterReplaceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoCharacterReplaceJobResponseBody getBody() {
        return this.body;
    }

}
