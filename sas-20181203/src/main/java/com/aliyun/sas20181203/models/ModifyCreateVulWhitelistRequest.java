// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCreateVulWhitelistRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The reason for adding the vulnerability to the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>This vulnerability is not harmful</p>
     */
    @NameInMap("Reason")
    public String reason;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The scope in which the whitelist takes effect. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><strong>type</strong>: The scope type. Valid values:<ul>
     * <li><strong>GroupId</strong>: server group</li>
     * <li><strong>Uuid</strong>: host asset</li>
     * </ul>
     * </li>
     * <li><strong>uuids</strong>: The collection of host asset UUIDs. The field type is String.</li>
     * <li><strong>groupIds</strong>: The collection of server group IDs. The field type is Long.<blockquote>
     * <p>If this parameter is left empty, the whitelist takes effect on all hosts. If <strong>type</strong> is set to <strong>GroupId</strong>, <strong>groupIds</strong> cannot be empty. If <strong>type</strong> is set to <strong>Uuid</strong>, <strong>uuids</strong> cannot be empty.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;Uuid&quot;,&quot;uuids&quot;:[&quot;b31a708f-5fea-426e-bebe-a7b0893****&quot;,&quot;1f749687-3b5d-4e11-8140-d964673****&quot;],&quot;groupIds&quot;:[]}</p>
     */
    @NameInMap("TargetInfo")
    public String targetInfo;

    /**
     * <p>The information about the vulnerability to add to the whitelist. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><p><strong>Status</strong>: The vulnerability status.</p>
     * </li>
     * <li><p><strong>GmtLast</strong>: The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
     * </li>
     * <li><p><strong>LaterCount</strong>: The number of medium-priority vulnerabilities.</p>
     * </li>
     * <li><p><strong>AsapCount</strong>: The number of high-priority vulnerabilities.</p>
     * </li>
     * <li><p><strong>Name</strong>: The vulnerability name.</p>
     * </li>
     * <li><p><strong>Type</strong>: The vulnerability type. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>app</strong>: application vulnerability</li>
     * <li><strong>emg</strong>: emergency vulnerability</li>
     * </ul>
     * </li>
     * <li><p><strong>Related</strong>: The CVE ID of the vulnerability.</p>
     * </li>
     * <li><p><strong>HandledCount</strong>: The number of handled vulnerabilities.</p>
     * </li>
     * <li><p><strong>AliasName</strong>: The alias of the vulnerability.</p>
     * </li>
     * <li><p><strong>RuleModifyTime</strong>: The time when the vulnerability was last published.</p>
     * </li>
     * <li><p><strong>NntfCount</strong>: The number of low-priority vulnerabilities.</p>
     * </li>
     * <li><p><strong>TotalFixCount</strong>: The total number of fixed vulnerabilities.</p>
     * </li>
     * <li><p><strong>Tags</strong>: The vulnerability tags.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedVul~~">DescribeGroupedVul</a> operation to obtain the vulnerability information to add to the whitelist.</p>
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

    public ModifyCreateVulWhitelistRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyCreateVulWhitelistRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyCreateVulWhitelistRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
