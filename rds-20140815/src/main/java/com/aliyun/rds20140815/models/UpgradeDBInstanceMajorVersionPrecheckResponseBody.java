// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionPrecheckResponseBody extends TeaModel {
    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1c808s731l****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>99C1FEEE-FB44-5342-8EBA-DC1E1A1557A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The new major engine version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>12.0</p>
     */
    @NameInMap("TargetMajorVersion")
    public String targetMajorVersion;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>41698****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpgradeDBInstanceMajorVersionPrecheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceMajorVersionPrecheckResponseBody self = new UpgradeDBInstanceMajorVersionPrecheckResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceMajorVersionPrecheckResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpgradeDBInstanceMajorVersionPrecheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeDBInstanceMajorVersionPrecheckResponseBody setTargetMajorVersion(String targetMajorVersion) {
        this.targetMajorVersion = targetMajorVersion;
        return this;
    }
    public String getTargetMajorVersion() {
        return this.targetMajorVersion;
    }

    public UpgradeDBInstanceMajorVersionPrecheckResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
