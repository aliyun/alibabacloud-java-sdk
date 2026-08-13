// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateUserInfoRequest extends TeaModel {
    /**
     * <p>用户头像 URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/avatar.png">https://example.com/avatar.png</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>语言偏好: zh-CN, en-US</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("languagePreference")
    public String languagePreference;

    /**
     * <p>文件名</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>用户服务描述，最多1000字符</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("offering")
    public String offering;

    /**
     * <p>用户角色描述（当profileRole为Others时使用），最多100字符</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("profileRoleInfo")
    public String profileRoleInfo;

    /**
     * <p>用户自我介绍，最多1000字符</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("selfIntroduction")
    public String selfIntroduction;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
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
