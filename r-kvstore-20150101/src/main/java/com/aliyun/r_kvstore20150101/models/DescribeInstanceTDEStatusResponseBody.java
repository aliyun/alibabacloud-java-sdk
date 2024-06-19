// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceTDEStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether TDE is enabled. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: TDE is enabled.</li>
     * <li><strong>Disable</strong>: TDE is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
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
