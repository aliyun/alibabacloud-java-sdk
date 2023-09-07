// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLogBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the log backup feature was enabled. Valid values:</p>
     * <br>
     * <p>*   0: disabled.</p>
     * <p>*   1: enabled. By default, the log backup feature is enabled and cannot be disabled.</p>
     */
    @NameInMap("EnableBackupLog")
    public Integer enableBackupLog;

    @NameInMap("LogBackupAnotherRegionRegion")
    public String logBackupAnotherRegionRegion;

    @NameInMap("LogBackupAnotherRegionRetentionPeriod")
    public String logBackupAnotherRegionRetentionPeriod;

    /**
     * <p>The retention period of the logs. Valid values:</p>
     * <br>
     * <p>*   7 to 7300: The logs are retained for 7 to 7,300 days.</p>
     * <p>*   \-1: The logs are permanently retained.</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    /**
     * <p>The ID of the request.</p>
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
