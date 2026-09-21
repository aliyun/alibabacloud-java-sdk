// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateApiKeyInput extends TeaModel {
    /**
     * <p>The name of the API key. The name can be up to 128 characters in length and can contain letters, digits, spaces, hyphens (-), underscores (_), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>ci-pipeline-key</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The expiration time of the API key. The time is in UTC and in the RFC 3339 format. If you leave this parameter empty, the API key never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2099-12-31T23:59:59Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>The IP blacklist. After you configure this parameter, IP addresses in the list cannot use the API key. This parameter is mutually exclusive with ipWhitelist.</p>
     */
    @NameInMap("ipBlacklist")
    public java.util.List<IPConfig> ipBlacklist;

    /**
     * <p>The IP address whitelist. After you configure this parameter, only IP addresses in the list can use the API key. This parameter is mutually exclusive with ipBlacklist.</p>
     */
    @NameInMap("ipWhitelist")
    public java.util.List<IPConfig> ipWhitelist;

    /**
     * <p>The ID of the team to which the API key belongs. The value is in UUID format. If you do not specify this parameter, the default team of the current account is used.</p>
     * 
     * <strong>example:</strong>
     * <p>5f4a2c18-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

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

}
