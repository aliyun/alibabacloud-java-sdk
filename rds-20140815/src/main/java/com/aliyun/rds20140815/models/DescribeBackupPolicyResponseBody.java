// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    @NameInMap("BackupLog")
    public String backupLog;

    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    @NameInMap("LocalLogRetentionHours")
    public Integer localLogRetentionHours;

    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    @NameInMap("Duplication")
    public String duplication;

    @NameInMap("DuplicationContent")
    public String duplicationContent;

    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    @NameInMap("LogBackupFrequency")
    public String logBackupFrequency;

    @NameInMap("CompressType")
    public String compressType;

    @NameInMap("ArchiveBackupRetentionPeriod")
    public String archiveBackupRetentionPeriod;

    @NameInMap("ArchiveBackupKeepPolicy")
    public String archiveBackupKeepPolicy;

    @NameInMap("ArchiveBackupKeepCount")
    public String archiveBackupKeepCount;

    @NameInMap("ReleasedKeepPolicy")
    public String releasedKeepPolicy;

    @NameInMap("LogBackupLocalRetentionNumber")
    public Integer logBackupLocalRetentionNumber;

    @NameInMap("Category")
    public String category;

    @NameInMap("SupportReleasedKeep")
    public Integer supportReleasedKeep;

    @NameInMap("BackupInterval")
    public String backupInterval;

    @NameInMap("DuplicationLocation")
    public DescribeBackupPolicyResponseBodyDuplicationLocation duplicationLocation;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredNextBackupTime(String preferredNextBackupTime) {
        this.preferredNextBackupTime = preferredNextBackupTime;
        return this;
    }
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setBackupLog(String backupLog) {
        this.backupLog = backupLog;
        return this;
    }
    public String getBackupLog() {
        return this.backupLog;
    }

    public DescribeBackupPolicyResponseBody setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setEnableBackupLog(String enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public DescribeBackupPolicyResponseBody setLocalLogRetentionHours(Integer localLogRetentionHours) {
        this.localLogRetentionHours = localLogRetentionHours;
        return this;
    }
    public Integer getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    public DescribeBackupPolicyResponseBody setLocalLogRetentionSpace(String localLogRetentionSpace) {
        this.localLogRetentionSpace = localLogRetentionSpace;
        return this;
    }
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    public DescribeBackupPolicyResponseBody setDuplication(String duplication) {
        this.duplication = duplication;
        return this;
    }
    public String getDuplication() {
        return this.duplication;
    }

    public DescribeBackupPolicyResponseBody setDuplicationContent(String duplicationContent) {
        this.duplicationContent = duplicationContent;
        return this;
    }
    public String getDuplicationContent() {
        return this.duplicationContent;
    }

    public DescribeBackupPolicyResponseBody setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public DescribeBackupPolicyResponseBody setLogBackupFrequency(String logBackupFrequency) {
        this.logBackupFrequency = logBackupFrequency;
        return this;
    }
    public String getLogBackupFrequency() {
        return this.logBackupFrequency;
    }

    public DescribeBackupPolicyResponseBody setCompressType(String compressType) {
        this.compressType = compressType;
        return this;
    }
    public String getCompressType() {
        return this.compressType;
    }

    public DescribeBackupPolicyResponseBody setArchiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
        this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
        return this;
    }
    public String getArchiveBackupRetentionPeriod() {
        return this.archiveBackupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setArchiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
        this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
        return this;
    }
    public String getArchiveBackupKeepPolicy() {
        return this.archiveBackupKeepPolicy;
    }

    public DescribeBackupPolicyResponseBody setArchiveBackupKeepCount(String archiveBackupKeepCount) {
        this.archiveBackupKeepCount = archiveBackupKeepCount;
        return this;
    }
    public String getArchiveBackupKeepCount() {
        return this.archiveBackupKeepCount;
    }

    public DescribeBackupPolicyResponseBody setReleasedKeepPolicy(String releasedKeepPolicy) {
        this.releasedKeepPolicy = releasedKeepPolicy;
        return this;
    }
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
    }

    public DescribeBackupPolicyResponseBody setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
        this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
        return this;
    }
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    public DescribeBackupPolicyResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeBackupPolicyResponseBody setSupportReleasedKeep(Integer supportReleasedKeep) {
        this.supportReleasedKeep = supportReleasedKeep;
        return this;
    }
    public Integer getSupportReleasedKeep() {
        return this.supportReleasedKeep;
    }

    public DescribeBackupPolicyResponseBody setBackupInterval(String backupInterval) {
        this.backupInterval = backupInterval;
        return this;
    }
    public String getBackupInterval() {
        return this.backupInterval;
    }

    public DescribeBackupPolicyResponseBody setDuplicationLocation(DescribeBackupPolicyResponseBodyDuplicationLocation duplicationLocation) {
        this.duplicationLocation = duplicationLocation;
        return this;
    }
    public DescribeBackupPolicyResponseBodyDuplicationLocation getDuplicationLocation() {
        return this.duplicationLocation;
    }

    public static class DescribeBackupPolicyResponseBodyDuplicationLocationLocation extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Bucket")
        public String bucket;

        public static DescribeBackupPolicyResponseBodyDuplicationLocationLocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyDuplicationLocationLocation self = new DescribeBackupPolicyResponseBodyDuplicationLocationLocation();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyDuplicationLocationLocation setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeBackupPolicyResponseBodyDuplicationLocationLocation setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class DescribeBackupPolicyResponseBodyDuplicationLocation extends TeaModel {
        @NameInMap("Sotrage")
        public String sotrage;

        @NameInMap("Location")
        public DescribeBackupPolicyResponseBodyDuplicationLocationLocation location;

        public static DescribeBackupPolicyResponseBodyDuplicationLocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyDuplicationLocation self = new DescribeBackupPolicyResponseBodyDuplicationLocation();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyDuplicationLocation setSotrage(String sotrage) {
            this.sotrage = sotrage;
            return this;
        }
        public String getSotrage() {
            return this.sotrage;
        }

        public DescribeBackupPolicyResponseBodyDuplicationLocation setLocation(DescribeBackupPolicyResponseBodyDuplicationLocationLocation location) {
            this.location = location;
            return this;
        }
        public DescribeBackupPolicyResponseBodyDuplicationLocationLocation getLocation() {
            return this.location;
        }

    }

}
