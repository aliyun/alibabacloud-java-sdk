// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateJobShrinkRequest extends TeaModel {
    @NameInMap("ActiveJobDTO")
    public UpdateJobShrinkRequestActiveJobDTO activeJobDTO;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    public static UpdateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobShrinkRequest self = new UpdateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobShrinkRequest setActiveJobDTO(UpdateJobShrinkRequestActiveJobDTO activeJobDTO) {
        this.activeJobDTO = activeJobDTO;
        return this;
    }
    public UpdateJobShrinkRequestActiveJobDTO getActiveJobDTO() {
        return this.activeJobDTO;
    }

    public UpdateJobShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

    public static class UpdateJobShrinkRequestActiveJobDTO extends TeaModel {
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

        public static UpdateJobShrinkRequestActiveJobDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobShrinkRequestActiveJobDTO self = new UpdateJobShrinkRequestActiveJobDTO();
            return TeaModel.build(map, self);
        }

        public UpdateJobShrinkRequestActiveJobDTO setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public UpdateJobShrinkRequestActiveJobDTO setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public UpdateJobShrinkRequestActiveJobDTO setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public UpdateJobShrinkRequestActiveJobDTO setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public UpdateJobShrinkRequestActiveJobDTO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateJobShrinkRequestActiveJobDTO setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public UpdateJobShrinkRequestActiveJobDTO setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public UpdateJobShrinkRequestActiveJobDTO setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public UpdateJobShrinkRequestActiveJobDTO setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public UpdateJobShrinkRequestActiveJobDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
