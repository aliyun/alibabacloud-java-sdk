// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The returned policy details.</p>
     */
    @NameInMap("Data")
    public UpdateBackupPolicyResponseBodyData data;

    /**
     * <p>The returned message. If the call is successful, success is returned. If the call fails, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupPolicyResponseBody self = new UpdateBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBackupPolicyResponseBody setData(UpdateBackupPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateBackupPolicyResponseBodyData getData() {
        return this.data;
    }

    public UpdateBackupPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBackupPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateBackupPolicyResponseBodyData extends TeaModel {
        /**
         * <p>The backup cycle. Specify at least two days. The value is a 7-digit string, where each digit from left to right represents whether backups are enabled for Monday through Sunday. A value of 0 indicates that backups are disabled, and a value of 1 indicates that backups are enabled:</p>
         * <ul>
         * <li>First digit: Monday</li>
         * <li>Second digit: Tuesday</li>
         * <li>Third digit: Wednesday</li>
         * <li>Fourth digit: Thursday</li>
         * <li>Fifth digit: Friday</li>
         * <li>Sixth digit: Saturday</li>
         * <li>Seventh digit: Sunday</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1001000</p>
         */
        @NameInMap("BackupPeriod")
        public String backupPeriod;

        /**
         * <p>The time when the daily backup starts, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>03:00Z</p>
         */
        @NameInMap("BackupPlanBegin")
        public String backupPlanBegin;

        /**
         * <p>The retention period of the backup set, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("BackupSetRetention")
        public Integer backupSetRetention;

        /**
         * <p>The backup type. A value of 0 indicates a quick backup.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The backup method. Valid values:</p>
         * <ul>
         * <li><strong>P</strong>: physical backup</li>
         * <li><strong>L</strong>: logical backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>P</p>
         */
        @NameInMap("BackupWay")
        public String backupWay;

        /**
         * <p>The interval at which cold data is backed up, in days. Valid values: 1 to 59.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ColdDataBackupInterval")
        public Integer coldDataBackupInterval;

        /**
         * <p>The retention period of cold data backups, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ColdDataBackupRetention")
        public Integer coldDataBackupRetention;

        /**
         * <p>The retention period of cross-region data backups, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("CrossRegionDataBackupRetention")
        public Integer crossRegionDataBackupRetention;

        /**
         * <p>The number of days selected for cross-region backups.</p>
         * 
         * <strong>example:</strong>
         * <p>3,7,1,5,6,2,4</p>
         */
        @NameInMap("CrossRegionFilterValue")
        public String crossRegionFilterValue;

        /**
         * <p>The retention period of cross-region log backups, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("CrossRegionLogBackupRetention")
        public Integer crossRegionLogBackupRetention;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasdyuoo</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The destination region for cross-region backups.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DestCrossRegion")
        public String destCrossRegion;

        /**
         * <p>Specifies whether to forcibly clear binary logs when the storage usage of the instance is excessively high. A value of 1 indicates yes, and a value of 0 indicates no.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ForceCleanOnHighSpaceUsage")
        public Integer forceCleanOnHighSpaceUsage;

        /**
         * <p>Specifies whether to enable cross-region data backups. Default value: false.</p>
         */
        @NameInMap("IsCrossRegionDataBackupEnabled")
        public Boolean isCrossRegionDataBackupEnabled;

        /**
         * <p>Specifies whether to enable cross-region log backups. Default value: false.</p>
         */
        @NameInMap("IsCrossRegionLogBackupEnabled")
        public Boolean isCrossRegionLogBackupEnabled;

        /**
         * <p>Specifies whether to enable backups. The fixed value is 1, which indicates that backups are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsEnabled")
        public Integer isEnabled;

        /**
         * <p>The local retention period of log backups, in hours. Valid values: 0 to 168. A value of 0 indicates that log backups are not retained. Default value: 7.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("LocalLogRetention")
        public Integer localLogRetention;

        /**
         * <p>The number of local binary logs to retain. Valid values: 6 to 100. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("LocalLogRetentionNumber")
        public Integer localLogRetentionNumber;

        /**
         * <p>The maximum space usage for binary logs. The parameter value ranges from 0 to 50. This is a loop space. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LogLocalRetentionSpace")
        public Integer logLocalRetentionSpace;

        /**
         * <p>The remote retention period of log backups, in days. Valid values: 7 to 730. Default value: 7.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RemoveLogRetention")
        public Integer removeLogRetention;

        public static UpdateBackupPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateBackupPolicyResponseBodyData self = new UpdateBackupPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateBackupPolicyResponseBodyData setBackupPeriod(String backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        public UpdateBackupPolicyResponseBodyData setBackupPlanBegin(String backupPlanBegin) {
            this.backupPlanBegin = backupPlanBegin;
            return this;
        }
        public String getBackupPlanBegin() {
            return this.backupPlanBegin;
        }

        public UpdateBackupPolicyResponseBodyData setBackupSetRetention(Integer backupSetRetention) {
            this.backupSetRetention = backupSetRetention;
            return this;
        }
        public Integer getBackupSetRetention() {
            return this.backupSetRetention;
        }

        public UpdateBackupPolicyResponseBodyData setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public UpdateBackupPolicyResponseBodyData setBackupWay(String backupWay) {
            this.backupWay = backupWay;
            return this;
        }
        public String getBackupWay() {
            return this.backupWay;
        }

        public UpdateBackupPolicyResponseBodyData setColdDataBackupInterval(Integer coldDataBackupInterval) {
            this.coldDataBackupInterval = coldDataBackupInterval;
            return this;
        }
        public Integer getColdDataBackupInterval() {
            return this.coldDataBackupInterval;
        }

        public UpdateBackupPolicyResponseBodyData setColdDataBackupRetention(Integer coldDataBackupRetention) {
            this.coldDataBackupRetention = coldDataBackupRetention;
            return this;
        }
        public Integer getColdDataBackupRetention() {
            return this.coldDataBackupRetention;
        }

        public UpdateBackupPolicyResponseBodyData setCrossRegionDataBackupRetention(Integer crossRegionDataBackupRetention) {
            this.crossRegionDataBackupRetention = crossRegionDataBackupRetention;
            return this;
        }
        public Integer getCrossRegionDataBackupRetention() {
            return this.crossRegionDataBackupRetention;
        }

        public UpdateBackupPolicyResponseBodyData setCrossRegionFilterValue(String crossRegionFilterValue) {
            this.crossRegionFilterValue = crossRegionFilterValue;
            return this;
        }
        public String getCrossRegionFilterValue() {
            return this.crossRegionFilterValue;
        }

        public UpdateBackupPolicyResponseBodyData setCrossRegionLogBackupRetention(Integer crossRegionLogBackupRetention) {
            this.crossRegionLogBackupRetention = crossRegionLogBackupRetention;
            return this;
        }
        public Integer getCrossRegionLogBackupRetention() {
            return this.crossRegionLogBackupRetention;
        }

        public UpdateBackupPolicyResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public UpdateBackupPolicyResponseBodyData setDestCrossRegion(String destCrossRegion) {
            this.destCrossRegion = destCrossRegion;
            return this;
        }
        public String getDestCrossRegion() {
            return this.destCrossRegion;
        }

        public UpdateBackupPolicyResponseBodyData setForceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
            this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
            return this;
        }
        public Integer getForceCleanOnHighSpaceUsage() {
            return this.forceCleanOnHighSpaceUsage;
        }

        public UpdateBackupPolicyResponseBodyData setIsCrossRegionDataBackupEnabled(Boolean isCrossRegionDataBackupEnabled) {
            this.isCrossRegionDataBackupEnabled = isCrossRegionDataBackupEnabled;
            return this;
        }
        public Boolean getIsCrossRegionDataBackupEnabled() {
            return this.isCrossRegionDataBackupEnabled;
        }

        public UpdateBackupPolicyResponseBodyData setIsCrossRegionLogBackupEnabled(Boolean isCrossRegionLogBackupEnabled) {
            this.isCrossRegionLogBackupEnabled = isCrossRegionLogBackupEnabled;
            return this;
        }
        public Boolean getIsCrossRegionLogBackupEnabled() {
            return this.isCrossRegionLogBackupEnabled;
        }

        public UpdateBackupPolicyResponseBodyData setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public UpdateBackupPolicyResponseBodyData setLocalLogRetention(Integer localLogRetention) {
            this.localLogRetention = localLogRetention;
            return this;
        }
        public Integer getLocalLogRetention() {
            return this.localLogRetention;
        }

        public UpdateBackupPolicyResponseBodyData setLocalLogRetentionNumber(Integer localLogRetentionNumber) {
            this.localLogRetentionNumber = localLogRetentionNumber;
            return this;
        }
        public Integer getLocalLogRetentionNumber() {
            return this.localLogRetentionNumber;
        }

        public UpdateBackupPolicyResponseBodyData setLogLocalRetentionSpace(Integer logLocalRetentionSpace) {
            this.logLocalRetentionSpace = logLocalRetentionSpace;
            return this;
        }
        public Integer getLogLocalRetentionSpace() {
            return this.logLocalRetentionSpace;
        }

        public UpdateBackupPolicyResponseBodyData setRemoveLogRetention(Integer removeLogRetention) {
            this.removeLogRetention = removeLogRetention;
            return this;
        }
        public Integer getRemoveLogRetention() {
            return this.removeLogRetention;
        }

    }

}
