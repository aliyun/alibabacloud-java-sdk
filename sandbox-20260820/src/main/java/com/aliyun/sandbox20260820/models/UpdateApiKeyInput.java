// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateApiKeyInput extends TeaModel {
    /**
     * <p>The new name of the API key. The name can be up to 128 characters in length and can contain letters, digits, spaces, hyphens (-), underscores (_), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>ci-pipeline-key-v2</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The expiration time of the API key, in UTC, in RFC 3339 format. Leave this parameter empty to indicate that the API key never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2099-12-31T23:59:59Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>The IP blacklist. If specified, the existing blacklist is entirely overwritten. This parameter is mutually exclusive with ipWhitelist.</p>
     */
    @NameInMap("ipBlacklist")
    public java.util.List<IPConfig> ipBlacklist;

    /**
     * <p>The IP whitelist. If specified, the existing whitelist is entirely overwritten. This parameter is mutually exclusive with ipBlacklist.</p>
     */
    @NameInMap("ipWhitelist")
    public java.util.List<IPConfig> ipWhitelist;

    /**
     * <p>The new status of the API key. Valid values:</p>
     * <ul>
     * <li>active: Enabled.</li>
     * <li>inactive: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inactive</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateApiKeyInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyInput self = new UpdateApiKeyInput();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyInput setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public UpdateApiKeyInput setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public UpdateApiKeyInput setIpBlacklist(java.util.List<IPConfig> ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public java.util.List<IPConfig> getIpBlacklist() {
        return this.ipBlacklist;
    }

    public UpdateApiKeyInput setIpWhitelist(java.util.List<IPConfig> ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public java.util.List<IPConfig> getIpWhitelist() {
        return this.ipWhitelist;
    }

    public UpdateApiKeyInput setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
