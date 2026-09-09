// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetApiKeyResponseBody extends TeaModel {
    /**
     * <p>The list of Logstores that allow writes.</p>
     */
    @NameInMap("allowedStores")
    public java.util.List<String> allowedStores;

    /**
     * <p>The API key in plaintext.</p>
     * 
     * <strong>example:</strong>
     * <apiKey-plaintext>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>The API key name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-apikey-001</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1788420000</p>
     */
    @NameInMap("createTime")
    public Integer createTime;

    /**
     * <p>The description of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The status of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled / Disabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1788420000</p>
     */
    @NameInMap("updateTime")
    public Integer updateTime;

    public static GetApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiKeyResponseBody self = new GetApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiKeyResponseBody setAllowedStores(java.util.List<String> allowedStores) {
        this.allowedStores = allowedStores;
        return this;
    }
    public java.util.List<String> getAllowedStores() {
        return this.allowedStores;
    }

    public GetApiKeyResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public GetApiKeyResponseBody setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public GetApiKeyResponseBody setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public GetApiKeyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetApiKeyResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetApiKeyResponseBody setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Integer getUpdateTime() {
        return this.updateTime;
    }

}
