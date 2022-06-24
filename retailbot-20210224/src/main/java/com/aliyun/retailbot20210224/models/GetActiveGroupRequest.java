// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetActiveGroupRequest extends TeaModel {
    // 应用Code
    @NameInMap("AppCode")
    public String appCode;

    // 人群圈选配置所属的版本，如果不指定则系统自动选择默认版本
    @NameInMap("AppVersion")
    public String appVersion;

    // 人群ID
    @NameInMap("GroupId")
    public Long groupId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 店铺ID
    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public GetActiveGroupRequestUserProfile userProfile;

    public static GetActiveGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetActiveGroupRequest self = new GetActiveGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetActiveGroupRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetActiveGroupRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetActiveGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public GetActiveGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetActiveGroupRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public GetActiveGroupRequest setUserProfile(GetActiveGroupRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public GetActiveGroupRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public static class GetActiveGroupRequestUserProfile extends TeaModel {
        // 租户ID
        @NameInMap("TenantId")
        public Long tenantId;

        public static GetActiveGroupRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            GetActiveGroupRequestUserProfile self = new GetActiveGroupRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public GetActiveGroupRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
