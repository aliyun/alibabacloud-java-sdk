// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosResponseBody extends TeaModel {
    /**
     * <p>The ID of the QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2iu4fnc****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AACF5140-783D-48F0-9E4F-E59D716F7D08</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the QoS policy belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-oek3r2cmvk7m8q****</p>
     */
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
