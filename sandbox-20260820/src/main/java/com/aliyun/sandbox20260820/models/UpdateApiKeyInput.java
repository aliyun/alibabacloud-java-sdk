// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateApiKeyInput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ci-pipeline-key-v2</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

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
