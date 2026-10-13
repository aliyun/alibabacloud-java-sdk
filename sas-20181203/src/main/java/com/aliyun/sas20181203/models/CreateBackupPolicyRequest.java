// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyRequest extends TeaModel {
    /**
     * <p>Sets the name of the anti-ransomware policy to create.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ServerBackUpPolicy01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <ul>
     * <li><strong>IsDefault</strong>: The type of the anti-ransomware policy to create. Valid values:<ul>
     * <li><strong>1</strong>: recommended policy</li>
     * <li><strong>0</strong>: custom policy</li>
     * </ul>
     * </li>
     * <li><strong>Include</strong>: The file types to protect. To protect all file types, set this parameter to [].</li>
     * <li><strong>Source</strong>: The server directories to protect. To protect all directories, set this parameter to [].</li>
     * <li><strong>ExcludeSystemPath</strong>: Specifies whether to exclude the specified directories. To exclude the directories, set this parameter to <strong>true</strong>. If you do not want to exclude the directories, you do not need to set this parameter.</li>
     * <li><strong>Exclude</strong>: Sets the specified protection directory addresses. If you do not want to specify protection directory addresses, set this parameter to [].</li>
     * <li><strong>Schedule</strong>: Sets the execution time and execution interval of the data backup task. We recommend that you specify a non-integer hour during off-peak hours. Examples:<ul>
     * <li>Example 1: I|1583216092|P21D indicates that the data backup starts at 14:14:52 on March 3, 2020, and the backup policy execution interval is 3 weeks.</li>
     * <li>Example 2: I|1583216092|PT24H indicates that the data backup starts at 14:14:52 on March 3, 2020, and the backup policy execution interval is 24 hours.</li>
     * </ul>
     * </li>
     * <li><strong>Retention</strong>: The retention period of the backup data. Unit: days. A value of 7 indicates 1 week, 365 indicates 1 year, and -1 indicates permanent retention.</li>
     * <li><strong>SpeedLimiter</strong>: Sets the backup network bandwidth limit. Example: 0:24:30720 indicates that the network bandwidth limit for the backup network is 30 MByte/s from 00:00 to 24:00.</li>
     * <li><strong>UseVss</strong>: Specifies whether to enable the Volume Shadow Copy Service (VSS) feature for Windows. Valid values:<ul>
     * <li><strong>true</strong>: enabled</li>
     * <li><strong>false</strong>: disabled</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The VSS feature is available only for Windows systems. Enabling this feature effectively reduces the issue of individual file backup failures caused by process occupation. We recommend that you enable this feature. After this feature is enabled, file backup for exFAT and FAT32 disk formats is not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;IsDefault&quot;:1,&quot;Include&quot;:[],&quot;Source&quot;:[],&quot;Schedule&quot;:&quot;I|1648061040|PT24H&quot;,&quot;Retention&quot;:7,&quot;SpeedLimiter&quot;:&quot;&quot;,&quot;ExcludeSystemPath&quot;:true,&quot;Exclude&quot;:[&quot;/bin/&quot;,&quot;/usr/bin/&quot;,&quot;/sbin/&quot;,&quot;/boot/&quot;,&quot;/proc/&quot;,&quot;/sys/&quot;,&quot;/srv/&quot;,&quot;/lib/&quot;,&quot;/selinux/&quot;,&quot;/usr/sbin/&quot;,&quot;/run/&quot;,&quot;/lib32/&quot;,&quot;/lib64/&quot;,&quot;/lost+found/&quot;,&quot;/var/lib/kubelet/&quot;,&quot;/var/lib/ntp/proc&quot;,&quot;/var/lib/container&quot;,&quot;Windows&quot;,&quot;Python27&quot;,&quot;Program Files (x86)&quot;,&quot;Program Files&quot;,&quot;Boot&quot;,&quot;$RECYCLE.BIN&quot;,&quot;System Volume Information&quot;,&quot;Users\Administrator\NTUSER.DAT*&quot;,&quot;ProgramData&quot;,&quot;pagefile.sys&quot;,&quot;Users\Default\NTUSER.DAT*&quot;,&quot;Users\Administrator\ntuser.*&quot;],&quot;UseVss&quot;:true}&quot;</p>
     */
    @NameInMap("Policy")
    public java.util.Map<String, ?> policy;

    /**
     * <p>The region ID of the server that is not deployed on Alibaba Cloud.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSupportRegion~~">DescribeSupportRegion</a> operation to query the regions supported by the anti-ransomware feature, and then select a supported region that is closest to the region of your server that is not deployed on Alibaba Cloud.</p>
     * </blockquote>
     * <p>This parameter is required when the ServerType parameter is set to OUT_CLOUD.</p>
     * 
     * <strong>example:</strong>
     * <p>ch-hangzhou</p>
     */
    @NameInMap("PolicyRegionId")
    public String policyRegionId;

    /**
     * <p>The version of the anti-ransomware policy. Fixed value: <strong>2.0.0</strong>.</p>
     * <p>This parameter is required.</p>
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
     * <p>To cover all assets of the specified type, set this parameter to <strong>ALL_MACHINE</strong>. In this case, the <strong>UuidList</strong> parameter is invalid. Only one policy that covers all assets can be created for each server type.</p>
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
     * <li><strong>OUT_CLOUD</strong>: server that is not deployed on Alibaba Cloud</li>
     * <li><strong>TRIPARTITE</strong>: simple application server</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("ServerType")
    public String serverType;

    /**
     * <p>The UUIDs of the servers to protect.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;, &quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;]</p>
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

    public CreateBackupPolicyRequest setSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }
    public String getSelectType() {
        return this.selectType;
    }

    public CreateBackupPolicyRequest setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

    public CreateBackupPolicyRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
