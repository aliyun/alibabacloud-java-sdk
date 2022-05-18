// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetJobRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public GetJobRequestUserProfile userProfile;

    @NameInMap("Version")
    public String version;

    public static GetJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobRequest self = new GetJobRequest();
        return TeaModel.build(map, self);
    }

    public GetJobRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetJobRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public GetJobRequest setUserProfile(GetJobRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public GetJobRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public GetJobRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class GetJobRequestUserProfile extends TeaModel {
        @NameInMap("TenantId")
        public Long tenantId;

        public static GetJobRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            GetJobRequestUserProfile self = new GetJobRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public GetJobRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
