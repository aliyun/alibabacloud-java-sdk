// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCNodePoolResponseBody extends TeaModel {
    /**
     * <p>The instance IDs.</p>
     */
    @NameInMap("InstanceIdSets")
    public java.util.List<String> instanceIdSets;

    /**
     * <p>The node pool ID.</p>
     * 
     * <strong>example:</strong>
     * <p>np31da1b38983f4511b490fc62108a****</p>
     */
    @NameInMap("NodePoolId")
    public String nodePoolId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50357661918****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRCNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRCNodePoolResponseBody self = new CreateRCNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRCNodePoolResponseBody setInstanceIdSets(java.util.List<String> instanceIdSets) {
        this.instanceIdSets = instanceIdSets;
        return this;
    }
    public java.util.List<String> getInstanceIdSets() {
        return this.instanceIdSets;
    }

    public CreateRCNodePoolResponseBody setNodePoolId(String nodePoolId) {
        this.nodePoolId = nodePoolId;
        return this;
    }
    public String getNodePoolId() {
        return this.nodePoolId;
    }

    public CreateRCNodePoolResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateRCNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
