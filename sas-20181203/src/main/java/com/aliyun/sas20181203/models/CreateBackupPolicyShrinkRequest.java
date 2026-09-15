// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The name of the protection policy to create. Set this parameter to the desired policy name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ServerBackUpPolicy01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <ul>
     * <li><strong>IsDefault</strong>: The type of the protection policy to create. Valid values:<ul>
     * <li><strong>1</strong>: Recommended policy.</li>
     * <li><strong>0</strong>: Custom policy.</li>
     * </ul>
     * </li>
     * <li><strong>Include</strong>: The file types to protect. To protect all file types, set this parameter to [].</li>
     * <li><strong>Source</strong>: The server folders to protect. To protect all folders, set this parameter to [].</li>
     * <li><strong>ExcludeSystemPath</strong>: Specifies whether to exclude specified folders. Set this parameter to <strong>true</strong> to exclude folders. If you do not want to exclude folders, you do not need to set this parameter.</li>
     * <li><strong>Exclude</strong>: The specified protection folder addresses. If you do not want to specify protection folder addresses, set this parameter to [].</li>
     * <li><strong>Schedule</strong>: The time and interval at which the data backup task is scheduled to run. Specify a non-peak hour that is not on the hour. Examples:<ul>
     * <li>Example 1: I|1583216092|P21D indicates that the data backup starts at 2020-03-03 14:14:52 and the backup policy runs at an interval of 3 weeks.</li>
     * <li>Example 2: I|1583216092|PT24H indicates that the data backup starts at 2020-03-03 14:14:52 and the backup policy runs at an interval of 24 hours.</li>
     * </ul>
     * </li>
     * <li><strong>Retention</strong>: The retention period of backup data, in days. The value 7 indicates 1 week, 365 indicates 1 year, and -1 indicates permanent retention.</li>
     * <li><strong>SpeedLimiter</strong>: The network bandwidth throttling for backup. For example, 0:24:30720 indicates that the network bandwidth throttling for backup is 30 MB/s from 00:00 to 24:00.</li>
     * <li><strong>UseVss</strong>: Specifies whether to enable the Volume Shadow Copy Service (VSS) feature for Windows. Valid values:<ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Not enabled.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The VSS (Windows) feature applies only to Windows systems. After this feature is enabled, the issue of individual file backup failures due to process occupation is effectively reduced. We recommend that you enable this feature. After this feature is enabled, file backup for exFAT and FAT32 disk formats is not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;IsDefault&quot;:1,&quot;Include&quot;:[],&quot;Source&quot;:[],&quot;Schedule&quot;:&quot;I|1648061040|PT24H&quot;,&quot;Retention&quot;:7,&quot;SpeedLimiter&quot;:&quot;&quot;,&quot;ExcludeSystemPath&quot;:true,&quot;Exclude&quot;:[&quot;/bin/&quot;,&quot;/usr/bin/&quot;,&quot;/sbin/&quot;,&quot;/boot/&quot;,&quot;/proc/&quot;,&quot;/sys/&quot;,&quot;/srv/&quot;,&quot;/lib/&quot;,&quot;/selinux/&quot;,&quot;/usr/sbin/&quot;,&quot;/run/&quot;,&quot;/lib32/&quot;,&quot;/lib64/&quot;,&quot;/lost+found/&quot;,&quot;/var/lib/kubelet/&quot;,&quot;/var/lib/ntp/proc&quot;,&quot;/var/lib/container&quot;,&quot;Windows&quot;,&quot;Python27&quot;,&quot;Program Files (x86)&quot;,&quot;Program Files&quot;,&quot;Boot&quot;,&quot;$RECYCLE.BIN&quot;,&quot;System Volume Information&quot;,&quot;Users\Administrator\NTUSER.DAT*&quot;,&quot;ProgramData&quot;,&quot;pagefile.sys&quot;,&quot;Users\Default\NTUSER.DAT*&quot;,&quot;Users\Administrator\ntuser.*&quot;],&quot;UseVss&quot;:true}&quot;</p>
     */
    @NameInMap("Policy")
    public String policyShrink;

    /**
     * <p>The region ID of the non-Alibaba Cloud server.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeSupportRegion~~">DescribeSupportRegion</a> operation to query the regions supported by the anti-ransomware feature, and then select the supported region closest to the region where your non-Alibaba Cloud server resides.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ch-hangzhou</p>
     */
    @NameInMap("PolicyRegionId")
    public String policyRegionId;

    /**
     * <p>The version of the protection policy. Set the value to <strong>2.0.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The method used to cover assets. Valid values:</p>
     * <ul>
     * <li><strong>ALL_MACHINE</strong>: All assets.<blockquote>
     * <p>To cover all assets of this type, set this parameter to <strong>ALL_MACHINE</strong>. In this case, <strong>UuidList</strong> is invalid. Only one policy that covers all assets can exist for each server type.</p>
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
     * <li><strong>ALIYUN</strong>: Alibaba Cloud server.</li>
     * <li><strong>OUT_CLOUD</strong>: Non-Alibaba Cloud server.</li>
     * <li><strong>TRIPARTITE</strong>: Simple application server.</li>
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
