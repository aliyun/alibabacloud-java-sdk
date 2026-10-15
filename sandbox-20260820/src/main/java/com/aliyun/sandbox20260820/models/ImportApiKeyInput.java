// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ImportApiKeyInput extends TeaModel {
    /**
     * <p>The API key name. The name can be up to 128 characters in length and can contain letters, digits, spaces, hyphens (-), underscores (_), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>migrated-key</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The plaintext value of the API key to import. After the import, the source of the key is set to custom.</p>
     * 
     * <strong>example:</strong>
     * <p>e2b_****</p>
     */
    @NameInMap("apiKeyValue")
    public String apiKeyValue;

    /**
     * <p>The expiration time of the API key in UTC. The time is in RFC 3339 format. If this parameter is left empty, the API key never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2099-12-31T23:59:59Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>The ID of the team to which the API key belongs, in UUID format. If this parameter is not specified, the default team of the current account is used.</p>
     * 
     * <strong>example:</strong>
     * <p>5f4a2c18-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static ImportApiKeyInput build(java.util.Map<String, ?> map) throws Exception {
        ImportApiKeyInput self = new ImportApiKeyInput();
        return TeaModel.build(map, self);
    }

    public ImportApiKeyInput setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public ImportApiKeyInput setApiKeyValue(String apiKeyValue) {
        this.apiKeyValue = apiKeyValue;
        return this;
    }
    public String getApiKeyValue() {
        return this.apiKeyValue;
    }

    public ImportApiKeyInput setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ImportApiKeyInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
