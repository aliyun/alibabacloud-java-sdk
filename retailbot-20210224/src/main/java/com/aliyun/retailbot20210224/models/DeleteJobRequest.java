// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteJobRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public DeleteJobRequestUserProfile userProfile;

    public static DeleteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobRequest self = new DeleteJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DeleteJobRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public DeleteJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DeleteJobRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public DeleteJobRequest setUserProfile(DeleteJobRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public DeleteJobRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public static class DeleteJobRequestUserProfile extends TeaModel {
        @NameInMap("TenantId")
        public Long tenantId;

        public static DeleteJobRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            DeleteJobRequestUserProfile self = new DeleteJobRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public DeleteJobRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
