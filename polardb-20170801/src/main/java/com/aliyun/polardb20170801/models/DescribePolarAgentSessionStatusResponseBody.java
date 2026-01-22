// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentSessionStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    public static DescribePolarAgentSessionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarAgentSessionStatusResponseBody self = new DescribePolarAgentSessionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarAgentSessionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarAgentSessionStatusResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
