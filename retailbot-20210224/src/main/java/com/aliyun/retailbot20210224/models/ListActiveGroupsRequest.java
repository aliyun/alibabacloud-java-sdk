// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListActiveGroupsRequest extends TeaModel {
    // 应用code
    @NameInMap("AppCode")
    public String appCode;

    // 人群圈选配置所属的版本，如果不指定则系统自动选择默认版本
    @NameInMap("AppVersion")
    public String appVersion;

    // 实例Id
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageParam")
    public ListActiveGroupsRequestPageParam pageParam;

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

    public ListActiveGroupsRequest setPageParam(ListActiveGroupsRequestPageParam pageParam) {
        this.pageParam = pageParam;
        return this;
    }
    public ListActiveGroupsRequestPageParam getPageParam() {
        return this.pageParam;
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

    public static class ListActiveGroupsRequestPageParam extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListActiveGroupsRequestPageParam build(java.util.Map<String, ?> map) throws Exception {
            ListActiveGroupsRequestPageParam self = new ListActiveGroupsRequestPageParam();
            return TeaModel.build(map, self);
        }

        public ListActiveGroupsRequestPageParam setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListActiveGroupsRequestPageParam setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListActiveGroupsRequestUserProfile extends TeaModel {
        // 租户ID
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
