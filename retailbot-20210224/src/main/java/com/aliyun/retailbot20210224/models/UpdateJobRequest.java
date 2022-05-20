// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    @NameInMap("ActiveJobDTO")
    public UpdateJobRequestActiveJobDTO activeJobDTO;

    @NameInMap("UserProfile")
    public UpdateJobRequestUserProfile userProfile;

    public static UpdateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRequest self = new UpdateJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRequest setActiveJobDTO(UpdateJobRequestActiveJobDTO activeJobDTO) {
        this.activeJobDTO = activeJobDTO;
        return this;
    }
    public UpdateJobRequestActiveJobDTO getActiveJobDTO() {
        return this.activeJobDTO;
    }

    public UpdateJobRequest setUserProfile(UpdateJobRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public UpdateJobRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public static class UpdateJobRequestActiveJobDTO extends TeaModel {
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

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        public static UpdateJobRequestActiveJobDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobRequestActiveJobDTO self = new UpdateJobRequestActiveJobDTO();
            return TeaModel.build(map, self);
        }

        public UpdateJobRequestActiveJobDTO setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public UpdateJobRequestActiveJobDTO setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public UpdateJobRequestActiveJobDTO setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public UpdateJobRequestActiveJobDTO setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public UpdateJobRequestActiveJobDTO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateJobRequestActiveJobDTO setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public UpdateJobRequestActiveJobDTO setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public UpdateJobRequestActiveJobDTO setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public UpdateJobRequestActiveJobDTO setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public UpdateJobRequestActiveJobDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class UpdateJobRequestUserProfile extends TeaModel {
        @NameInMap("TenantId")
        public Long tenantId;

        public static UpdateJobRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobRequestUserProfile self = new UpdateJobRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public UpdateJobRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
