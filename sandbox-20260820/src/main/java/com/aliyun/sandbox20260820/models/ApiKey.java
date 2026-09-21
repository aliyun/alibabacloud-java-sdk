// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ApiKey extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a1f8c3d6-****</p>
     */
    @NameInMap("apiKeyID")
    public String apiKeyID;

    /**
     * <strong>example:</strong>
     * <p>e2b_3f9a****b915</p>
     */
    @NameInMap("apiKeyMask")
    public String apiKeyMask;

    /**
     * <strong>example:</strong>
     * <p>ci-pipeline-key</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <strong>example:</strong>
     * <p>e2b_****</p>
     */
    @NameInMap("apiKeyValue")
    public String apiKeyValue;

    /**
     * <strong>example:</strong>
     * <p>2026-08-20T08:30:00Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>2099-12-31T23:59:59Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("ipBlacklist")
    public java.util.List<IPConfig> ipBlacklist;

    @NameInMap("ipWhitelist")
    public java.util.List<IPConfig> ipWhitelist;

    /**
     * <strong>example:</strong>
     * <p>2026-09-10T14:22:07Z</p>
     */
    @NameInMap("lastUsedTime")
    public String lastUsedTime;

    /**
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <strong>example:</strong>
     * <p>generated</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>5f4a2c18-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <strong>example:</strong>
     * <p>sandbox-dev</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <strong>example:</strong>
     * <p>std</p>
     */
    @NameInMap("teamPlan")
    public String teamPlan;

    /**
     * <strong>example:</strong>
     * <p>9c1d4e72-****</p>
     */
    @NameInMap("userID")
    public String userID;

    /**
     * <strong>example:</strong>
     * <p>sandbox-admin</p>
     */
    @NameInMap("username")
    public String username;

    public static ApiKey build(java.util.Map<String, ?> map) throws Exception {
        ApiKey self = new ApiKey();
        return TeaModel.build(map, self);
    }

    public ApiKey setApiKeyID(String apiKeyID) {
        this.apiKeyID = apiKeyID;
        return this;
    }
    public String getApiKeyID() {
        return this.apiKeyID;
    }

    public ApiKey setApiKeyMask(String apiKeyMask) {
        this.apiKeyMask = apiKeyMask;
        return this;
    }
    public String getApiKeyMask() {
        return this.apiKeyMask;
    }

    public ApiKey setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public ApiKey setApiKeyValue(String apiKeyValue) {
        this.apiKeyValue = apiKeyValue;
        return this;
    }
    public String getApiKeyValue() {
        return this.apiKeyValue;
    }

    public ApiKey setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ApiKey setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ApiKey setIpBlacklist(java.util.List<IPConfig> ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public java.util.List<IPConfig> getIpBlacklist() {
        return this.ipBlacklist;
    }

    public ApiKey setIpWhitelist(java.util.List<IPConfig> ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public java.util.List<IPConfig> getIpWhitelist() {
        return this.ipWhitelist;
    }

    public ApiKey setLastUsedTime(String lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
        return this;
    }
    public String getLastUsedTime() {
        return this.lastUsedTime;
    }

    public ApiKey setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public ApiKey setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ApiKey setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApiKey setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public ApiKey setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public ApiKey setTeamPlan(String teamPlan) {
        this.teamPlan = teamPlan;
        return this;
    }
    public String getTeamPlan() {
        return this.teamPlan;
    }

    public ApiKey setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

    public ApiKey setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
