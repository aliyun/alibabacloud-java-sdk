// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyInstanceCrossBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The status of the cross-region backup feature on the instance. Valid values:</p>
     * <ul>
     * <li><strong>Disable</strong></li>
     * <li><strong>Enable</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("BackupEnabled")
    public String backupEnabled;

    /**
     * <p>The ID of the region in which the cross-region backup files of the instance are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("CrossBackupRegion")
    public String crossBackupRegion;

    /**
     * <p>The policy that is used to save the cross-region backup files of the instance. Default value: <strong>1</strong>. The value 1 indicates that all cross-region backup files are saved.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CrossBackupType")
    public String crossBackupType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The status of the cross-region log backup feature on the instance. Valid values:</p>
     * <ul>
     * <li><strong>Disable</strong></li>
     * <li><strong>Enable</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("LogBackupEnabled")
    public String logBackupEnabled;

    /**
     * <p>The region ID of the source instance. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50A6059D-6DBB-46C6-A851-1EE93C9013CF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The policy that is used to retain the cross-region backup files of the instance. Default value: <strong>1</strong>. The value 1 indicates that the cross-region backup files of the instance are retained based on the specified retention period.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetentType")
    public Integer retentType;

    /**
     * <p>The number of days for which the cross-region backup files of the instance are retained. Valid values: <strong>7 to 1825</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    public static ModifyInstanceCrossBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceCrossBackupPolicyResponseBody self = new ModifyInstanceCrossBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setBackupEnabled(String backupEnabled) {
        this.backupEnabled = backupEnabled;
        return this;
    }
    public String getBackupEnabled() {
        return this.backupEnabled;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setCrossBackupRegion(String crossBackupRegion) {
        this.crossBackupRegion = crossBackupRegion;
        return this;
    }
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setCrossBackupType(String crossBackupType) {
        this.crossBackupType = crossBackupType;
        return this;
    }
    public String getCrossBackupType() {
        return this.crossBackupType;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setLogBackupEnabled(String logBackupEnabled) {
        this.logBackupEnabled = logBackupEnabled;
        return this;
    }
    public String getLogBackupEnabled() {
        return this.logBackupEnabled;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setRetentType(Integer retentType) {
        this.retentType = retentType;
        return this;
    }
    public Integer getRetentType() {
        return this.retentType;
    }

    public ModifyInstanceCrossBackupPolicyResponseBody setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

}
