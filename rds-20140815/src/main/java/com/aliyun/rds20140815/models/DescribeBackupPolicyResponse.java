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

    @NameInMap("DuplicationLocation")
    @Validation(required = true)
    public DescribeBackupPolicyResponseDuplicationLocation duplicationLocation;

    public static DescribeBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponse self = new DescribeBackupPolicyResponse();
        return TeaModel.build(map, self);
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

    }

}
