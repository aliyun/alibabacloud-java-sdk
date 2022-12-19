// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyShrinkRequest extends TeaModel {
    // The name of the anti-ransomware policy.
    @NameInMap("Name")
    public String name;

    // *   **IsDefault**: the type of the anti-ransomware policy. Valid values:
    // 
    //     *   **1**: recommended policy
    //     *   **0**: custom policy
    // 
    // *   **Include**: the format of the files that you want to protect. If you want to protect the files in all formats, set this field to \[].
    // 
    // *   **Source**: the directory that you want to protect. If you want to protect all directories, set this field to \[].
    // 
    // *   **ExcludeSystemPath**: specifies whether to exclude a specific directory from the anti-ransomware policy. If you want to exclude a directory, set this field to **true**. If you do not want to exclude a directory, leave this field empty.
    // 
    // *   **Exclude**: the directory that you want to exclude from the anti-ransomware policy. If you do not want to exclude a directory, set this field to \[].
    // 
    // *   **Schedule**: the start time and interval of a data backup task. We recommend that you specify a start time that begins during off-peak hours but does not start on the hour. Examples:
    // 
    //     *   If you set this field to I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of three weeks.
    //     *   If you set this field to I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of 24 hours.
    // 
    // *   **Retention**: the period during which backup data is retained. Unit: days. If you set this field to 7, backup data is retained for a week. If you set this field to 365, backup data is retained for a year. If you set this field to -1, backup data is permanently retained.
    // 
    // *   **SpeedLimiter**: the limit on the network bandwidth for data backup tasks. If you set this field to 0:24:30720, the maximum bandwidth for a data backup task is 30 MB/s from 00:00 to 24:00.
    // 
    // *   **UseVss**: specifies whether to enable the VSS feature. The feature is available only for Windows servers. Valid values:
    // 
    //     *   **true**: yes
    //     *   **false**: no
    // 
    // >  The VSS feature is available only if you create the anti-ransomware policy for Windows servers. After you enable the feature, the number of backup failures due to running processes is significantly reduced. We recommend that you enable the VSS feature. After you enable the feature, the data of disks that are in the exFAT and FAT32 formats cannot be backed up.
    @NameInMap("Policy")
    public String policyShrink;

    // The region ID of the server that is not deployed on Alibaba Cloud.
    // 
    // >  We recommend that you specify the ID of the supported region that is the nearest to the location of the server. You can call the [DescribeSupportRegion](~~DescribeSupportRegion~~) operation to query the supported regions of the anti-ransomware feature.
    @NameInMap("PolicyRegionId")
    public String policyRegionId;

    // The version of the anti-ransomware policy. Set the value to **2.0.0**.
    @NameInMap("PolicyVersion")
    public String policyVersion;

    // The UUIDs of the servers that you want to protect.
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static CreateBackupPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPolicyShrinkRequest self = new CreateBackupPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBackupPolicyShrinkRequest setPolicyShrink(String policyShrink) {
        this.policyShrink = policyShrink;
        return this;
    }
    public String getPolicyShrink() {
        return this.policyShrink;
    }

    public CreateBackupPolicyShrinkRequest setPolicyRegionId(String policyRegionId) {
        this.policyRegionId = policyRegionId;
        return this;
    }
    public String getPolicyRegionId() {
        return this.policyRegionId;
    }

    public CreateBackupPolicyShrinkRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public CreateBackupPolicyShrinkRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
