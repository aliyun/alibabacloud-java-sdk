// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class GetHpoExperimentResponseBody extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Code")
    public String code;

    @NameInMap("ConfigIni")
    public String configIni;

    @NameInMap("ConfigYml")
    public String configYml;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Deleted")
    public Boolean deleted;

    @NameInMap("Description")
    public String description;

    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("HpoExperimentConfiguration")
    public java.util.Map<String, ?> hpoExperimentConfiguration;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchSpace")
    public String searchSpace;

    @NameInMap("Status")
    public String status;

    @NameInMap("TrialCount")
    public Integer trialCount;

    @NameInMap("TrialStatus")
    public java.util.Map<String, String> trialStatus;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetHpoExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHpoExperimentResponseBody self = new GetHpoExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHpoExperimentResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetHpoExperimentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHpoExperimentResponseBody setConfigIni(String configIni) {
        this.configIni = configIni;
        return this;
    }
    public String getConfigIni() {
        return this.configIni;
    }

    public GetHpoExperimentResponseBody setConfigYml(String configYml) {
        this.configYml = configYml;
        return this;
    }
    public String getConfigYml() {
        return this.configYml;
    }

    public GetHpoExperimentResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetHpoExperimentResponseBody setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public GetHpoExperimentResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetHpoExperimentResponseBody setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public GetHpoExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetHpoExperimentResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetHpoExperimentResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetHpoExperimentResponseBody setHpoExperimentConfiguration(java.util.Map<String, ?> hpoExperimentConfiguration) {
        this.hpoExperimentConfiguration = hpoExperimentConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getHpoExperimentConfiguration() {
        return this.hpoExperimentConfiguration;
    }

    public GetHpoExperimentResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public GetHpoExperimentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHpoExperimentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetHpoExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHpoExperimentResponseBody setSearchSpace(String searchSpace) {
        this.searchSpace = searchSpace;
        return this;
    }
    public String getSearchSpace() {
        return this.searchSpace;
    }

    public GetHpoExperimentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetHpoExperimentResponseBody setTrialCount(Integer trialCount) {
        this.trialCount = trialCount;
        return this;
    }
    public Integer getTrialCount() {
        return this.trialCount;
    }

    public GetHpoExperimentResponseBody setTrialStatus(java.util.Map<String, String> trialStatus) {
        this.trialStatus = trialStatus;
        return this;
    }
    public java.util.Map<String, String> getTrialStatus() {
        return this.trialStatus;
    }

    public GetHpoExperimentResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
