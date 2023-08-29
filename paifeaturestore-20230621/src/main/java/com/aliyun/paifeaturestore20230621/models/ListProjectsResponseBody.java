// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("Projects")
    public java.util.List<ListProjectsResponseBodyProjects> projects;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setProjects(java.util.List<ListProjectsResponseBodyProjects> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<ListProjectsResponseBodyProjects> getProjects() {
        return this.projects;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectsResponseBodyProjects extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("FeatureEntityCount")
        public Integer featureEntityCount;

        @NameInMap("FeatureViewCount")
        public Integer featureViewCount;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("ModelCount")
        public Integer modelCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("OfflineDatasourceId")
        public String offlineDatasourceId;

        @NameInMap("OfflineDatasourceName")
        public String offlineDatasourceName;

        @NameInMap("OfflineDatasourceType")
        public String offlineDatasourceType;

        @NameInMap("OfflineLifecycle")
        public Integer offlineLifecycle;

        @NameInMap("OnlineDatasourceId")
        public String onlineDatasourceId;

        @NameInMap("OnlineDatasourceName")
        public String onlineDatasourceName;

        @NameInMap("OnlineDatasourceType")
        public String onlineDatasourceType;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public String projectId;

        public static ListProjectsResponseBodyProjects build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyProjects self = new ListProjectsResponseBodyProjects();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyProjects setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectsResponseBodyProjects setFeatureEntityCount(Integer featureEntityCount) {
            this.featureEntityCount = featureEntityCount;
            return this;
        }
        public Integer getFeatureEntityCount() {
            return this.featureEntityCount;
        }

        public ListProjectsResponseBodyProjects setFeatureViewCount(Integer featureViewCount) {
            this.featureViewCount = featureViewCount;
            return this;
        }
        public Integer getFeatureViewCount() {
            return this.featureViewCount;
        }

        public ListProjectsResponseBodyProjects setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListProjectsResponseBodyProjects setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListProjectsResponseBodyProjects setModelCount(Integer modelCount) {
            this.modelCount = modelCount;
            return this;
        }
        public Integer getModelCount() {
            return this.modelCount;
        }

        public ListProjectsResponseBodyProjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyProjects setOfflineDatasourceId(String offlineDatasourceId) {
            this.offlineDatasourceId = offlineDatasourceId;
            return this;
        }
        public String getOfflineDatasourceId() {
            return this.offlineDatasourceId;
        }

        public ListProjectsResponseBodyProjects setOfflineDatasourceName(String offlineDatasourceName) {
            this.offlineDatasourceName = offlineDatasourceName;
            return this;
        }
        public String getOfflineDatasourceName() {
            return this.offlineDatasourceName;
        }

        public ListProjectsResponseBodyProjects setOfflineDatasourceType(String offlineDatasourceType) {
            this.offlineDatasourceType = offlineDatasourceType;
            return this;
        }
        public String getOfflineDatasourceType() {
            return this.offlineDatasourceType;
        }

        public ListProjectsResponseBodyProjects setOfflineLifecycle(Integer offlineLifecycle) {
            this.offlineLifecycle = offlineLifecycle;
            return this;
        }
        public Integer getOfflineLifecycle() {
            return this.offlineLifecycle;
        }

        public ListProjectsResponseBodyProjects setOnlineDatasourceId(String onlineDatasourceId) {
            this.onlineDatasourceId = onlineDatasourceId;
            return this;
        }
        public String getOnlineDatasourceId() {
            return this.onlineDatasourceId;
        }

        public ListProjectsResponseBodyProjects setOnlineDatasourceName(String onlineDatasourceName) {
            this.onlineDatasourceName = onlineDatasourceName;
            return this;
        }
        public String getOnlineDatasourceName() {
            return this.onlineDatasourceName;
        }

        public ListProjectsResponseBodyProjects setOnlineDatasourceType(String onlineDatasourceType) {
            this.onlineDatasourceType = onlineDatasourceType;
            return this;
        }
        public String getOnlineDatasourceType() {
            return this.onlineDatasourceType;
        }

        public ListProjectsResponseBodyProjects setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListProjectsResponseBodyProjects setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
