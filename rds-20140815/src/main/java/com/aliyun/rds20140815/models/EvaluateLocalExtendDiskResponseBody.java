// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EvaluateLocalExtendDiskResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the expansion is available. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Available.</p>
     * </li>
     * <li><p><strong>false</strong>: Not available.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Available")
    public String available;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-wz9s06u4drm******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The transfer type of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DBInstanceTransType")
    public String DBInstanceTransType;

    /**
     * <p>The maximum capacity of the local disk. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("LocalUpgradeDiskLimit")
    public Long localUpgradeDiskLimit;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A4C4D26F-E5CE-5A28-8C54-46A6FB318223</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EvaluateLocalExtendDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateLocalExtendDiskResponseBody self = new EvaluateLocalExtendDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateLocalExtendDiskResponseBody setAvailable(String available) {
        this.available = available;
        return this;
    }
    public String getAvailable() {
        return this.available;
    }

    public EvaluateLocalExtendDiskResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public EvaluateLocalExtendDiskResponseBody setDBInstanceTransType(String DBInstanceTransType) {
        this.DBInstanceTransType = DBInstanceTransType;
        return this;
    }
    public String getDBInstanceTransType() {
        return this.DBInstanceTransType;
    }

    public EvaluateLocalExtendDiskResponseBody setLocalUpgradeDiskLimit(Long localUpgradeDiskLimit) {
        this.localUpgradeDiskLimit = localUpgradeDiskLimit;
        return this;
    }
    public Long getLocalUpgradeDiskLimit() {
        return this.localUpgradeDiskLimit;
    }

    public EvaluateLocalExtendDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
