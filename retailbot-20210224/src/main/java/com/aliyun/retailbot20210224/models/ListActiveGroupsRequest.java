// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListActiveGroupsRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("AppVersion")
    public String appVersion;

    // 查询过滤参数，多个过滤参数之间是且的关系。例如:过滤实例名称为i-a123、i-b123，且实例状态为Stopped：&Filter.1.Name=InstanceName&Filter.1.Value.1=i-a123&Filter.1.Value.2=i-b123&Filter.2.Name=Status&Filter.2.Value=Stopped。
    @NameInMap("InstanceId")
    public String instanceId;

    // A short description of struct
    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public ListActiveGroupsRequestUserProfile userProfile;

    public static ListActiveGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActiveGroupsRequest self = new ListActiveGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListActiveGroupsRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ListActiveGroupsRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ListActiveGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListActiveGroupsRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ListActiveGroupsRequest setUserProfile(ListActiveGroupsRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public ListActiveGroupsRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public static class ListActiveGroupsRequestUserProfile extends TeaModel {
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListActiveGroupsRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            ListActiveGroupsRequestUserProfile self = new ListActiveGroupsRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public ListActiveGroupsRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
