// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateOutboundJobRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("Config")
    public String config;

    @NameInMap("CrowdConfig")
    public String crowdConfig;

    @NameInMap("CrowdType")
    public Integer crowdType;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("RunConfig")
    public String runConfig;

    @NameInMap("RunType")
    public String runType;

    @NameInMap("SaasId")
    public String saasId;

    @NameInMap("StartTime")
    public String startTime;

    public static CreateOutboundJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundJobRequest self = new CreateOutboundJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateOutboundJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateOutboundJobRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateOutboundJobRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateOutboundJobRequest setCrowdConfig(String crowdConfig) {
        this.crowdConfig = crowdConfig;
        return this;
    }
    public String getCrowdConfig() {
        return this.crowdConfig;
    }

    public CreateOutboundJobRequest setCrowdType(Integer crowdType) {
        this.crowdType = crowdType;
        return this;
    }
    public Integer getCrowdType() {
        return this.crowdType;
    }

    public CreateOutboundJobRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateOutboundJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateOutboundJobRequest setRunConfig(String runConfig) {
        this.runConfig = runConfig;
        return this;
    }
    public String getRunConfig() {
        return this.runConfig;
    }

    public CreateOutboundJobRequest setRunType(String runType) {
        this.runType = runType;
        return this;
    }
    public String getRunType() {
        return this.runType;
    }

    public CreateOutboundJobRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public CreateOutboundJobRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
