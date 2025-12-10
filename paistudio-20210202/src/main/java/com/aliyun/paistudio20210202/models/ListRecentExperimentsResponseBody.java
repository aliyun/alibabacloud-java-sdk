// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListRecentExperimentsResponseBody extends TeaModel {
    @NameInMap("Experiments")
    public java.util.List<ListRecentExperimentsResponseBodyExperiments> experiments;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>Pipeline draft description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>draft-76p70ye0gwv3vbur55</p>
         */
        @NameInMap("ExperimentId")
        public String experimentId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ModifyCnt")
        public Long modifyCnt;

        /**
         * <strong>example:</strong>
         * <p>Pipeline draft name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        @NameInMap("RecentGmtModifiedTime")
        public String recentGmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>PaiStudio</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>15821</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <strong>example:</strong>
         * <p>Workspace name</p>
         */
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
