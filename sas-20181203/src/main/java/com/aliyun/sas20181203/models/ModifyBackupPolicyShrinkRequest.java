// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy that you want to modify.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the anti-ransomware policy that you want to modify.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configurations of the anti-ransomware policy that you want to modify. The value is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **Source**: the directory that you want to protect. If you want to protect all directories, set this field to brackets \[].</p>
     * <br>
     * <p>*   **Include**: the format of the file that you want to protect. Examples: \*.jpg and \*.doc.</p>
     * <br>
     * <p>*   **Exclude**: the directory that you want to exclude from the anti-ransomware policy. You can call the DescribeExcludeSystemPath operation to query all directories and then specify the directory that you want to exclude. Example: /home/user.</p>
     * <br>
     * <p>*   **Schedule**: the start time and interval of a data backup task. We recommend that you specify a start time that begins during off-peak hours but does not start on the hour.</p>
     * <br>
     * <p>    *   If you set this field to I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is executed at an interval of three weeks.</p>
     * <p>    *   If you set this field to I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is executed at an interval of 24 hours.</p>
     * <br>
     * <p>*   **Retention**: the period during which backup data is retained. Unit: day. If you set this field to 7, backup data is retained for a week. If you set this field to 365, backup data is retained for a year. If you set this field to -1, backup data is permanently retained.</p>
     * <br>
     * <p>*   **SpeedLimiter**: the limit on the network bandwidth for data backup tasks. If you set this field to 12:15:15360|6:12:5120, the maximum bandwidth for a data backup task is 15 Mbit/s from 12:00 to 15:00 and 5 Mbit/s from 06:00 to 12:00.</p>
     * <br>
     * <p>If you back up data on an Elastic Compute Service (ECS) instance that is connected over an internal network, we recommend that you leave this field empty. If this field is left empty, the bandwidth for data backup tasks is unlimited.</p>
     */
    @NameInMap("Policy")
    public String policyShrink;

    /**
     * <p>The region ID of the server to which the anti-ransomware policy is applied.</p>
     * <br>
     * <p>You can call the [DescribeSupportRegion](~~DescribeSupportRegion~~) operation to query the regions in which the anti-ransomware feature is supported.</p>
     */
    @NameInMap("PolicyRegionId")
    public String policyRegionId;

    /**
     * <p>The version of the anti-ransomware policy. You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the versions of anti-ransomware policies.</p>
     * <br>
     * <p>*   **1.0.0**</p>
     * <p>*   **2.0.0**</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The UUIDs of the servers to which the anti-ransomware policy is applied.</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static ModifyBackupPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyShrinkRequest self = new ModifyBackupPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyBackupPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyBackupPolicyShrinkRequest setPolicyShrink(String policyShrink) {
        this.policyShrink = policyShrink;
        return this;
    }
    public String getPolicyShrink() {
        return this.policyShrink;
    }

    public ModifyBackupPolicyShrinkRequest setPolicyRegionId(String policyRegionId) {
        this.policyRegionId = policyRegionId;
        return this;
    }
    public String getPolicyRegionId() {
        return this.policyRegionId;
    }

    public ModifyBackupPolicyShrinkRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public ModifyBackupPolicyShrinkRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
