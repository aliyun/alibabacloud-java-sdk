// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The method that is used to compress backups. Valid values:</p>
     * <ul>
     * <li><strong>0:</strong> Backups are not compressed.</li>
     * <li><strong>1</strong>: Backups are compressed by using the zlib tool.</li>
     * <li><strong>2</strong>: Backups are compressed in parallel by using the zlib tool.</li>
     * <li><strong>4</strong>: Backups are compressed by using the QuickLZ tool and can be used to restore individual databases and tables.</li>
     * <li><strong>8</strong>: Backups are compressed by using the QuickLZ tool but cannot be used to restore individual databases or tables. This value is supported only for instances that run MySQL 8.0.</li>
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
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceID")
    public String DBInstanceID;

    /**
     * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The feature is enabled.</li>
     * <li><strong>0</strong>: The feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    /**
     * <p>Specifies whether to forcefully delete log backup files from the instance when the storage usage of the instance exceeds 80% or the amount of remaining storage on the instance is less than 5 GB.</p>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    /**
     * <p>The number of hours for which log backup files are retained on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("LocalLogRetentionHours")
    public Integer localLogRetentionHours;

    /**
     * <p>The maximum storage usage that is allowed for log backup files on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    /**
     * <p>The number of binary log files on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    /**
     * <p>The ID of the request.</p>
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

    public ModifyBackupPolicyResponseBody setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
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
