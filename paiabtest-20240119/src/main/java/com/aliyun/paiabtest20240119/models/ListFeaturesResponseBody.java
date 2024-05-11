// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListFeaturesResponseBody extends TeaModel {
    @NameInMap("Features")
    public java.util.List<ListFeaturesResponseBodyFeatures> features;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeaturesResponseBody self = new ListFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeaturesResponseBody setFeatures(java.util.List<ListFeaturesResponseBodyFeatures> features) {
        this.features = features;
        return this;
    }
    public java.util.List<ListFeaturesResponseBodyFeatures> getFeatures() {
        return this.features;
    }

    public ListFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFeaturesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFeaturesResponseBodyFeatures extends TeaModel {
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

        @NameInMap("Filter")
        public String filter;

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

        @NameInMap("Status")
        public String status;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListFeaturesResponseBodyFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListFeaturesResponseBodyFeatures self = new ListFeaturesResponseBodyFeatures();
            return TeaModel.build(map, self);
        }

        public ListFeaturesResponseBodyFeatures setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListFeaturesResponseBodyFeatures setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public ListFeaturesResponseBodyFeatures setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListFeaturesResponseBodyFeatures setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListFeaturesResponseBodyFeatures setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

        public ListFeaturesResponseBodyFeatures setExperimentOwner(String experimentOwner) {
            this.experimentOwner = experimentOwner;
            return this;
        }
        public String getExperimentOwner() {
            return this.experimentOwner;
        }

        public ListFeaturesResponseBodyFeatures setExperimentVersionId(String experimentVersionId) {
            this.experimentVersionId = experimentVersionId;
            return this;
        }
        public String getExperimentVersionId() {
            return this.experimentVersionId;
        }

        public ListFeaturesResponseBodyFeatures setExperimentVersionName(String experimentVersionName) {
            this.experimentVersionName = experimentVersionName;
            return this;
        }
        public String getExperimentVersionName() {
            return this.experimentVersionName;
        }

        public ListFeaturesResponseBodyFeatures setFeatureId(String featureId) {
            this.featureId = featureId;
            return this;
        }
        public String getFeatureId() {
            return this.featureId;
        }

        public ListFeaturesResponseBodyFeatures setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public ListFeaturesResponseBodyFeatures setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListFeaturesResponseBodyFeatures setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListFeaturesResponseBodyFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFeaturesResponseBodyFeatures setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFeaturesResponseBodyFeatures setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListFeaturesResponseBodyFeatures setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public ListFeaturesResponseBodyFeatures setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFeaturesResponseBodyFeatures setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
