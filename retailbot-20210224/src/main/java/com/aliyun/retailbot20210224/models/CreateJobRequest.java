// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    @NameInMap("ActiveJobDTO")
    public CreateJobRequestActiveJobDTO activeJobDTO;

    @NameInMap("UserProfile")
    public CreateJobRequestUserProfile userProfile;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setActiveJobDTO(CreateJobRequestActiveJobDTO activeJobDTO) {
        this.activeJobDTO = activeJobDTO;
        return this;
    }
    public CreateJobRequestActiveJobDTO getActiveJobDTO() {
        return this.activeJobDTO;
    }

    public CreateJobRequest setUserProfile(CreateJobRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public CreateJobRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public static class CreateJobRequestActiveJobDTO extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("Config")
        public String config;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("StartTime")
        public Long startTime;

        public static CreateJobRequestActiveJobDTO build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestActiveJobDTO self = new CreateJobRequestActiveJobDTO();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestActiveJobDTO setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public CreateJobRequestActiveJobDTO setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public CreateJobRequestActiveJobDTO setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public CreateJobRequestActiveJobDTO setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateJobRequestActiveJobDTO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateJobRequestActiveJobDTO setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public CreateJobRequestActiveJobDTO setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public CreateJobRequestActiveJobDTO setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateJobRequestUserProfile extends TeaModel {
        @NameInMap("TenantId")
        public Long tenantId;

        public static CreateJobRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestUserProfile self = new CreateJobRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
