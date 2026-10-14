// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLocalAvailableRecoveryTimeResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze3ngi149b313***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The start time from which backups can be restored.</p>
     * <blockquote>
     * <p>Calculated based on level-1 backups. Level-2 backups are not included.</p>
     * </blockquote>
     * <p>The time is in the ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-10T14:19:48Z</p>
     */
    @NameInMap("RecoveryBeginTime")
    public String recoveryBeginTime;

    /**
     * <p>The end time to which backups can be restored.</p>
     * <blockquote>
     * <p>Calculated based on level-1 backups. Level-2 backups are not included.</p>
     * </blockquote>
     * <p>The time is in the ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-17T08:56:45Z</p>
     */
    @NameInMap("RecoveryEndTime")
    public String recoveryEndTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EA0E6F8-BDB2-17B2-9567-591F6B3D7***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLocalAvailableRecoveryTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocalAvailableRecoveryTimeResponseBody self = new DescribeLocalAvailableRecoveryTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLocalAvailableRecoveryTimeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeLocalAvailableRecoveryTimeResponseBody setRecoveryBeginTime(String recoveryBeginTime) {
        this.recoveryBeginTime = recoveryBeginTime;
        return this;
    }
    public String getRecoveryBeginTime() {
        return this.recoveryBeginTime;
    }

    public DescribeLocalAvailableRecoveryTimeResponseBody setRecoveryEndTime(String recoveryEndTime) {
        this.recoveryEndTime = recoveryEndTime;
        return this;
    }
    public String getRecoveryEndTime() {
        return this.recoveryEndTime;
    }

    public DescribeLocalAvailableRecoveryTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
