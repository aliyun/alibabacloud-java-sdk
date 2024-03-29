// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupResponseBody extends TeaModel {
    @NameInMap("ClusterID")
    public String clusterID;

    @NameInMap("ComputingResourceProvider")
    public String computingResourceProvider;

    @NameInMap("CreatorID")
    public String creatorID;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Status")
    public String status;

    @NameInMap("SupportRDMA")
    public Boolean supportRDMA;

    @NameInMap("Tags")
    public java.util.List<GetResourceGroupResponseBodyTags> tags;

    @NameInMap("UserVpc")
    public UserVpc userVpc;

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

    public GetResourceGroupResponseBody setWorkspaceID(String workspaceID) {
        this.workspaceID = workspaceID;
        return this;
    }
    public String getWorkspaceID() {
        return this.workspaceID;
    }

    public static class GetResourceGroupResponseBodyTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

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
