// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    /**
     * <p>The list of projects.</p>
     */
    @NameInMap("Projects")
    public java.util.List<ListProjectsResponseBodyProjects> projects;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>44933189-493B-5C43-A5C6-11EEC2A43520</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of projects.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <p>The project description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of feature entities.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FeatureEntityCount")
        public Integer featureEntityCount;

        /**
         * <p>The number of feature views.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FeatureViewCount")
        public Integer featureViewCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The number of models.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ModelCount")
        public Integer modelCount;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>project1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The offline data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("OfflineDatasourceId")
        public String offlineDatasourceId;

        /**
         * <p>The offline data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>datasource1</p>
         */
        @NameInMap("OfflineDatasourceName")
        public String offlineDatasourceName;

        /**
         * <p>The offline data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("OfflineDatasourceType")
        public String offlineDatasourceType;

        /**
         * <p>The offline data lifecycle, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OfflineLifecycle")
        public Integer offlineLifecycle;

        /**
         * <p>The online data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("OnlineDatasourceId")
        public String onlineDatasourceId;

        /**
         * <p>The online data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>datasource2</p>
         */
        @NameInMap("OnlineDatasourceName")
        public String onlineDatasourceName;

        /**
         * <p>The online data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("OnlineDatasourceType")
        public String onlineDatasourceType;

        /**
         * <p>The project owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1232132543543****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35523</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

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

        public ListProjectsResponseBodyProjects setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
