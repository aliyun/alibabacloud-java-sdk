// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceTDEStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether TDE is enabled. Valid values:</p>
     * <br>
     * <p>*   **Enabled**: TDE is enabled.</p>
     * <p>*   **Disable**: TDE is disabled.</p>
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
