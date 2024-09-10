// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerServiceK8sClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerServiceK8sClustersResponseBody body;

    public static DescribeContainerServiceK8sClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerServiceK8sClustersResponse self = new DescribeContainerServiceK8sClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerServiceK8sClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerServiceK8sClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerServiceK8sClustersResponse setBody(DescribeContainerServiceK8sClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerServiceK8sClustersResponseBody getBody() {
        return this.body;
    }

}
