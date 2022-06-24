// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageParam")
    public ListJobsRequestPageParam pageParam;

    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("Status")
    public java.util.List<Integer> status;

    @NameInMap("UserProfile")
    public ListJobsRequestUserProfile userProfile;

    public static ListJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsRequest self = new ListJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ListJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListJobsRequest setPageParam(ListJobsRequestPageParam pageParam) {
        this.pageParam = pageParam;
        return this;
    }
    public ListJobsRequestPageParam getPageParam() {
        return this.pageParam;
    }

    public ListJobsRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ListJobsRequest setStatus(java.util.List<Integer> status) {
        this.status = status;
        return this;
    }
    public java.util.List<Integer> getStatus() {
        return this.status;
    }

    public ListJobsRequest setUserProfile(ListJobsRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public ListJobsRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public static class ListJobsRequestPageParam extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListJobsRequestPageParam build(java.util.Map<String, ?> map) throws Exception {
            ListJobsRequestPageParam self = new ListJobsRequestPageParam();
            return TeaModel.build(map, self);
        }

        public ListJobsRequestPageParam setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListJobsRequestPageParam setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListJobsRequestUserProfile extends TeaModel {
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListJobsRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            ListJobsRequestUserProfile self = new ListJobsRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public ListJobsRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
