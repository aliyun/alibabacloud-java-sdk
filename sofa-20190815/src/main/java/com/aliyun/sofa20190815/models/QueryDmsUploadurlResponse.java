// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDmsUploadurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDmsUploadurlResponseBody body;

    public static QueryDmsUploadurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDmsUploadurlResponse self = new QueryDmsUploadurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryDmsUploadurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDmsUploadurlResponse setBody(QueryDmsUploadurlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDmsUploadurlResponseBody getBody() {
        return this.body;
    }

}
