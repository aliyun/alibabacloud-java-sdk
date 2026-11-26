// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateUserInfoRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The profile picture URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/avatar.png">https://example.com/avatar.png</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The language preference: zh-CN or en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("languagePreference")
    public String languagePreference;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The user service description. Maximum length: 1000 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("offering")
    public String offering;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The user role description. This parameter is used when profileRole is set to Others. Maximum length: 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("profileRoleInfo")
    public String profileRoleInfo;

    /**
     * <p>The user self-introduction. Maximum length: 1000 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("selfIntroduction")
    public String selfIntroduction;

    /**
     * <p>The ID of the effective tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserInfoRequest self = new UpdateUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserInfoRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public UpdateUserInfoRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public UpdateUserInfoRequest setLanguagePreference(String languagePreference) {
        this.languagePreference = languagePreference;
        return this;
    }
    public String getLanguagePreference() {
        return this.languagePreference;
    }

    public UpdateUserInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateUserInfoRequest setOffering(String offering) {
        this.offering = offering;
        return this;
    }
    public String getOffering() {
        return this.offering;
    }

    public UpdateUserInfoRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public UpdateUserInfoRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public UpdateUserInfoRequest setProfileRoleInfo(String profileRoleInfo) {
        this.profileRoleInfo = profileRoleInfo;
        return this;
    }
    public String getProfileRoleInfo() {
        return this.profileRoleInfo;
    }

    public UpdateUserInfoRequest setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
        return this;
    }
    public String getSelfIntroduction() {
        return this.selfIntroduction;
    }

    public UpdateUserInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
