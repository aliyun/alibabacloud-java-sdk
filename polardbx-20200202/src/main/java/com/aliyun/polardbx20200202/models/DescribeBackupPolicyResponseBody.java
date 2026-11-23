// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The response body.</p>
     */
    @NameInMap("Data")
    public DescribeBackupPolicyResponseBodyData data;

    /**
     * <p>The message returned. If the request is successful, success is returned. If the request fails, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B87E2AB3-B7C9-4394-9160-7F639F732031</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setData(DescribeBackupPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBackupPolicyResponseBodyData getData() {
        return this.data;
    }

    public DescribeBackupPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBackupPolicyResponseBodyData extends TeaModel {
        /**
         * <p>The backup cycle. You must specify at least 2 days. The value is a 7-digit string. Each digit from left to right indicates whether backup is enabled from Monday to Sunday. A value of 0 indicates that backup is disabled, and a value of 1 indicates that backup is enabled:</p>
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
         * <p>The start time of the daily backup, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>03:00Z</p>
         */
        @NameInMap("BackupPlanBegin")
        public String backupPlanBegin;

        /**
         * <p>The retention period of backup sets, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("BackupSetRetention")
        public Integer backupSetRetention;

        /**
         * <p>The backup type. A value of 0 indicates quick backup.</p>
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
         * <p>The interval for cold data backups, in days. Valid values: 1 to 59.</p>
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
         * <p>The name of the instance.</p>
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
         * <p>Indicates whether binary logs are forcibly cleared when the space usage of the instance is excessively high. A value of 1 indicates yes, and a value of 0 indicates no.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ForceCleanOnHighSpaceUsage")
        public Integer forceCleanOnHighSpaceUsage;

        /**
         * <p>Indicates whether cross-region data backup is enabled. Default value: false.</p>
         */
        @NameInMap("IsCrossRegionDataBackupEnabled")
        public Boolean isCrossRegionDataBackupEnabled;

        /**
         * <p>Indicates whether cross-region log backup is enabled. Default value: false.</p>
         */
        @NameInMap("IsCrossRegionLogBackupEnabled")
        public Boolean isCrossRegionLogBackupEnabled;

        /**
         * <p>Indicates whether backup is enabled. The value is fixed as 1, which indicates that backup is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsEnabled")
        public Integer isEnabled;

        /**
         * <p>The retention period of local log backups, in hours. Valid values: 0 to 7 × 24. A value of 0 indicates that local log backups are not retained. Default value: 7.</p>
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
         * <p>The maximum space usage of binary logs. The parameter value ranges from 0 to 50. This is a loop space. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LogLocalRetentionSpace")
        public Integer logLocalRetentionSpace;

        /**
         * <p>The retention period of remote log backups, in days. Valid values: 7 to 730. Default value: 7.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RemoveLogRetention")
        public Integer removeLogRetention;

        public static DescribeBackupPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyData self = new DescribeBackupPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyData setBackupPeriod(String backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        public DescribeBackupPolicyResponseBodyData setBackupPlanBegin(String backupPlanBegin) {
            this.backupPlanBegin = backupPlanBegin;
            return this;
        }
        public String getBackupPlanBegin() {
            return this.backupPlanBegin;
        }

        public DescribeBackupPolicyResponseBodyData setBackupSetRetention(Integer backupSetRetention) {
            this.backupSetRetention = backupSetRetention;
            return this;
        }
        public Integer getBackupSetRetention() {
            return this.backupSetRetention;
        }

        public DescribeBackupPolicyResponseBodyData setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupPolicyResponseBodyData setBackupWay(String backupWay) {
            this.backupWay = backupWay;
            return this;
        }
        public String getBackupWay() {
            return this.backupWay;
        }

        public DescribeBackupPolicyResponseBodyData setColdDataBackupInterval(Integer coldDataBackupInterval) {
            this.coldDataBackupInterval = coldDataBackupInterval;
            return this;
        }
        public Integer getColdDataBackupInterval() {
            return this.coldDataBackupInterval;
        }

        public DescribeBackupPolicyResponseBodyData setColdDataBackupRetention(Integer coldDataBackupRetention) {
            this.coldDataBackupRetention = coldDataBackupRetention;
            return this;
        }
        public Integer getColdDataBackupRetention() {
            return this.coldDataBackupRetention;
        }

        public DescribeBackupPolicyResponseBodyData setCrossRegionDataBackupRetention(Integer crossRegionDataBackupRetention) {
            this.crossRegionDataBackupRetention = crossRegionDataBackupRetention;
            return this;
        }
        public Integer getCrossRegionDataBackupRetention() {
            return this.crossRegionDataBackupRetention;
        }

        public DescribeBackupPolicyResponseBodyData setCrossRegionFilterValue(String crossRegionFilterValue) {
            this.crossRegionFilterValue = crossRegionFilterValue;
            return this;
        }
        public String getCrossRegionFilterValue() {
            return this.crossRegionFilterValue;
        }

        public DescribeBackupPolicyResponseBodyData setCrossRegionLogBackupRetention(Integer crossRegionLogBackupRetention) {
            this.crossRegionLogBackupRetention = crossRegionLogBackupRetention;
            return this;
        }
        public Integer getCrossRegionLogBackupRetention() {
            return this.crossRegionLogBackupRetention;
        }

        public DescribeBackupPolicyResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeBackupPolicyResponseBodyData setDestCrossRegion(String destCrossRegion) {
            this.destCrossRegion = destCrossRegion;
            return this;
        }
        public String getDestCrossRegion() {
            return this.destCrossRegion;
        }

        public DescribeBackupPolicyResponseBodyData setForceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
            this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
            return this;
        }
        public Integer getForceCleanOnHighSpaceUsage() {
            return this.forceCleanOnHighSpaceUsage;
        }

        public DescribeBackupPolicyResponseBodyData setIsCrossRegionDataBackupEnabled(Boolean isCrossRegionDataBackupEnabled) {
            this.isCrossRegionDataBackupEnabled = isCrossRegionDataBackupEnabled;
            return this;
        }
        public Boolean getIsCrossRegionDataBackupEnabled() {
            return this.isCrossRegionDataBackupEnabled;
        }

        public DescribeBackupPolicyResponseBodyData setIsCrossRegionLogBackupEnabled(Boolean isCrossRegionLogBackupEnabled) {
            this.isCrossRegionLogBackupEnabled = isCrossRegionLogBackupEnabled;
            return this;
        }
        public Boolean getIsCrossRegionLogBackupEnabled() {
            return this.isCrossRegionLogBackupEnabled;
        }

        public DescribeBackupPolicyResponseBodyData setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        public DescribeBackupPolicyResponseBodyData setLocalLogRetention(Integer localLogRetention) {
            this.localLogRetention = localLogRetention;
            return this;
        }
        public Integer getLocalLogRetention() {
            return this.localLogRetention;
        }

        public DescribeBackupPolicyResponseBodyData setLocalLogRetentionNumber(Integer localLogRetentionNumber) {
            this.localLogRetentionNumber = localLogRetentionNumber;
            return this;
        }
        public Integer getLocalLogRetentionNumber() {
            return this.localLogRetentionNumber;
        }

        public DescribeBackupPolicyResponseBodyData setLogLocalRetentionSpace(Integer logLocalRetentionSpace) {
            this.logLocalRetentionSpace = logLocalRetentionSpace;
            return this;
        }
        public Integer getLogLocalRetentionSpace() {
            return this.logLocalRetentionSpace;
        }

        public DescribeBackupPolicyResponseBodyData setRemoveLogRetention(Integer removeLogRetention) {
            this.removeLogRetention = removeLogRetention;
            return this;
        }
        public Integer getRemoveLogRetention() {
            return this.removeLogRetention;
        }

    }

}
