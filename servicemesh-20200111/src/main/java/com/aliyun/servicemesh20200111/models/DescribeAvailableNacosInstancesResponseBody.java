// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeAvailableNacosInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<String> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableNacosInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableNacosInstancesResponseBody self = new DescribeAvailableNacosInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableNacosInstancesResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public DescribeAvailableNacosInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
