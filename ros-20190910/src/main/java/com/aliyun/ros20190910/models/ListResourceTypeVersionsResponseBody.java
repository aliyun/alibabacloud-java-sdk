// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypeVersionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The versions of the resource types.</p>
     */
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
        /**
         * <p>The time when the version was created. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-24T08:25:21</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>It is a demo.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The entity type. Only Module may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Module</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>Indicates whether the version is the default version. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefaultVersion")
        public Boolean isDefaultVersion;

        /**
         * <p>The provider of the resource type. Valid values:</p>
         * <ul>
         * <li>ROS: ROS</li>
         * <li>Self: yourself</li>
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
         * <p>The time when the version was updated. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-24T08:25:21</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
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
