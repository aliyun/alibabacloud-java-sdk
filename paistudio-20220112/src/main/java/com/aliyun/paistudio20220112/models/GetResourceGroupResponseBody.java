// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cb2c7bde30b774e46a329c</p>
     */
    @NameInMap("ClusterID")
    public String clusterID;

    /**
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ComputingResourceProvider")
    public String computingResourceProvider;

    /**
     * <strong>example:</strong>
     * <p>1612285282502324</p>
     */
    @NameInMap("CreatorID")
    public String creatorID;

    /**
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    /**
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>TestResourceGroup</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>18D5A1C6-14B8-545E-8408-0A7DDB4C6B5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportRDMA")
    public Boolean supportRDMA;

    @NameInMap("Tags")
    public java.util.List<GetResourceGroupResponseBodyTags> tags;

    @NameInMap("UserVpc")
    public UserVpc userVpc;

    @NameInMap("Version")
    public String version;

    /**
     * <strong>example:</strong>
     * <p>35201</p>
     */
    @NameInMap("WorkspaceID")
    public String workspaceID;

    public static GetResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupResponseBody self = new GetResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupResponseBody setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }
    public String getClusterID() {
        return this.clusterID;
    }

    public GetResourceGroupResponseBody setComputingResourceProvider(String computingResourceProvider) {
        this.computingResourceProvider = computingResourceProvider;
        return this;
    }
    public String getComputingResourceProvider() {
        return this.computingResourceProvider;
    }

    public GetResourceGroupResponseBody setCreatorID(String creatorID) {
        this.creatorID = creatorID;
        return this;
    }
    public String getCreatorID() {
        return this.creatorID;
    }

    public GetResourceGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetResourceGroupResponseBody setGmtCreatedTime(String gmtCreatedTime) {
        this.gmtCreatedTime = gmtCreatedTime;
        return this;
    }
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    public GetResourceGroupResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetResourceGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceGroupResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetResourceGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetResourceGroupResponseBody setSupportRDMA(Boolean supportRDMA) {
        this.supportRDMA = supportRDMA;
        return this;
    }
    public Boolean getSupportRDMA() {
        return this.supportRDMA;
    }

    public GetResourceGroupResponseBody setTags(java.util.List<GetResourceGroupResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetResourceGroupResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetResourceGroupResponseBody setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public GetResourceGroupResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetResourceGroupResponseBody setWorkspaceID(String workspaceID) {
        this.workspaceID = workspaceID;
        return this;
    }
    public String getWorkspaceID() {
        return this.workspaceID;
    }

    public static class GetResourceGroupResponseBodyTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetResourceGroupResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseBodyTags self = new GetResourceGroupResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetResourceGroupResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
