// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class App extends TeaModel {
    @NameInMap("app_id")
    public String appId;

    @NameInMap("app_name")
    public String appName;

    @NameInMap("app_secret")
    public String appSecret;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("logo")
    public String logo;

    @NameInMap("provider")
    public String provider;

    @NameInMap("redirect_uri")
    public String redirectUri;

    @NameInMap("scope")
    public java.util.List<String> scope;

    @NameInMap("stage")
    public String stage;

    @NameInMap("type")
    public String type;

    @NameInMap("updated_at")
    public String updatedAt;

    public static App build(java.util.Map<String, ?> map) throws Exception {
        App self = new App();
        return TeaModel.build(map, self);
    }

    public App setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public App setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public App setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public App setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public App setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public App setLogo(String logo) {
        this.logo = logo;
        return this;
    }
    public String getLogo() {
        return this.logo;
    }

    public App setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public App setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public App setScope(java.util.List<String> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<String> getScope() {
        return this.scope;
    }

    public App setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public App setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public App setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
