// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingActivitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAutoScalingActivitiesResponseBody body;

    public static ListAutoScalingActivitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingActivitiesResponse self = new ListAutoScalingActivitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingActivitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoScalingActivitiesResponse setBody(ListAutoScalingActivitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoScalingActivitiesResponseBody getBody() {
        return this.body;
    }

}
