// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCreateVulWhitelistRequest extends TeaModel {
    /**
     * <p>The reason why you add the vulnerability to the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>This vulnerability is not harmful</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The applicable scope of the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>type</strong>: the type of the applicable scope. Valid values:</p>
     * <ul>
     * <li><strong>GroupId</strong>: the ID of a server group.</li>
     * <li><strong>Uuid</strong>: the UUID of a server.</li>
     * </ul>
     * </li>
     * <li><p><strong>uuids</strong>: the UUIDs of servers. This field is of the string type.</p>
     * </li>
     * <li><p><strong>groupIds</strong>: the IDs of server groups. This field is of the long type.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> If you leave this parameter empty, the applicable scope is all servers. If you set the <strong>type</strong> field to <strong>GroupId</strong>, you must also specify the <strong>groupIds</strong> field. If you set the <strong>type</strong> field to <strong>Uuid</strong>, you must also specify the <strong>uuids</strong> field.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;Uuid&quot;,&quot;uuids&quot;:[&quot;b31a708f-5fea-426e-bebe-a7b0893****&quot;,&quot;1f749687-3b5d-4e11-8140-d964673****&quot;],&quot;groupIds&quot;:[]}</p>
     */
    @NameInMap("TargetInfo")
    public String targetInfo;

    /**
     * <p>The information about the vulnerability that you want to add to the whitelist. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><p><strong>Status</strong>: the status of the vulnerability.</p>
     * </li>
     * <li><p><strong>GmtLast</strong>: the timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
     * </li>
     * <li><p><strong>LaterCount</strong>: the number of vulnerabilities that have the medium priority.</p>
     * </li>
     * <li><p><strong>AsapCount</strong>: the number of vulnerabilities that have the high priority.</p>
     * </li>
     * <li><p><strong>Name</strong>: the name of the vulnerability.</p>
     * </li>
     * <li><p><strong>Type</strong>: the type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>app</strong>: application vulnerability</li>
     * <li><strong>emg</strong>: urgent vulnerability</li>
     * </ul>
     * </li>
     * <li><p><strong>Related</strong>: the Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.</p>
     * </li>
     * <li><p><strong>HandledCount</strong>: the number of handled vulnerabilities.</p>
     * </li>
     * <li><p><strong>AliasName</strong>: the alias of the vulnerability.</p>
     * </li>
     * <li><p><strong>RuleModifyTime</strong>: the time when the vulnerability was last disclosed.</p>
     * </li>
     * <li><p><strong>NntfCount</strong>: the number of vulnerabilities that have the low priority.</p>
     * </li>
     * <li><p><strong>TotalFixCount</strong>: the total number of fixed vulnerabilities.</p>
     * </li>
     * <li><p><strong>Tags</strong>: the tag that is added to the vulnerability.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedVul~~">DescribeGroupedVul</a> operation to query the information about the vulnerability that you want to add to the whitelist.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Status&quot;:0,&quot;GmtLast&quot;:1662281929000,&quot;LaterCount&quot;:0,&quot;AsapCount&quot;:1,&quot;Name&quot;:&quot;oval:com.redhat.rhsa:def:20172836&quot;,&quot;Type&quot;:&quot;cve&quot;,&quot;Related&quot;:&quot;CVE-2017-14491,CVE-2017-14492,CVE-2017-14493,CVE-2017-14494,CVE-2017-14495,CVE-2017-14496&quot;,&quot;HandledCount&quot;:1,&quot;AliasName&quot;:&quot;RHSA-2017:2836-Critical: dnsmasq security update&quot;,&quot;RuleModifyTime&quot;:1535542395000,&quot;NntfCount&quot;:0,&quot;TotalFixCount&quot;:196668,&quot;Tags&quot;:&quot;Exploit Exists,Code Execution&quot;},{&quot;Status&quot;:0,&quot;GmtLast&quot;:1662281933000,&quot;LaterCount&quot;:0,&quot;AsapCount&quot;:1,&quot;Name&quot;:&quot;oval:com.redhat.rhsa:def:20173075&quot;,&quot;Type&quot;:&quot;cve&quot;,&quot;Related&quot;:&quot;CVE-2017-13089,CVE-2017-13090&quot;,&quot;HandledCount&quot;:1,&quot;AliasName&quot;:&quot;RHSA-2017:3075-Important: wget security update&quot;,&quot;RuleModifyTime&quot;:1551432867000,&quot;NntfCount&quot;:0,&quot;TotalFixCount&quot;:369136,&quot;Tags&quot;:&quot;Code Execution&quot;}]</p>
     */
    @NameInMap("Whitelist")
    public String whitelist;

    public static ModifyCreateVulWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCreateVulWhitelistRequest self = new ModifyCreateVulWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCreateVulWhitelistRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyCreateVulWhitelistRequest setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public ModifyCreateVulWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
