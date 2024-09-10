// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerServiceK8sClusterNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerServiceK8sClusterNamespacesResponseBody body;

    public static DescribeContainerServiceK8sClusterNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerServiceK8sClusterNamespacesResponse self = new DescribeContainerServiceK8sClusterNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerServiceK8sClusterNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerServiceK8sClusterNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerServiceK8sClusterNamespacesResponse setBody(DescribeContainerServiceK8sClusterNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerServiceK8sClusterNamespacesResponseBody getBody() {
        return this.body;
    }

}
