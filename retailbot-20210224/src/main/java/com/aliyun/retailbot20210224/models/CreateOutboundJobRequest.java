// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateOutboundJobRequest extends TeaModel {
    @NameInMap("OutboundJobDTO")
    public CreateOutboundJobRequestOutboundJobDTO outboundJobDTO;

    @NameInMap("UserProfile")
    public CreateOutboundJobRequestUserProfile userProfile;

    public static CreateOutboundJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundJobRequest self = new CreateOutboundJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateOutboundJobRequest setOutboundJobDTO(CreateOutboundJobRequestOutboundJobDTO outboundJobDTO) {
        this.outboundJobDTO = outboundJobDTO;
        return this;
    }
    public CreateOutboundJobRequestOutboundJobDTO getOutboundJobDTO() {
        return this.outboundJobDTO;
    }

    public CreateOutboundJobRequest setUserProfile(CreateOutboundJobRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public CreateOutboundJobRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public static class CreateOutboundJobRequestOutboundJobDTO extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Config")
        public String config;

        @NameInMap("CrowdConfig")
        public String crowdConfig;

        @NameInMap("CrowdType")
        public Integer crowdType;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("RunConfig")
        public String runConfig;

        @NameInMap("RunType")
        public Integer runType;

        @NameInMap("SaasId")
        public String saasId;

        @NameInMap("ShopId")
        public Long shopId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Version")
        public String version;

        public static CreateOutboundJobRequestOutboundJobDTO build(java.util.Map<String, ?> map) throws Exception {
            CreateOutboundJobRequestOutboundJobDTO self = new CreateOutboundJobRequestOutboundJobDTO();
            return TeaModel.build(map, self);
        }

        public CreateOutboundJobRequestOutboundJobDTO setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public CreateOutboundJobRequestOutboundJobDTO setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public CreateOutboundJobRequestOutboundJobDTO setCrowdConfig(String crowdConfig) {
            this.crowdConfig = crowdConfig;
            return this;
        }
        public String getCrowdConfig() {
            return this.crowdConfig;
        }

        public CreateOutboundJobRequestOutboundJobDTO setCrowdType(Integer crowdType) {
            this.crowdType = crowdType;
            return this;
        }
        public Integer getCrowdType() {
            return this.crowdType;
        }

        public CreateOutboundJobRequestOutboundJobDTO setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateOutboundJobRequestOutboundJobDTO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateOutboundJobRequestOutboundJobDTO setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateOutboundJobRequestOutboundJobDTO setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateOutboundJobRequestOutboundJobDTO setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public CreateOutboundJobRequestOutboundJobDTO setRunConfig(String runConfig) {
            this.runConfig = runConfig;
            return this;
        }
        public String getRunConfig() {
            return this.runConfig;
        }

        public CreateOutboundJobRequestOutboundJobDTO setRunType(Integer runType) {
            this.runType = runType;
            return this;
        }
        public Integer getRunType() {
            return this.runType;
        }

        public CreateOutboundJobRequestOutboundJobDTO setSaasId(String saasId) {
            this.saasId = saasId;
            return this;
        }
        public String getSaasId() {
            return this.saasId;
        }

        public CreateOutboundJobRequestOutboundJobDTO setShopId(Long shopId) {
            this.shopId = shopId;
            return this;
        }
        public Long getShopId() {
            return this.shopId;
        }

        public CreateOutboundJobRequestOutboundJobDTO setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateOutboundJobRequestOutboundJobDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateOutboundJobRequestOutboundJobDTO setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public CreateOutboundJobRequestOutboundJobDTO setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateOutboundJobRequestUserProfile extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("PlatformCode")
        public String platformCode;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserNick")
        public String userNick;

        public static CreateOutboundJobRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateOutboundJobRequestUserProfile self = new CreateOutboundJobRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public CreateOutboundJobRequestUserProfile setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public CreateOutboundJobRequestUserProfile setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public CreateOutboundJobRequestUserProfile setPlatformCode(String platformCode) {
            this.platformCode = platformCode;
            return this;
        }
        public String getPlatformCode() {
            return this.platformCode;
        }

        public CreateOutboundJobRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public CreateOutboundJobRequestUserProfile setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public CreateOutboundJobRequestUserProfile setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

}
