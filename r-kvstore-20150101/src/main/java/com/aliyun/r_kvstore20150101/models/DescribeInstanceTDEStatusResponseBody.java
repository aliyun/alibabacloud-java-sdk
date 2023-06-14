// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceTDEStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeInstanceTDEStatus**.</p>
     */
    @NameInMap("TDEStatus")
    public String TDEStatus;

    public static DescribeInstanceTDEStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTDEStatusResponseBody self = new DescribeInstanceTDEStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTDEStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceTDEStatusResponseBody setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

}
