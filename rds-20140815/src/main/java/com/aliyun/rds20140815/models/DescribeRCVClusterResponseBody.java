// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCVClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VClusterStatus")
    public String VClusterStatus;

    public static DescribeRCVClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCVClusterResponseBody self = new DescribeRCVClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCVClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCVClusterResponseBody setVClusterStatus(String VClusterStatus) {
        this.VClusterStatus = VClusterStatus;
        return this;
    }
    public String getVClusterStatus() {
        return this.VClusterStatus;
    }

}
