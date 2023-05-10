// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypeVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceTypeVersions")
    public java.util.List<ListResourceTypeVersionsResponseBodyResourceTypeVersions> resourceTypeVersions;

    public static ListResourceTypeVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypeVersionsResponseBody self = new ListResourceTypeVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTypeVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTypeVersionsResponseBody setResourceTypeVersions(java.util.List<ListResourceTypeVersionsResponseBodyResourceTypeVersions> resourceTypeVersions) {
        this.resourceTypeVersions = resourceTypeVersions;
        return this;
    }
    public java.util.List<ListResourceTypeVersionsResponseBodyResourceTypeVersions> getResourceTypeVersions() {
        return this.resourceTypeVersions;
    }

    public static class ListResourceTypeVersionsResponseBodyResourceTypeVersions extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("IsDefaultVersion")
        public Boolean isDefaultVersion;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("VersionId")
        public String versionId;

        public static ListResourceTypeVersionsResponseBodyResourceTypeVersions build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypeVersionsResponseBodyResourceTypeVersions self = new ListResourceTypeVersionsResponseBodyResourceTypeVersions();
            return TeaModel.build(map, self);
        }

        public ListResourceTypeVersionsResponseBodyResourceTypeVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceTypeVersionsResponseBodyResourceTypeVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceTypeVersionsResponseBodyResourceTypeVersions setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListResourceTypeVersionsResponseBodyResourceTypeVersions setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public ListResourceTypeVersionsResponseBodyResourceTypeVersions setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListResourceTypeVersionsResponseBodyResourceTypeVersions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceTypeVersionsResponseBodyResourceTypeVersions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListResourceTypeVersionsResponseBodyResourceTypeVersions setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
