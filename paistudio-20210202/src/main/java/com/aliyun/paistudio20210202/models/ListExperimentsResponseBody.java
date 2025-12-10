// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListExperimentsResponseBody extends TeaModel {
    @NameInMap("Experiments")
    public java.util.List<ListExperimentsResponseBodyExperiments> experiments;

    /**
     * <strong>example:</strong>
     * <p>9708FB85-232F-5F9A-9D67-7F9CCCE20E06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListExperimentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentsResponseBody self = new ListExperimentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentsResponseBody setExperiments(java.util.List<ListExperimentsResponseBodyExperiments> experiments) {
        this.experiments = experiments;
        return this;
    }
    public java.util.List<ListExperimentsResponseBodyExperiments> getExperiments() {
        return this.experiments;
    }

    public ListExperimentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExperimentsResponseBodyExperiments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <strong>example:</strong>
         * <p>1326*******76250</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>Pipeline draft description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>draft-rbvg5wzljzjhc9ks92</p>
         */
        @NameInMap("ExperimentId")
        public String experimentId;

        /**
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>Pipeline draft name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>PaiStudio</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Version")
        public Long version;

        /**
         * <strong>example:</strong>
         * <p>23487</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListExperimentsResponseBodyExperiments build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentsResponseBodyExperiments self = new ListExperimentsResponseBodyExperiments();
            return TeaModel.build(map, self);
        }

        public ListExperimentsResponseBodyExperiments setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListExperimentsResponseBodyExperiments setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListExperimentsResponseBodyExperiments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExperimentsResponseBodyExperiments setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListExperimentsResponseBodyExperiments setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListExperimentsResponseBodyExperiments setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListExperimentsResponseBodyExperiments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExperimentsResponseBodyExperiments setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListExperimentsResponseBodyExperiments setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public ListExperimentsResponseBodyExperiments setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
