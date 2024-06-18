// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1gm3yh0ht1****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>21128667463****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>006729E5-2A33-5955-89E3-651D3F44EBE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>416980000</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static UpgradeDBInstanceMajorVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceMajorVersionResponseBody self = new UpgradeDBInstanceMajorVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceMajorVersionResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceMajorVersionResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpgradeDBInstanceMajorVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeDBInstanceMajorVersionResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
