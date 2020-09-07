// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BackupRetentionPeriod")
    @Validation(required = true)
    public Integer backupRetentionPeriod;

    @NameInMap("PreferredNextBackupTime")
    @Validation(required = true)
    public String preferredNextBackupTime;

    @NameInMap("PreferredBackupTime")
    @Validation(required = true)
    public String preferredBackupTime;

    @NameInMap("PreferredBackupPeriod")
    @Validation(required = true)
    public String preferredBackupPeriod;

    @NameInMap("BackupLog")
    @Validation(required = true)
    public String backupLog;

    @NameInMap("LogBackupRetentionPeriod")
    @Validation(required = true)
    public Integer logBackupRetentionPeriod;

    @NameInMap("EnableBackupLog")
    @Validation(required = true)
    public String enableBackupLog;

    @NameInMap("LocalLogRetentionHours")
    @Validation(required = true)
    public Integer localLogRetentionHours;

    @NameInMap("LocalLogRetentionSpace")
    @Validation(required = true)
    public String localLogRetentionSpace;

    @NameInMap("Duplication")
    @Validation(required = true)
    public String duplication;

    @NameInMap("DuplicationContent")
    @Validation(required = true)
    public String duplicationContent;

    @NameInMap("HighSpaceUsageProtection")
    @Validation(required = true)
    public String highSpaceUsageProtection;

    @NameInMap("LogBackupFrequency")
    @Validation(required = true)
    public String logBackupFrequency;

    @NameInMap("CompressType")
    @Validation(required = true)
    public String compressType;

    @NameInMap("ArchiveBackupRetentionPeriod")
    @Validation(required = true)
    public String archiveBackupRetentionPeriod;

    @NameInMap("ArchiveBackupKeepPolicy")
    @Validation(required = true)
    public String archiveBackupKeepPolicy;

    @NameInMap("ArchiveBackupKeepCount")
    @Validation(required = true)
    public String archiveBackupKeepCount;

    @NameInMap("ReleasedKeepPolicy")
    @Validation(required = true)
    public String releasedKeepPolicy;

    @NameInMap("LogBackupLocalRetentionNumber")
    @Validation(required = true)
    public Integer logBackupLocalRetentionNumber;

    @NameInMap("Category")
    @Validation(required = true)
    public String category;

    @NameInMap("SupportReleasedKeep")
    @Validation(required = true)
    public Integer supportReleasedKeep;

    @NameInMap("BackupInterval")
    @Validation(required = true)
    public String backupInterval;

    @NameInMap("DuplicationLocation")
    @Validation(required = true)
    public DescribeBackupPolicyResponseDuplicationLocation duplicationLocation;

    public static DescribeBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponse self = new DescribeBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponse setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public DescribeBackupPolicyResponse setPreferredNextBackupTime(String preferredNextBackupTime) {
        this.preferredNextBackupTime = preferredNextBackupTime;
        return this;
    }
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    public DescribeBackupPolicyResponse setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeBackupPolicyResponse setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeBackupPolicyResponse setBackupLog(String backupLog) {
        this.backupLog = backupLog;
        return this;
    }
    public String getBackupLog() {
        return this.backupLog;
    }

    public DescribeBackupPolicyResponse setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponse setEnableBackupLog(String enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public DescribeBackupPolicyResponse setLocalLogRetentionHours(Integer localLogRetentionHours) {
        this.localLogRetentionHours = localLogRetentionHours;
        return this;
    }
    public Integer getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    public DescribeBackupPolicyResponse setLocalLogRetentionSpace(String localLogRetentionSpace) {
        this.localLogRetentionSpace = localLogRetentionSpace;
        return this;
    }
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    public DescribeBackupPolicyResponse setDuplication(String duplication) {
        this.duplication = duplication;
        return this;
    }
    public String getDuplication() {
        return this.duplication;
    }

    public DescribeBackupPolicyResponse setDuplicationContent(String duplicationContent) {
        this.duplicationContent = duplicationContent;
        return this;
    }
    public String getDuplicationContent() {
        return this.duplicationContent;
    }

    public DescribeBackupPolicyResponse setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public DescribeBackupPolicyResponse setLogBackupFrequency(String logBackupFrequency) {
        this.logBackupFrequency = logBackupFrequency;
        return this;
    }
    public String getLogBackupFrequency() {
        return this.logBackupFrequency;
    }

    public DescribeBackupPolicyResponse setCompressType(String compressType) {
        this.compressType = compressType;
        return this;
    }
    public String getCompressType() {
        return this.compressType;
    }

    public DescribeBackupPolicyResponse setArchiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
        this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
        return this;
    }
    public String getArchiveBackupRetentionPeriod() {
        return this.archiveBackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponse setArchiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
        this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
        return this;
    }
    public String getArchiveBackupKeepPolicy() {
        return this.archiveBackupKeepPolicy;
    }

    public DescribeBackupPolicyResponse setArchiveBackupKeepCount(String archiveBackupKeepCount) {
        this.archiveBackupKeepCount = archiveBackupKeepCount;
        return this;
    }
    public String getArchiveBackupKeepCount() {
        return this.archiveBackupKeepCount;
    }

    public DescribeBackupPolicyResponse setReleasedKeepPolicy(String releasedKeepPolicy) {
        this.releasedKeepPolicy = releasedKeepPolicy;
        return this;
    }
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
    }

    public DescribeBackupPolicyResponse setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
        this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
        return this;
    }
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    public DescribeBackupPolicyResponse setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeBackupPolicyResponse setSupportReleasedKeep(Integer supportReleasedKeep) {
        this.supportReleasedKeep = supportReleasedKeep;
        return this;
    }
    public Integer getSupportReleasedKeep() {
        return this.supportReleasedKeep;
    }

    public DescribeBackupPolicyResponse setBackupInterval(String backupInterval) {
        this.backupInterval = backupInterval;
        return this;
    }
    public String getBackupInterval() {
        return this.backupInterval;
    }

    public DescribeBackupPolicyResponse setDuplicationLocation(DescribeBackupPolicyResponseDuplicationLocation duplicationLocation) {
        this.duplicationLocation = duplicationLocation;
        return this;
    }
    public DescribeBackupPolicyResponseDuplicationLocation getDuplicationLocation() {
        return this.duplicationLocation;
    }

    public static class DescribeBackupPolicyResponseDuplicationLocationLocation extends TeaModel {
        @NameInMap("Endpoint")
        @Validation(required = true)
        public String endpoint;

        @NameInMap("Bucket")
        @Validation(required = true)
        public String bucket;

        public static DescribeBackupPolicyResponseDuplicationLocationLocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseDuplicationLocationLocation self = new DescribeBackupPolicyResponseDuplicationLocationLocation();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseDuplicationLocationLocation setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeBackupPolicyResponseDuplicationLocationLocation setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class DescribeBackupPolicyResponseDuplicationLocation extends TeaModel {
        @NameInMap("Sotrage")
        @Validation(required = true)
        public String sotrage;

        @NameInMap("Location")
        @Validation(required = true)
        public DescribeBackupPolicyResponseDuplicationLocationLocation location;

        public static DescribeBackupPolicyResponseDuplicationLocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseDuplicationLocation self = new DescribeBackupPolicyResponseDuplicationLocation();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseDuplicationLocation setSotrage(String sotrage) {
            this.sotrage = sotrage;
            return this;
        }
        public String getSotrage() {
            return this.sotrage;
        }

        public DescribeBackupPolicyResponseDuplicationLocation setLocation(DescribeBackupPolicyResponseDuplicationLocationLocation location) {
            this.location = location;
            return this;
        }
        public DescribeBackupPolicyResponseDuplicationLocationLocation getLocation() {
            return this.location;
        }

    }

}
