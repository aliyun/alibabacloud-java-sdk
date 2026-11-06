// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIAgentOrderResponseBody extends TeaModel {
    /**
     * <p>The AI assistant version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>The capacity package specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>small</p>
     */
    @NameInMap("CapacityPack")
    public String capacityPack;

    /**
     * <p>The expiration time of the order in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2027-01-01T00:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether the current account has an AI assistant order.</p>
     */
    @NameInMap("HasOrder")
    public Boolean hasOrder;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>order-001</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The order name.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-copilot-001</p>
     */
    @NameInMap("OrderName")
    public String orderName;

    /**
     * <p>The order number.</p>
     * 
     * <strong>example:</strong>
     * <p>ord-001</p>
     */
    @NameInMap("OrderNum")
    public String orderNum;

    /**
     * <p>The order status.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("OrderStatus")
    public String orderStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAIAgentOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIAgentOrderResponseBody self = new DescribeAIAgentOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIAgentOrderResponseBody setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public DescribeAIAgentOrderResponseBody setCapacityPack(String capacityPack) {
        this.capacityPack = capacityPack;
        return this;
    }
    public String getCapacityPack() {
        return this.capacityPack;
    }

    public DescribeAIAgentOrderResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeAIAgentOrderResponseBody setHasOrder(Boolean hasOrder) {
        this.hasOrder = hasOrder;
        return this;
    }
    public Boolean getHasOrder() {
        return this.hasOrder;
    }

    public DescribeAIAgentOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribeAIAgentOrderResponseBody setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public DescribeAIAgentOrderResponseBody setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

    public DescribeAIAgentOrderResponseBody setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public DescribeAIAgentOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
