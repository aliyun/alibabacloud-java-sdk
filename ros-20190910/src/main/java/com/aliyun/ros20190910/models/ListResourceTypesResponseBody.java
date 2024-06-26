// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EA00860C-ECAF-5253-A1F9-8198695A7157</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource type summaries.</p>
     */
    @NameInMap("ResourceTypeSummaries")
    public java.util.List<ListResourceTypesResponseBodyResourceTypeSummaries> resourceTypeSummaries;

    /**
     * <p>The array of resource types.</p>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    public static ListResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesResponseBody self = new ListResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTypesResponseBody setResourceTypeSummaries(java.util.List<ListResourceTypesResponseBodyResourceTypeSummaries> resourceTypeSummaries) {
        this.resourceTypeSummaries = resourceTypeSummaries;
        return this;
    }
    public java.util.List<ListResourceTypesResponseBodyResourceTypeSummaries> getResourceTypeSummaries() {
        return this.resourceTypeSummaries;
    }

    public ListResourceTypesResponseBody setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public static class ListResourceTypesResponseBodyResourceTypeSummaries extends TeaModel {
        /**
         * <p>The creation time. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-24T08:25:21</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the default version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("DefaultVersionId")
        public String defaultVersionId;

        /**
         * <p>The description of the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>It is a demo.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The entity type. Valid values:</p>
         * <ul>
         * <li>Resource: regular resources.</li>
         * <li>DataSource: DataSource resources.</li>
         * <li>Module: modules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Module</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The ID of the latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>v10</p>
         */
        @NameInMap("LatestVersionId")
        public String latestVersionId;

        /**
         * <p>The provider of the resource type. Valid values:</p>
         * <ul>
         * <li>ROS: The resource type is provided by ROS.</li>
         * <li>Self: The resource type is provided by you.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROS</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>MODULE::MyOrganization::MyService::MyUsecase</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The number of versions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalVersionCount")
        public Integer totalVersionCount;

        /**
         * <p>The update time. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-24T08:25:21</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListResourceTypesResponseBodyResourceTypeSummaries build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypeSummaries self = new ListResourceTypesResponseBodyResourceTypeSummaries();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypeSummaries setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceTypesResponseBodyResourceTypeSummaries setDefaultVersionId(String defaultVersionId) {
            this.defaultVersionId = defaultVersionId;
            return this;
        }
        public String getDefaultVersionId() {
            return this.defaultVersionId;
        }

        public ListResourceTypesResponseBodyResourceTypeSummaries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceTypesResponseBodyResourceTypeSummaries setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListResourceTypesResponseBodyResourceTypeSummaries setLatestVersionId(String latestVersionId) {
            this.latestVersionId = latestVersionId;
            return this;
        }
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        public ListResourceTypesResponseBodyResourceTypeSummaries setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListResourceTypesResponseBodyResourceTypeSummaries setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceTypesResponseBodyResourceTypeSummaries setTotalVersionCount(Integer totalVersionCount) {
            this.totalVersionCount = totalVersionCount;
            return this;
        }
        public Integer getTotalVersionCount() {
            return this.totalVersionCount;
        }

        public ListResourceTypesResponseBodyResourceTypeSummaries setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
