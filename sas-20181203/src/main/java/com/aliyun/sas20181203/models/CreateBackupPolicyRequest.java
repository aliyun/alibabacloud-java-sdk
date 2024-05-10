// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyRequest extends TeaModel {
    /**
     * <p>The name of the anti-ransomware policy.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Policy")
    public java.util.Map<String, ?> policy;

    /**
     * <p>The region ID of the server that is not deployed on Alibaba Cloud.</p>
     * <br>
     * <p>>  We recommend that you specify the ID of the supported region that is the nearest to the location of the server. You can call the [DescribeSupportRegion](~~DescribeSupportRegion~~) operation to query the supported regions of the anti-ransomware feature.</p>
     */
    @NameInMap("PolicyRegionId")
    public String policyRegionId;

    /**
     * <p>The version of the anti-ransomware policy. Set the value to **2.0.0**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The UUIDs of the servers that you want to protect.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static CreateBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPolicyRequest self = new CreateBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBackupPolicyRequest setPolicy(java.util.Map<String, ?> policy) {
        this.policy = policy;
        return this;
    }
    public java.util.Map<String, ?> getPolicy() {
        return this.policy;
    }

    public CreateBackupPolicyRequest setPolicyRegionId(String policyRegionId) {
        this.policyRegionId = policyRegionId;
        return this;
    }
    public String getPolicyRegionId() {
        return this.policyRegionId;
    }

    public CreateBackupPolicyRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public CreateBackupPolicyRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
