// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchDriveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchDriveResponseBody body;

    public static SearchDriveResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchDriveResponse self = new SearchDriveResponse();
        return TeaModel.build(map, self);
    }

    public SearchDriveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchDriveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchDriveResponse setBody(SearchDriveResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchDriveResponseBody getBody() {
        return this.body;
    }

}
