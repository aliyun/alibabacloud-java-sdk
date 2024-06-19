// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The following parameters are no longer used. Ignore the parameters.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeBackupPolicyResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The retention period of the backup data. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    /**
     * <p>Indicates whether the backup-as-a-service feature is enabled for the instance. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The backup-as-a-service feature is enabled for the instance.</li>
     * <li><strong>0</strong>: The backup-as-a-service feature is disabled for the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DbsInstance")
    public String dbsInstance;

    /**
     * <p>Indicates whether incremental data backup is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Incremental data backup is enabled.</li>
     * <li><strong>0</strong>: Incremental data backup is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public Integer enableBackupLog;

    /**
     * <p>The backup cycle. Valid values:</p>
     * <ul>
     * <li><strong>Monday</strong></li>
     * <li><strong>Tuesday</strong></li>
     * <li><strong>Wednesday</strong></li>
     * <li><strong>Thursday</strong></li>
     * <li><strong>Friday</strong></li>
     * <li><strong>Saturday</strong></li>
     * <li><strong>Sunday</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The time range during which the backup was created. The time follows the ISO 8601 standard in the <em>HH:mm</em>Z-<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>05:00Z-06:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The next backup time. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-14T05:28Z</p>
     */
    @NameInMap("PreferredNextBackupTime")
    public String preferredNextBackupTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90B82DB7-FB28-4CC2-ADBF-1F8659F3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setAccessDeniedDetail(DescribeBackupPolicyResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeBackupPolicyResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPeriod(String backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public String getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setDbsInstance(String dbsInstance) {
        this.dbsInstance = dbsInstance;
        return this;
    }
    public String getDbsInstance() {
        return this.dbsInstance;
    }

    public DescribeBackupPolicyResponseBody setEnableBackupLog(Integer enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
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

    public static class DescribeBackupPolicyResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeBackupPolicyResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyAccessDeniedDetail self = new DescribeBackupPolicyResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeBackupPolicyResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeBackupPolicyResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeBackupPolicyResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeBackupPolicyResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeBackupPolicyResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeBackupPolicyResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
