// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListLaboratoriesResponseBody extends TeaModel {
    @NameInMap("Laboratories")
    public java.util.List<ListLaboratoriesResponseBodyLaboratories> laboratories;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1C0898E5-9220-5443-B2D9-445FF0688215</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BucketCount")
        public Integer bucketCount;

        /**
         * <strong>example:</strong>
         * <p>Filter</p>
         */
        @NameInMap("BucketType")
        public String bucketType;

        /**
         * <strong>example:</strong>
         * <p>1,2,3,10-20</p>
         */
        @NameInMap("Buckets")
        public String buckets;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CrowdId")
        public String crowdId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DebugCrowdId")
        public String debugCrowdId;

        /**
         * <strong>example:</strong>
         * <p>user1,user2,user3</p>
         */
        @NameInMap("DebugUsers")
        public String debugUsers;

        /**
         * <strong>example:</strong>
         * <p>This is a test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("Environment")
        public String environment;

        /**
         * <strong>example:</strong>
         * <p>filter=xxx</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LaboratoryId")
        public String laboratoryId;

        /**
         * <strong>example:</strong>
         * <p>laboratory1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <strong>example:</strong>
         * <p>Offline</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Base</p>
         */
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
