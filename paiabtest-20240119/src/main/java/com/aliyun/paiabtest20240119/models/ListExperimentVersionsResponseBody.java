// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListExperimentVersionsResponseBody extends TeaModel {
    @NameInMap("ExperimentVersions")
    public java.util.List<ListExperimentVersionsResponseBodyExperimentVersions> experimentVersions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListExperimentVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentVersionsResponseBody self = new ListExperimentVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentVersionsResponseBody setExperimentVersions(java.util.List<ListExperimentVersionsResponseBodyExperimentVersions> experimentVersions) {
        this.experimentVersions = experimentVersions;
        return this;
    }
    public java.util.List<ListExperimentVersionsResponseBodyExperimentVersions> getExperimentVersions() {
        return this.experimentVersions;
    }

    public ListExperimentVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentVersionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExperimentVersionsResponseBodyExperimentVersions extends TeaModel {
        @NameInMap("Buckets")
        public String buckets;

        @NameInMap("Config")
        public String config;

        @NameInMap("CrowdIds")
        public String crowdIds;

        @NameInMap("DebugUsers")
        public String debugUsers;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("ExperimentVersionId")
        public String experimentVersionId;

        @NameInMap("Flow")
        public Integer flow;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static ListExperimentVersionsResponseBodyExperimentVersions build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentVersionsResponseBodyExperimentVersions self = new ListExperimentVersionsResponseBodyExperimentVersions();
            return TeaModel.build(map, self);
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setBuckets(String buckets) {
            this.buckets = buckets;
            return this;
        }
        public String getBuckets() {
            return this.buckets;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setCrowdIds(String crowdIds) {
            this.crowdIds = crowdIds;
            return this;
        }
        public String getCrowdIds() {
            return this.crowdIds;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setDebugUsers(String debugUsers) {
            this.debugUsers = debugUsers;
            return this;
        }
        public String getDebugUsers() {
            return this.debugUsers;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setExperimentVersionId(String experimentVersionId) {
            this.experimentVersionId = experimentVersionId;
            return this;
        }
        public String getExperimentVersionId() {
            return this.experimentVersionId;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setFlow(Integer flow) {
            this.flow = flow;
            return this;
        }
        public Integer getFlow() {
            return this.flow;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExperimentVersionsResponseBodyExperimentVersions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
