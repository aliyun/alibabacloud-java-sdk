// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The backup frequency. Default value: Normal. Valid values:</p>
     * <br>
     * <p>*   **Normal**: standard backup. The system backs up data once a day.</p>
     * <p>*   **2/24H**: enhanced backup. The system backs up data every 2 hours.</p>
     * <p>*   **3/24H**: enhanced backup. The system backs up data every 3 hours.</p>
     * <p>*   **4/24H**: enhanced backup. The system backs up data every 4 hours.</p>
     * <br>
     * <p>> - If enhanced backup is enabled, all backups are retained for 24 hours. Backups are automatically deleted when the retention period ends. However, the system permanently retains the first backup that is created after 00:00 every day.</p>
     * <p>>-  If enhanced backup is enabled, **PreferredBackupPeriod** is automatically set to all days in a week (from Monday to Sunday).</p>
     */
    @NameInMap("BackupFrequency")
    public String backupFrequency;

    /**
     * <p>Indicates whether backups are retained when you delete a cluster. Valid values:</p>
     * <br>
     * <p>*   **ALL**: permanently retains all backups.</p>
     * <p>*   **LATEST**: permanently retains only the last backup.</p>
     * <p>*   **NONE**: does not retain backups.</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public String backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The backup frequency of level-1 backups. Default value: Normal. Valid values:</p>
     * <br>
     * <p>*   **Normal**: standard backup. The system backs up data once a day.</p>
     * <p>*   **2/24H**: frequent backup. The system backs up data every 2 hours.</p>
     * <p>*   **3/24H**: frequent backup. The system backs up data every 3 hours.</p>
     * <p>*   **4/24H**: frequent backup. The system backs up data every 4 hours.</p>
     * <br>
     * <p>>- This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</p>
     * <p>>- This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see [Overview](https://help.aliyun.com/document_detail/72672.html).</p>
     */
    @NameInMap("DataLevel1BackupFrequency")
    public String dataLevel1BackupFrequency;

    /**
     * <p>The backup cycle of level-1 backups. Valid values:</p>
     * <br>
     * <p>*   **Monday**</p>
     * <p>*   **Tuesday**</p>
     * <p>*   **Wednesday**</p>
     * <p>*   **Thursday**</p>
     * <p>*   **Friday**</p>
     * <p>*   **Saturday**</p>
     * <p>*   **Sunday**</p>
     * <br>
     * <p>>- You need to specify at least two values. Separate multiple values with commas (,).</p>
     * <p>>- This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</p>
     * <p>>- This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see [Overview](https://help.aliyun.com/document_detail/72672.html).</p>
     */
    @NameInMap("DataLevel1BackupPeriod")
    public String dataLevel1BackupPeriod;

    /**
     * <p>The retention period of level-1 backups. Valid values: 3 to 14. Unit: day.</p>
     */
    @NameInMap("DataLevel1BackupRetentionPeriod")
    public String dataLevel1BackupRetentionPeriod;

    /**
     * <p>The period of time during which automatic backup is performed. The value must be in the `hh:mmZ-hh:mmZ` format. The time must be in UTC. The start time and the end time must be on the hour and must have an interval of 1 hour. Example: `14:00Z-15:00Z`.</p>
     * <br>
     * <p>>- This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</p>
     * <p>>- This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see [Overview](https://help.aliyun.com/document_detail/72672.html).</p>
     */
    @NameInMap("DataLevel1BackupTime")
    public String dataLevel1BackupTime;

    /**
     * <p>The region where the cross-region level-2 backup is stored. For information about regions that support the cross-region backup feature, see [Overview](https://help.aliyun.com/document_detail/72672.html).</p>
     */
    @NameInMap("DataLevel2BackupAnotherRegionRegion")
    public String dataLevel2BackupAnotherRegionRegion;

    /**
     * <p>The retention period of cross-region level-2 backups. Valid values:</p>
     * <br>
     * <p>*   **0**: The cross-region level-2 backup feature is disabled.</p>
     * <p>*   **30 to 7300**: Cross-region level-2 backups are retained for 30 to 7,300 days.</p>
     * <p>*   **1**: Cross-region level-2 backups are permanently retained.</p>
     * <br>
     * <p>> The default value is **0**. By default, the level-2 backup feature is disabled when you create a cluster.</p>
     */
    @NameInMap("DataLevel2BackupAnotherRegionRetentionPeriod")
    public String dataLevel2BackupAnotherRegionRetentionPeriod;

    /**
     * <p>The backup cycle of level-2 backups. Valid values:</p>
     * <br>
     * <p>*   **Monday**</p>
     * <p>*   **Tuesday**</p>
     * <p>*   **Wednesday**</p>
     * <p>*   **Thursday**</p>
     * <p>*   **Friday**</p>
     * <p>*   **Saturday**</p>
     * <p>*   **Sunday**</p>
     * <br>
     * <p>>- You need to specify at least two values. Separate multiple values with commas (,).</p>
     * <p>>- This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</p>
     * <p>>- This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see [Overview](https://help.aliyun.com/document_detail/72672.html).</p>
     */
    @NameInMap("DataLevel2BackupPeriod")
    public String dataLevel2BackupPeriod;

    /**
     * <p>The retention period of level-2 backups. Valid values:</p>
     * <br>
     * <p>*   0: The level-2 backup feature is disabled.</p>
     * <p>*   30 to 7300: Level-2 backups are retained for 30 to 7,300 days.</p>
     * <p>*   \\-1: Level-2 backups are permanently retained.</p>
     * <br>
     * <p>> The default value is **0**. By default, the level-2 backup feature is disabled when you create a cluster.</p>
     */
    @NameInMap("DataLevel2BackupRetentionPeriod")
    public String dataLevel2BackupRetentionPeriod;

    /**
     * <p>The backup cycle. Valid values:</p>
     * <br>
     * <p>*   Monday</p>
     * <p>*   Tuesday</p>
     * <p>*   Wednesday</p>
     * <p>*   Thursday</p>
     * <p>*   Friday</p>
     * <p>*   Saturday</p>
     * <p>*   Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time period when automatic backups are performed. The format is `HH:mmZ-HH:mmZ`. The time is displayed in UTC.</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The time when the next automatic backup will be performed. The format is `YYYY-MM-DDThh:mmZ`. The time is displayed in UTC.</p>
     */
    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setBackupFrequency(String backupFrequency) {
        this.backupFrequency = backupFrequency;
        return this;
    }
    public String getBackupFrequency() {
        return this.backupFrequency;
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public DescribeBackupPolicyResponseBody setDataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
        this.dataLevel1BackupFrequency = dataLevel1BackupFrequency;
        return this;
    }
    public String getDataLevel1BackupFrequency() {
        return this.dataLevel1BackupFrequency;
    }

    public DescribeBackupPolicyResponseBody setDataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
        this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
        return this;
    }
    public String getDataLevel1BackupPeriod() {
        return this.dataLevel1BackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setDataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
        this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
        return this;
    }
    public String getDataLevel1BackupRetentionPeriod() {
        return this.dataLevel1BackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setDataLevel1BackupTime(String dataLevel1BackupTime) {
        this.dataLevel1BackupTime = dataLevel1BackupTime;
        return this;
    }
    public String getDataLevel1BackupTime() {
        return this.dataLevel1BackupTime;
    }

    public DescribeBackupPolicyResponseBody setDataLevel2BackupAnotherRegionRegion(String dataLevel2BackupAnotherRegionRegion) {
        this.dataLevel2BackupAnotherRegionRegion = dataLevel2BackupAnotherRegionRegion;
        return this;
    }
    public String getDataLevel2BackupAnotherRegionRegion() {
        return this.dataLevel2BackupAnotherRegionRegion;
    }

    public DescribeBackupPolicyResponseBody setDataLevel2BackupAnotherRegionRetentionPeriod(String dataLevel2BackupAnotherRegionRetentionPeriod) {
        this.dataLevel2BackupAnotherRegionRetentionPeriod = dataLevel2BackupAnotherRegionRetentionPeriod;
        return this;
    }
    public String getDataLevel2BackupAnotherRegionRetentionPeriod() {
        return this.dataLevel2BackupAnotherRegionRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setDataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
        this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
        return this;
    }
    public String getDataLevel2BackupPeriod() {
        return this.dataLevel2BackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setDataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
        this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
        return this;
    }
    public String getDataLevel2BackupRetentionPeriod() {
        return this.dataLevel2BackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeBackupPolicyResponseBody setPreferredNextBackupTime(String preferredNextBackupTime) {
        this.preferredNextBackupTime = preferredNextBackupTime;
        return this;
    }
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
