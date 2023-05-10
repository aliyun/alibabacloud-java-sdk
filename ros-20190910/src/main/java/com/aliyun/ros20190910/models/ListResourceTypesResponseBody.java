// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DefaultVersionId")
        public String defaultVersionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("LatestVersionId")
        public String latestVersionId;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TotalVersionCount")
        public Integer totalVersionCount;

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
