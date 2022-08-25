// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshServiceLabelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceLabels")
    public java.util.Map<String, ServiceLabelsValue> serviceLabels;

    public static DescribeServiceMeshServiceLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshServiceLabelResponseBody self = new DescribeServiceMeshServiceLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshServiceLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceMeshServiceLabelResponseBody setServiceLabels(java.util.Map<String, ServiceLabelsValue> serviceLabels) {
        this.serviceLabels = serviceLabels;
        return this;
    }
    public java.util.Map<String, ServiceLabelsValue> getServiceLabels() {
        return this.serviceLabels;
    }

}
