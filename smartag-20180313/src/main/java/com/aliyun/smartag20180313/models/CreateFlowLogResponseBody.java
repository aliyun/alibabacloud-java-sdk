// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateFlowLogResponseBody extends TeaModel {
    /**
     * <p>The ID of the flow log.</p>
     * 
     * <strong>example:</strong>
     * <p>fl-7a56mar1kfw9vj****</p>
     */
    @NameInMap("FlowLogId")
    public String flowLogId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>650CB9E8-20F3-4538-A4FC-1DA1B36E42D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the flow log belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2iu4f****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateFlowLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogResponseBody self = new CreateFlowLogResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowLogResponseBody setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public CreateFlowLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowLogResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
