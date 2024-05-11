// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetFeatureResponseBody extends TeaModel {
    @NameInMap("Condition")
    public String condition;

    @NameInMap("Config")
    public String config;

    @NameInMap("DomainId")
    public String domainId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("ExperimentName")
    public String experimentName;

    @NameInMap("ExperimentOwner")
    public String experimentOwner;

    @NameInMap("ExperimentVersionId")
    public String experimentVersionId;

    @NameInMap("ExperimentVersionName")
    public String experimentVersionName;

    @NameInMap("FeatureId")
    public String featureId;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ReleaseTime")
    public String releaseTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureResponseBody self = new GetFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeatureResponseBody setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public GetFeatureResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetFeatureResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GetFeatureResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetFeatureResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetFeatureResponseBody setExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }
    public String getExperimentName() {
        return this.experimentName;
    }

    public GetFeatureResponseBody setExperimentOwner(String experimentOwner) {
        this.experimentOwner = experimentOwner;
        return this;
    }
    public String getExperimentOwner() {
        return this.experimentOwner;
    }

    public GetFeatureResponseBody setExperimentVersionId(String experimentVersionId) {
        this.experimentVersionId = experimentVersionId;
        return this;
    }
    public String getExperimentVersionId() {
        return this.experimentVersionId;
    }

    public GetFeatureResponseBody setExperimentVersionName(String experimentVersionName) {
        this.experimentVersionName = experimentVersionName;
        return this;
    }
    public String getExperimentVersionName() {
        return this.experimentVersionName;
    }

    public GetFeatureResponseBody setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }
    public String getFeatureId() {
        return this.featureId;
    }

    public GetFeatureResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetFeatureResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetFeatureResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetFeatureResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetFeatureResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetFeatureResponseBody setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public GetFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFeatureResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetFeatureResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
