// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulWhitelistTargetRequest extends TeaModel {
    /**
     * <p>The ID of the whitelist.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeVulWhitelist~~">DescribeVulWhitelist</a> operation to query the IDs of whitelists.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2533681</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The reason why you add the server to the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>1221</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>42.120.75.150</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The applicable scope of the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>type</strong>: the type of the applicable scope. Valid values:</p>
     * <ul>
     * <li><strong>GroupId</strong>: the ID of a server group</li>
     * <li><strong>Uuid</strong>: the UUID of a server</li>
     * </ul>
     * </li>
     * <li><p><strong>uuids</strong>: the UUIDs of servers</p>
     * </li>
     * <li><p><strong>groupIds</strong>: the IDs of server groups</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> If you leave this parameter empty, all servers are added to the whitelist. If you set the <strong>type</strong> field to <strong>GroupId</strong>, you must also specify the <strong>groupIds</strong> field. If you set the <strong>type</strong> field to <strong>Uuid</strong>, you must also specify the <strong>uuids</strong> field.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;type&quot;: &quot;GroupId&quot;,
     *       &quot;uuids&quot;: [],
     *       &quot;groupIds&quot;: [
     *             10782678
     *       ]
     * }</p>
     */
    @NameInMap("TargetInfo")
    public String targetInfo;

    public static ModifyVulWhitelistTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulWhitelistTargetRequest self = new ModifyVulWhitelistTargetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVulWhitelistTargetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyVulWhitelistTargetRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyVulWhitelistTargetRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyVulWhitelistTargetRequest setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

}
