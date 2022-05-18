// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetActiveGroupRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("GroupId")
    public Long groupId;

    // A short description of struct
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public GetActiveGroupRequestUserProfile userProfile;

    @NameInMap("Version")
    public String version;

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

    public GetActiveGroupRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class GetActiveGroupRequestUserProfile extends TeaModel {
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
