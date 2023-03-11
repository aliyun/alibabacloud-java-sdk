// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulWhitelistTargetRequest extends TeaModel {
    /**
     * <p>The ID of the whitelist.</p>
     * <br>
     * <p>>  You can call the [DescribeVulWhitelist](~~DescribeVulWhitelist~~) operation to query the IDs of whitelists.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The reason why you add the server to the whitelist.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The applicable scope of the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **type**: the type of the applicable scope. Valid values:</p>
     * <br>
     * <p>    *   **GroupId**: the ID of a server group</p>
     * <p>    *   **Uuid**: the UUID of a server</p>
     * <br>
     * <p>*   **uuids**: the UUIDs of servers</p>
     * <br>
     * <p>*   **groupIds**: the IDs of server groups</p>
     * <br>
     * <p>>  If you leave this parameter empty, all servers are added to the whitelist. If you set the **type** field to **GroupId**, you must also specify the **groupIds** field. If you set the **type** field to **Uuid**, you must also specify the **uuids** field.</p>
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
