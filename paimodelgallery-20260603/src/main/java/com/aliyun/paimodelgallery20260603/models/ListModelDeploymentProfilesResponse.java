// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class ListModelDeploymentProfilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelDeploymentProfilesResponseBody body;

    public static ListModelDeploymentProfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelDeploymentProfilesResponse self = new ListModelDeploymentProfilesResponse();
        return TeaModel.build(map, self);
    }

    public ListModelDeploymentProfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelDeploymentProfilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelDeploymentProfilesResponse setBody(ListModelDeploymentProfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelDeploymentProfilesResponseBody getBody() {
        return this.body;
    }

}
