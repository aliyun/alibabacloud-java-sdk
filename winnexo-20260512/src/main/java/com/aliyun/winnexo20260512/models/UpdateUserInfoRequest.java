// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateUserInfoRequest extends TeaModel {
    /**
     * <p>The profile picture URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/avatar.png">https://example.com/avatar.png</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The language preference: zh-CN, en-US.</p>
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
     * <p>The user role description (used when profileRole is set to Others). Maximum length: 100 characters.</p>
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
     * <p>The effective tenant ID.</p>
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
