// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserServiceStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>99626905-678A-4E8A-984E-6AEB09993996</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OPENED</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeUserServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserServiceStatusResponseBody self = new DescribeUserServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserServiceStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
