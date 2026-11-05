// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The name of the anti-ransomware policy to create.</p>
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
     * <li><strong>Exclude</strong>: The specified directories for protection. If you do not specify directories, set this parameter to [].</li>
     * <li><strong>Schedule</strong>: The execution time and interval of the data backup task. We recommend that you specify a time during off-peak hours and avoid exact hours. Examples:<ul>
     * <li>Example 1: I|1583216092|P21D indicates that the data backup starts at 14:14:52 on March 3, 2020, and the execution interval of the backup policy is 3 weeks.</li>
     * <li>Example 2: I|1583216092|PT24H indicates that the data backup starts at 14:14:52 on March 3, 2020, and the execution interval of the backup policy is 24 hours.</li>
     * </ul>
     * </li>
     * <li><strong>Retention</strong>: The retention period of the backup data. Unit: days. A value of 7 indicates 1 week, 365 indicates 1 year, and -1 indicates permanent retention.</li>
     * <li><strong>SpeedLimiter</strong>: The bandwidth limit for the backup network. Example: 0:24:30720 indicates that the bandwidth limit for the backup network is 30 MByte/s from 00:00 to 24:00.</li>
     * <li><strong>UseVss</strong>: Specifies whether to enable the Volume Shadow Copy Service (VSS) feature for Windows. Valid values:<ul>
     * <li><strong>true</strong>: enabled</li>
     * <li><strong>false</strong>: disabled</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The VSS feature is available only for Windows. Enabling this feature effectively reduces backup failures caused by file occupation by processes. We recommend that you enable this feature. After you enable this feature, file backup is not supported for disks in exFAT or FAT32 format.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;IsDefault&quot;:1,&quot;Include&quot;:[],&quot;Source&quot;:[],&quot;Schedule&quot;:&quot;I|1648061040|PT24H&quot;,&quot;Retention&quot;:7,&quot;SpeedLimiter&quot;:&quot;&quot;,&quot;ExcludeSystemPath&quot;:true,&quot;Exclude&quot;:[&quot;/bin/&quot;,&quot;/usr/bin/&quot;,&quot;/sbin/&quot;,&quot;/boot/&quot;,&quot;/proc/&quot;,&quot;/sys/&quot;,&quot;/srv/&quot;,&quot;/lib/&quot;,&quot;/selinux/&quot;,&quot;/usr/sbin/&quot;,&quot;/run/&quot;,&quot;/lib32/&quot;,&quot;/lib64/&quot;,&quot;/lost+found/&quot;,&quot;/var/lib/kubelet/&quot;,&quot;/var/lib/ntp/proc&quot;,&quot;/var/lib/container&quot;,&quot;Windows&quot;,&quot;Python27&quot;,&quot;Program Files (x86)&quot;,&quot;Program Files&quot;,&quot;Boot&quot;,&quot;$RECYCLE.BIN&quot;,&quot;System Volume Information&quot;,&quot;Users\Administrator\NTUSER.DAT*&quot;,&quot;ProgramData&quot;,&quot;pagefile.sys&quot;,&quot;Users\Default\NTUSER.DAT*&quot;,&quot;Users\Administrator\ntuser.*&quot;],&quot;UseVss&quot;:true}&quot;</p>
     */
    @NameInMap("Policy")
    public String policyShrink;

    /**
     * <p>The region ID of the server that is not deployed on Alibaba Cloud.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSupportRegion~~">DescribeSupportRegion</a> operation to query the regions supported by the anti-ransomware feature, and then select a supported region that is closest to the region where your non-Alibaba Cloud server is deployed.</p>
     * </blockquote>
     * <p>This parameter is required when the ServerType parameter is set to OUT_CLOUD.</p>
     * 
     * <strong>example:</strong>
     * <p>ch-hangzhou</p>
     */
    @NameInMap("PolicyRegionId")
    public String policyRegionId;

    /**
     * <p>The version of the anti-ransomware policy. Set the value to <strong>2.0.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The asset selection method. Valid values:</p>
     * <ul>
     * <li><strong>ALL_MACHINE</strong>: all assets<blockquote>
     * <p>If you want to protect all assets of the specified server type, set this parameter to <strong>ALL_MACHINE</strong>. In this case, the <strong>UuidList</strong> parameter does not take effect. You can create only one policy that covers all assets of the same server type.</p>
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
     * <p>Specifies the UUIDs of the servers to protect.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;, &quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;]</p>
     */
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

    public CreateBackupPolicyShrinkRequest setSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }
    public String getSelectType() {
        return this.selectType;
    }

    public CreateBackupPolicyShrinkRequest setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

    public CreateBackupPolicyShrinkRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
