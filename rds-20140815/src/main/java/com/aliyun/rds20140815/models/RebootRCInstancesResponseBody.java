// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebootRCInstancesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32A5B40E-50DA-5166-9B22-35F00C5D1BC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebootRCInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootRCInstancesResponseBody self = new RebootRCInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootRCInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
