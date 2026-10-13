// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the anti-ransomware policy that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>policy_name_A</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The content of the policy that you want to modify. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><p><strong>Source</strong>: the server directories to be protected. To protect all directories, set this field to [].</p>
     * </li>
     * <li><p><strong>Include</strong>: the types of files to be protected. Examples: &quot;\<em>.jpg&quot; and &quot;\</em>.doc&quot;.</p>
     * </li>
     * <li><p><strong>Exclude</strong>: the custom directories to be excluded. To exclude the &quot;/home/user&quot; directory, call the DescribeExcludeSystemPath operation to obtain all directories and then add the directories to be excluded. Example: exclude the &quot;/home/user&quot; directory.</p>
     * </li>
     * <li><p><strong>Schedule</strong>: the start time and interval of the data backup task. Specify a time during off-peak hours and avoid exact hours.</p>
     * <ul>
     * <li><p>Example 1: I|1583216092|P21D indicates that the start time is 2020-03-03 14:14:52 and the interval is 3 weeks.</p>
     * </li>
     * <li><p>Example 2: I|1583216092|PT24H indicates that the start time is 2020-03-03 14:14:52 and the interval is 24 hours.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Retention</strong>: the retention period of backup data. Unit: days. A value of 7 indicates 1 week, 365 indicates 1 year, and -1 indicates permanent retention.</p>
     * </li>
     * <li><p><strong>SpeedLimiter</strong>: the bandwidth limit for the backup network. Example: 12:15:15360|6:12:5120 indicates a limit of 15 MB from 12:00 to 15:00 and 5 MB from 06:00 to 12:00.
     * If the cloud server is connected to the internal network, do not limit the backup network bandwidth. To remove the bandwidth limit, set this parameter to an empty string (&quot;&quot;).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Source&quot;:[&quot;home&quot;,&quot;admin&quot;]}</p>
     */
    @NameInMap("Policy")
    public java.util.Map<String, ?> policy;

    /**
     * <p>The region where the server to which the policy applies resides.</p>
     * <p>You can call the <a href="~~DescribeSupportRegion~~">DescribeSupportRegion</a> operation to query the regions supported by the anti-ransomware feature.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("PolicyRegionId")
    public String policyRegionId;

    /**
     * <p>The version of the policy. You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the version.</p>
     * <ul>
     * <li><strong>1.0.0</strong></li>
     * <li><strong>2.0.0</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The method to cover assets. Valid values:</p>
     * <ul>
     * <li><strong>ALL_MACHINE</strong>: all assets<blockquote>
     * <p>To cover all assets of this type, set this parameter to <strong>ALL_MACHINE</strong>. In this case, <strong>UuidList</strong> does not take effect. Only one policy that covers all assets can exist for the same server type.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL_MACHINE</p>
     */
    @NameInMap("SelectType")
    public String selectType;

    /**
     * <p>The server type. Valid values:</p>
     * <ul>
     * <li><strong>ALIYUN</strong>: Alibaba Cloud server</li>
     * <li><strong>OUT_CLOUD</strong>: third-party server</li>
     * <li><strong>TRIPARTITE</strong>: simple application server</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("ServerType")
    public String serverType;

    /**
     * <p>The list of UUIDs of the servers protected by the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;, &quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;]</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static ModifyBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyRequest self = new ModifyBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyBackupPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyBackupPolicyRequest setPolicy(java.util.Map<String, ?> policy) {
        this.policy = policy;
        return this;
    }
    public java.util.Map<String, ?> getPolicy() {
        return this.policy;
    }

    public ModifyBackupPolicyRequest setPolicyRegionId(String policyRegionId) {
        this.policyRegionId = policyRegionId;
        return this;
    }
    public String getPolicyRegionId() {
        return this.policyRegionId;
    }

    public ModifyBackupPolicyRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public ModifyBackupPolicyRequest setSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }
    public String getSelectType() {
        return this.selectType;
    }

    public ModifyBackupPolicyRequest setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

    public ModifyBackupPolicyRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
