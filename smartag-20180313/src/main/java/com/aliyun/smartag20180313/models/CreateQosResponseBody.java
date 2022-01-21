// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosResponseBody extends TeaModel {
    @NameInMap("QosId")
    public String qosId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateQosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQosResponseBody self = new CreateQosResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQosResponseBody setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateQosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQosResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
