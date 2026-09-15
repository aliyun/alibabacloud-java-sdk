// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateApiKeyInput extends TeaModel {
    @NameInMap("apiKeyName")
    public String apiKeyName;

    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("ipBlacklist")
    public java.util.List<IPConfig> ipBlacklist;

    @NameInMap("ipWhitelist")
    public java.util.List<IPConfig> ipWhitelist;

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
