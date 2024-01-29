// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectFeatureViewTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectFeatureViewTagsResponseBody body;

    public static ListProjectFeatureViewTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFeatureViewTagsResponse self = new ListProjectFeatureViewTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectFeatureViewTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectFeatureViewTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectFeatureViewTagsResponse setBody(ListProjectFeatureViewTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectFeatureViewTagsResponseBody getBody() {
        return this.body;
    }

}
