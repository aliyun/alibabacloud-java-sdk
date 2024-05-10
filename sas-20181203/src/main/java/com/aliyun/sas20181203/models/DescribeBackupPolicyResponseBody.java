// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the anti-ransomware policy.</p>
     */
    @NameInMap("BackupPolicyDetail")
    public DescribeBackupPolicyResponseBodyBackupPolicyDetail backupPolicyDetail;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setBackupPolicyDetail(DescribeBackupPolicyResponseBodyBackupPolicyDetail backupPolicyDetail) {
        this.backupPolicyDetail = backupPolicyDetail;
        return this;
    }
    public DescribeBackupPolicyResponseBodyBackupPolicyDetail getBackupPolicyDetail() {
        return this.backupPolicyDetail;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupPolicyResponseBodyBackupPolicyDetail extends TeaModel {
        /**
         * <p>The status of the anti-ransomware agent. Valid values:</p>
         * <br>
         * <p>*   **running**: normal</p>
         * <p>*   **exception**: abnormal</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The ID of the anti-ransomware policy.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the anti-ransomware policy.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>*   **IsDefault**: the type of the anti-ransomware policy. Valid values:</p>
         * <br>
         * <p>    *   **1**: recommended policy</p>
         * <p>    *   **0**: custom policy</p>
         * <br>
         * <p>*   **Include**: the format of the files that you want to protect. If you want to protect the files in all formats, set this field to [].</p>
         * <br>
         * <p>*   **Source**: the directory that you want to protect. If you want to protect all directories, set this field to [].</p>
         * <br>
         * <p>*   **ExcludeSystemPath**: specifies whether to exclude a specific directory from the anti-ransomware policy. If you want to exclude a directory, set this field to **true**. If you do not want to exclude a directory, leave this field empty.</p>
         * <br>
         * <p>*   **Exclude**: the directory that you want to exclude from the anti-ransomware policy. If you do not want to exclude a directory, set this field to [].</p>
         * <br>
         * <p>*   **Schedule**: the start time and interval of a data backup task. We recommend that you specify a start time that begins during off-peak hours but does not start on the hour. Examples:</p>
         * <br>
         * <p>    *   If you set this field to I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of three weeks.</p>
         * <p>    *   If you set this field to I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of 24 hours.</p>
         * <br>
         * <p>*   **Retention**: the period during which backup data is retained. Unit: days. If you set this field to 7, backup data is retained for a week. If you set this field to 365, backup data is retained for a year. If you set this field to -1, backup data is permanently retained.</p>
         * <br>
         * <p>*   **SpeedLimiter**: the limit on the network bandwidth for data backup tasks. If you set this field to 0:24:30720, the maximum bandwidth for a data backup task is 30 MB/s from 00:00 to 24:00.</p>
         * <br>
         * <p>*   **UseVss**: specifies whether to enable the VSS feature. The feature is available only for Windows servers. Valid values:</p>
         * <br>
         * <p>    *   **true**: yes</p>
         * <p>    *   **false**: no</p>
         * <br>
         * <p>>  The VSS feature is available only if you create the anti-ransomware policy for Windows servers. After you enable the feature, the number of backup failures due to running processes is significantly reduced. We recommend that you enable the VSS feature. After you enable the feature, the data of disks that are in the exFAT and FAT32 formats cannot be backed up.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The version of the anti-ransomware policy.</p>
         * <br>
         * <p>*   **1.0.0**</p>
         * <p>*   **2.0.0**</p>
         */
        @NameInMap("PolicyVersion")
        public String policyVersion;

        /**
         * <p>The ID of the region in which backup data is stored.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the anti-ransomware policy. Valid values:</p>
         * <br>
         * <p>*   **enabled**: The anti-ransomware policy is manually enabled.</p>
         * <p>*   **disabled**: The anti-ransomware policy is manually disabled. After an anti-ransomware policy is disabled, the data backup task that is running based on the policy stops.</p>
         * <p>*   **closed**: The anti-ransomware policy automatically stops because the anti-ransomware capacity is insufficient.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>An array consisting of the UUIDs of the servers to which the anti-ransomware policy is applied.</p>
         */
        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        public static DescribeBackupPolicyResponseBodyBackupPolicyDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyBackupPolicyDetail self = new DescribeBackupPolicyResponseBodyBackupPolicyDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setPolicyVersion(String policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setUuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

    }

}
