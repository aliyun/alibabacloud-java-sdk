// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListActiveGroupsRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageParam")
    public ListActiveGroupsRequestPageParam pageParam;

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
