// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateApiKeyInput extends TeaModel {
    /**
     * <p>The name of the API key. The name can be up to 128 characters in length and can contain only letters, digits, spaces, hyphens (-), underscores (_), and half-width periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>ci-pipeline-key</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The expiration time of the API key. The time must be in UTC and follow the RFC 3339 format. If this parameter is left empty, the API key never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2099-12-31T23:59:59Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>The IP address blacklist. After you configure this parameter, the IP addresses in the list cannot use the API key. This parameter is mutually exclusive with ipWhitelist.</p>
     */
    @NameInMap("ipBlacklist")
    public java.util.List<IPConfig> ipBlacklist;

    /**
     * <p>The IP address whitelist. After you configure this parameter, only the IP addresses in the list can use the API key. This parameter is mutually exclusive with ipBlacklist.</p>
     */
    @NameInMap("ipWhitelist")
    public java.util.List<IPConfig> ipWhitelist;

    /**
     * <p>The ID of the team to which the API key belongs. The ID must be in the UUID format. If this parameter is not specified, the default team of the current account is used.</p>
     * 
     * <strong>example:</strong>
     * <p>5f4a2c18-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The list of source VPC IDs that are allowed to use this API key to initiate management and control requests. The list is matched as a set. If this parameter is omitted, set to null, or set to an empty array, no restrictions are imposed on the source VPCs. If this parameter is not empty, only requests from trusted source VPCs that match the list are allowed. Requests from the Internet or from unverified source VPCs are rejected. This parameter can be configured together with the IP address whitelist or blacklist. Requests must meet both restrictions. This field is independent of the vpcBindings field of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vpc-examplea&quot;,&quot;vpc-exampleb&quot;]</p>
     */
    @NameInMap("vpcBindings")
    public java.util.List<String> vpcBindings;

    public static CreateApiKeyInput build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyInput self = new CreateApiKeyInput();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyInput setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public CreateApiKeyInput setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateApiKeyInput setIpBlacklist(java.util.List<IPConfig> ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public java.util.List<IPConfig> getIpBlacklist() {
        return this.ipBlacklist;
    }

    public CreateApiKeyInput setIpWhitelist(java.util.List<IPConfig> ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public java.util.List<IPConfig> getIpWhitelist() {
        return this.ipWhitelist;
    }

    public CreateApiKeyInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public CreateApiKeyInput setVpcBindings(java.util.List<String> vpcBindings) {
        this.vpcBindings = vpcBindings;
        return this;
    }
    public java.util.List<String> getVpcBindings() {
        return this.vpcBindings;
    }

}
