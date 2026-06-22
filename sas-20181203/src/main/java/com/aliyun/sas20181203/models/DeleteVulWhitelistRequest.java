// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the vulnerability whitelist.</p>
     * <blockquote>
     * <p>To delete a vulnerability whitelist, provide the vulnerability whitelist ID. You can obtain this ID by calling the <a href="~~DescribeVulWhitelist~~">DescribeVulWhitelist</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>131231</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The vulnerability whitelist information to delete. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><p><strong>Name</strong>: The name of the vulnerability.</p>
     * </li>
     * <li><p><strong>Type</strong>: The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>app</strong>: application vulnerability</li>
     * <li><strong>emg</strong>: emergency vulnerability</li>
     * </ul>
     * </li>
     * <li><p><strong>AliasName</strong>: The alias of the vulnerability.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;Name&quot;: &quot;oval:com.redhat.rhsa:def:20173263&quot;,
     *             &quot;Type&quot;: &quot;cve&quot;,
     *             &quot;AliasName&quot;: &quot;RHSA-2017:3263: curl security update&quot;
     *       }
     * ]</p>
     */
    @NameInMap("Whitelist")
    public String whitelist;

    public static DeleteVulWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulWhitelistRequest self = new DeleteVulWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVulWhitelistRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteVulWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
