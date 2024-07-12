// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureEntitiesResponseBody extends TeaModel {
    @NameInMap("FeatureEntities")
    public java.util.List<ListFeatureEntitiesResponseBodyFeatureEntities> featureEntities;

    /**
     * <strong>example:</strong>
     * <p>37D19490-AB69-567D-A852-407C94E510E9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFeatureEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureEntitiesResponseBody self = new ListFeatureEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureEntitiesResponseBody setFeatureEntities(java.util.List<ListFeatureEntitiesResponseBodyFeatureEntities> featureEntities) {
        this.featureEntities = featureEntities;
        return this;
    }
    public java.util.List<ListFeatureEntitiesResponseBodyFeatureEntities> getFeatureEntities() {
        return this.featureEntities;
    }

    public ListFeatureEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFeatureEntitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFeatureEntitiesResponseBodyFeatureEntities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FeatureEntityId")
        public String featureEntityId;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        @NameInMap("JoinId")
        public String joinId;

        /**
         * <strong>example:</strong>
         * <p>feature_entity_1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>project_1</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static ListFeatureEntitiesResponseBodyFeatureEntities build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureEntitiesResponseBodyFeatureEntities self = new ListFeatureEntitiesResponseBodyFeatureEntities();
            return TeaModel.build(map, self);
        }

        public ListFeatureEntitiesResponseBodyFeatureEntities setFeatureEntityId(String featureEntityId) {
            this.featureEntityId = featureEntityId;
            return this;
        }
        public String getFeatureEntityId() {
            return this.featureEntityId;
        }

        public ListFeatureEntitiesResponseBodyFeatureEntities setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListFeatureEntitiesResponseBodyFeatureEntities setJoinId(String joinId) {
            this.joinId = joinId;
            return this;
        }
        public String getJoinId() {
            return this.joinId;
        }

        public ListFeatureEntitiesResponseBodyFeatureEntities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFeatureEntitiesResponseBodyFeatureEntities setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListFeatureEntitiesResponseBodyFeatureEntities setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFeatureEntitiesResponseBodyFeatureEntities setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
