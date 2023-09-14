// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListLaboratoriesResponseBody extends TeaModel {
    @NameInMap("Laboratories")
    public java.util.List<ListLaboratoriesResponseBodyLaboratories> laboratories;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLaboratoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLaboratoriesResponseBody self = new ListLaboratoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLaboratoriesResponseBody setLaboratories(java.util.List<ListLaboratoriesResponseBodyLaboratories> laboratories) {
        this.laboratories = laboratories;
        return this;
    }
    public java.util.List<ListLaboratoriesResponseBodyLaboratories> getLaboratories() {
        return this.laboratories;
    }

    public ListLaboratoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLaboratoriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLaboratoriesResponseBodyLaboratories extends TeaModel {
        @NameInMap("BucketCount")
        public Integer bucketCount;

        @NameInMap("BucketType")
        public String bucketType;

        @NameInMap("Buckets")
        public String buckets;

        @NameInMap("CrowdId")
        public String crowdId;

        @NameInMap("DebugCrowdId")
        public String debugCrowdId;

        @NameInMap("DebugUsers")
        public String debugUsers;

        @NameInMap("Description")
        public String description;

        @NameInMap("Environment")
        public String environment;

        @NameInMap("Filter")
        public String filter;

        @NameInMap("LaboratoryId")
        public String laboratoryId;

        @NameInMap("Name")
        public String name;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListLaboratoriesResponseBodyLaboratories build(java.util.Map<String, ?> map) throws Exception {
            ListLaboratoriesResponseBodyLaboratories self = new ListLaboratoriesResponseBodyLaboratories();
            return TeaModel.build(map, self);
        }

        public ListLaboratoriesResponseBodyLaboratories setBucketCount(Integer bucketCount) {
            this.bucketCount = bucketCount;
            return this;
        }
        public Integer getBucketCount() {
            return this.bucketCount;
        }

        public ListLaboratoriesResponseBodyLaboratories setBucketType(String bucketType) {
            this.bucketType = bucketType;
            return this;
        }
        public String getBucketType() {
            return this.bucketType;
        }

        public ListLaboratoriesResponseBodyLaboratories setBuckets(String buckets) {
            this.buckets = buckets;
            return this;
        }
        public String getBuckets() {
            return this.buckets;
        }

        public ListLaboratoriesResponseBodyLaboratories setCrowdId(String crowdId) {
            this.crowdId = crowdId;
            return this;
        }
        public String getCrowdId() {
            return this.crowdId;
        }

        public ListLaboratoriesResponseBodyLaboratories setDebugCrowdId(String debugCrowdId) {
            this.debugCrowdId = debugCrowdId;
            return this;
        }
        public String getDebugCrowdId() {
            return this.debugCrowdId;
        }

        public ListLaboratoriesResponseBodyLaboratories setDebugUsers(String debugUsers) {
            this.debugUsers = debugUsers;
            return this;
        }
        public String getDebugUsers() {
            return this.debugUsers;
        }

        public ListLaboratoriesResponseBodyLaboratories setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLaboratoriesResponseBodyLaboratories setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public ListLaboratoriesResponseBodyLaboratories setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public ListLaboratoriesResponseBodyLaboratories setLaboratoryId(String laboratoryId) {
            this.laboratoryId = laboratoryId;
            return this;
        }
        public String getLaboratoryId() {
            return this.laboratoryId;
        }

        public ListLaboratoriesResponseBodyLaboratories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLaboratoriesResponseBodyLaboratories setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListLaboratoriesResponseBodyLaboratories setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLaboratoriesResponseBodyLaboratories setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
