// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The name of the anti-ransomware policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ServerBackUpPolicy01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <ul>
     * <li><p><strong>IsDefault</strong>: the type of the anti-ransomware policy. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: recommended policy</li>
     * <li><strong>0</strong>: custom policy</li>
     * </ul>
     * </li>
     * <li><p><strong>Include</strong>: the format of the files that you want to protect. If you want to protect the files in all formats, set this field to [].</p>
     * </li>
     * <li><p><strong>Source</strong>: the directory that you want to protect. If you want to protect all directories, set this field to [].</p>
     * </li>
     * <li><p><strong>ExcludeSystemPath</strong>: specifies whether to exclude a specific directory from the anti-ransomware policy. If you want to exclude a directory, set this field to <strong>true</strong>. If you do not want to exclude a directory, leave this field empty.</p>
     * </li>
     * <li><p><strong>Exclude</strong>: the directory that you want to exclude from the anti-ransomware policy. If you do not want to exclude a directory, set this field to [].</p>
     * </li>
     * <li><p><strong>Schedule</strong>: the start time and interval of a data backup task. We recommend that you specify a start time that begins during off-peak hours but does not start on the hour. Examples:</p>
     * <ul>
     * <li>If you set this field to I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of three weeks.</li>
     * <li>If you set this field to I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of 24 hours.</li>
     * </ul>
     * </li>
     * <li><p><strong>Retention</strong>: the period during which backup data is retained. Unit: days. If you set this field to 7, backup data is retained for a week. If you set this field to 365, backup data is retained for a year. If you set this field to -1, backup data is permanently retained.</p>
     * </li>
     * <li><p><strong>SpeedLimiter</strong>: the limit on the network bandwidth for data backup tasks. If you set this field to 0:24:30720, the maximum bandwidth for a data backup task is 30 MB/s from 00:00 to 24:00.</p>
     * </li>
     * <li><p><strong>UseVss</strong>: specifies whether to enable the VSS feature. The feature is available only for Windows servers. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> The VSS feature is available only if you create the anti-ransomware policy for Windows servers. After you enable the feature, the number of backup failures due to running processes is significantly reduced. We recommend that you enable the VSS feature. After you enable the feature, the data of disks that are in the exFAT and FAT32 formats cannot be backed up.</p>
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
     * <p> We recommend that you specify the ID of the supported region that is the nearest to the location of the server. You can call the <a href="~~DescribeSupportRegion~~">DescribeSupportRegion</a> operation to query the supported regions of the anti-ransomware feature.</p>
     * </blockquote>
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
     * <p>The UUIDs of the servers that you want to protect.</p>
     * <p>This parameter is required.</p>
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

    public CreateBackupPolicyShrinkRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
