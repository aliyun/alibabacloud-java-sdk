// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The backup compression method. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no compression.</li>
     * <li><strong>1</strong>: zlib compression.</li>
     * <li><strong>2</strong>: parallel zlib compression.</li>
     * <li><strong>4</strong>: quicklz compression. Database and table restoration is enabled.</li>
     * <li><strong>8</strong>: quicklz compression for MySQL 8.0. Database and table restoration is not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CompressType")
    public String compressType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceID")
    public String DBInstanceID;

    /**
     * <p>Indicates whether instance log backup is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled.</li>
     * <li><strong>0</strong>: shutdown.</li>
     * </ul>
     * <blockquote>
     * <p>Instance log backup is enabled by default and cannot be shut down for ApsaraDB RDS for SQL Server instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    /**
     * <p>Indicates whether incremental backup is enabled.</p>
     */
    @NameInMap("EnableIncrementDataBackup")
    public Boolean enableIncrementDataBackup;

    /**
     * <p>Indicates whether point-in-time recovery (PITR) is enabled for the ApsaraDB RDS for MySQL instance.</p>
     */
    @NameInMap("EnablePitrProtection")
    public Boolean enablePitrProtection;

    /**
     * <p>Indicates whether binary log files are unconditionally deleted when the storage usage of the <strong>ApsaraDB RDS for MySQL</strong> instance exceeds 80% or the remaining storage space is less than 5 GB.</p>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    /**
     * <p>The high-frequency incremental backup interval. Unit: minutes. Valid values: 60, 120, 240, 360, and 720.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("IncBackupInterval")
    public Integer incBackupInterval;

    /**
     * <p>The number of hours for which instance log backups are retained locally on the <strong>MySQL</strong> instance.</p>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("LocalLogRetentionHours")
    public Integer localLogRetentionHours;

    /**
     * <p>The maximum loop space usage of the local binary log on the <strong>MySQL</strong> instance.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    /**
     * <p>The number of binary log files retained locally on the <strong>ApsaraDB RDS for MySQL</strong> instance.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DA147739-AEAD-4417-9089-65E9B1D8240D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyResponseBody self = new ModifyBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyResponseBody setCompressType(String compressType) {
        this.compressType = compressType;
        return this;
    }
    public String getCompressType() {
        return this.compressType;
    }

    public ModifyBackupPolicyResponseBody setDBInstanceID(String DBInstanceID) {
        this.DBInstanceID = DBInstanceID;
        return this;
    }
    public String getDBInstanceID() {
        return this.DBInstanceID;
    }

    public ModifyBackupPolicyResponseBody setEnableBackupLog(String enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public ModifyBackupPolicyResponseBody setEnableIncrementDataBackup(Boolean enableIncrementDataBackup) {
        this.enableIncrementDataBackup = enableIncrementDataBackup;
        return this;
    }
    public Boolean getEnableIncrementDataBackup() {
        return this.enableIncrementDataBackup;
    }

    public ModifyBackupPolicyResponseBody setEnablePitrProtection(Boolean enablePitrProtection) {
        this.enablePitrProtection = enablePitrProtection;
        return this;
    }
    public Boolean getEnablePitrProtection() {
        return this.enablePitrProtection;
    }

    public ModifyBackupPolicyResponseBody setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public ModifyBackupPolicyResponseBody setIncBackupInterval(Integer incBackupInterval) {
        this.incBackupInterval = incBackupInterval;
        return this;
    }
    public Integer getIncBackupInterval() {
        return this.incBackupInterval;
    }

    public ModifyBackupPolicyResponseBody setLocalLogRetentionHours(Integer localLogRetentionHours) {
        this.localLogRetentionHours = localLogRetentionHours;
        return this;
    }
    public Integer getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    public ModifyBackupPolicyResponseBody setLocalLogRetentionSpace(String localLogRetentionSpace) {
        this.localLogRetentionSpace = localLogRetentionSpace;
        return this;
    }
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    public ModifyBackupPolicyResponseBody setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
        this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
        return this;
    }
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    public ModifyBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
