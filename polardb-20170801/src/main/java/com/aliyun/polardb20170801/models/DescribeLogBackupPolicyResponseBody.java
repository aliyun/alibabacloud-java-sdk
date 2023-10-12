// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLogBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
     * <br>
     * <p>*   0: The log backup feature is disabled.</p>
     * <p>*   1: The log backup feature is enabled. By default, the log backup feature is enabled and cannot be disabled.</p>
     */
    @NameInMap("EnableBackupLog")
    public Integer enableBackupLog;

    /**
     * <p>The region in which you want to store cross-region log backups. For more information about regions that support the cross-region backup feature, see [Overview](~~72672~~).</p>
     */
    @NameInMap("LogBackupAnotherRegionRegion")
    public String logBackupAnotherRegionRegion;

    /**
     * <p>The retention period of cross-region log backups. Valid values:</p>
     * <br>
     * <p>*   **0**: The cross-region backup feature is disabled.</p>
     * <p>*   **30 to 7300**: Cross-region log backups are retained for 30 to 7,300 days.</p>
     * <p>*   **-1**: The log backups are permanently retained.</p>
     * <br>
     * <p>>  When you create a cluster, the default value of this parameter is **0**.</p>
     */
    @NameInMap("LogBackupAnotherRegionRetentionPeriod")
    public String logBackupAnotherRegionRetentionPeriod;

    /**
     * <p>The retention period of the log backups. Valid values:</p>
     * <br>
     * <p>*   3 to 7300: The log backups are retained for 3 to 7,300 days.</p>
     * <p>*   \-1: The log backups are permanently retained.</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLogBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupPolicyResponseBody self = new DescribeLogBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupPolicyResponseBody setEnableBackupLog(Integer enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public DescribeLogBackupPolicyResponseBody setLogBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
        this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
        return this;
    }
    public String getLogBackupAnotherRegionRegion() {
        return this.logBackupAnotherRegionRegion;
    }

    public DescribeLogBackupPolicyResponseBody setLogBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
        this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
        return this;
    }
    public String getLogBackupAnotherRegionRetentionPeriod() {
        return this.logBackupAnotherRegionRetentionPeriod;
    }

    public DescribeLogBackupPolicyResponseBody setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public DescribeLogBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
