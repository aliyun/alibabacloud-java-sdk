// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ShopId")
    public String shopId;

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

    public ListJobsRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ListJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListJobsRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ListJobsRequest setUserProfile(ListJobsRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public ListJobsRequestUserProfile getUserProfile() {
        return this.userProfile;
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
