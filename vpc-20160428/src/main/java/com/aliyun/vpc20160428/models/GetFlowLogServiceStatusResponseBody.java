// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetFlowLogServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the flow log feature is activated. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: activated.</p>
     * </li>
     * <li><p><strong>false</strong>: not activated. You can call the <a href="https://help.aliyun.com/document_detail/449637.html">OpenFlowLogService</a> operation to activate the flow log feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-06F83A1B457</p>
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
