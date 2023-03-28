// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetFlowLogServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the flow log feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no You can call the [OpenFlowLogService](~~449637~~) operation to enable the flow log feature.</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFlowLogServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowLogServiceStatusResponseBody self = new GetFlowLogServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowLogServiceStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetFlowLogServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
