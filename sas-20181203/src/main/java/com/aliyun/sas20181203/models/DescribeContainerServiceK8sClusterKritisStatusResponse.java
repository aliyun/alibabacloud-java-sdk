// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerServiceK8sClusterKritisStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerServiceK8sClusterKritisStatusResponseBody body;

    public static DescribeContainerServiceK8sClusterKritisStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerServiceK8sClusterKritisStatusResponse self = new DescribeContainerServiceK8sClusterKritisStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerServiceK8sClusterKritisStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerServiceK8sClusterKritisStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerServiceK8sClusterKritisStatusResponse setBody(DescribeContainerServiceK8sClusterKritisStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerServiceK8sClusterKritisStatusResponseBody getBody() {
        return this.body;
    }

}
