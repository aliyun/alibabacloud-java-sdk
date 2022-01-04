// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListRecentExperimentsResponseBody extends TeaModel {
    @NameInMap("Experiments")
    public java.util.List<ListRecentExperimentsResponseBodyExperiments> experiments;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRecentExperimentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentExperimentsResponseBody self = new ListRecentExperimentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecentExperimentsResponseBody setExperiments(java.util.List<ListRecentExperimentsResponseBodyExperiments> experiments) {
        this.experiments = experiments;
        return this;
    }
    public java.util.List<ListRecentExperimentsResponseBodyExperiments> getExperiments() {
        return this.experiments;
    }

    public ListRecentExperimentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecentExperimentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecentExperimentsResponseBodyExperiments extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("ModifyCnt")
        public Long modifyCnt;

        @NameInMap("Name")
        public String name;

        @NameInMap("RecentGmtModifiedTime")
        public String recentGmtModifiedTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListRecentExperimentsResponseBodyExperiments build(java.util.Map<String, ?> map) throws Exception {
            ListRecentExperimentsResponseBodyExperiments self = new ListRecentExperimentsResponseBodyExperiments();
            return TeaModel.build(map, self);
        }

        public ListRecentExperimentsResponseBodyExperiments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRecentExperimentsResponseBodyExperiments setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListRecentExperimentsResponseBodyExperiments setModifyCnt(Long modifyCnt) {
            this.modifyCnt = modifyCnt;
            return this;
        }
        public Long getModifyCnt() {
            return this.modifyCnt;
        }

        public ListRecentExperimentsResponseBodyExperiments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRecentExperimentsResponseBodyExperiments setRecentGmtModifiedTime(String recentGmtModifiedTime) {
            this.recentGmtModifiedTime = recentGmtModifiedTime;
            return this;
        }
        public String getRecentGmtModifiedTime() {
            return this.recentGmtModifiedTime;
        }

        public ListRecentExperimentsResponseBodyExperiments setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRecentExperimentsResponseBodyExperiments setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListRecentExperimentsResponseBodyExperiments setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
