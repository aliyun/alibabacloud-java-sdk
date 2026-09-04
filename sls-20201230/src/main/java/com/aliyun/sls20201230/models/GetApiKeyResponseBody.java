// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetApiKeyResponseBody extends TeaModel {
    @NameInMap("allowedStores")
    public java.util.List<String> allowedStores;

    @NameInMap("apiKey")
    public String apiKey;

    @NameInMap("apiKeyName")
    public String apiKeyName;

    @NameInMap("createTime")
    public Integer createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("status")
    public String status;

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
