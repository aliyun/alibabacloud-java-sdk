// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("SharedResources")
    @Validation(required = true)
    public java.util.List<ListSharedResourcesResponseSharedResources> sharedResources;

    public static ListSharedResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSharedResourcesResponse self = new ListSharedResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListSharedResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSharedResourcesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSharedResourcesResponse setSharedResources(java.util.List<ListSharedResourcesResponseSharedResources> sharedResources) {
        this.sharedResources = sharedResources;
        return this;
    }
    public java.util.List<ListSharedResourcesResponseSharedResources> getSharedResources() {
        return this.sharedResources;
    }

    public static class ListSharedResourcesResponseSharedResources extends TeaModel {
        @NameInMap("ResourceShareId")
        @Validation(required = true)
        public String resourceShareId;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ResourceStatus")
        @Validation(required = true)
        public String resourceStatus;

        @NameInMap("ResourceStatusMessage")
        @Validation(required = true)
        public String resourceStatusMessage;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static ListSharedResourcesResponseSharedResources build(java.util.Map<String, ?> map) throws Exception {
            ListSharedResourcesResponseSharedResources self = new ListSharedResourcesResponseSharedResources();
            return TeaModel.build(map, self);
        }

        public ListSharedResourcesResponseSharedResources setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListSharedResourcesResponseSharedResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListSharedResourcesResponseSharedResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListSharedResourcesResponseSharedResources setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public ListSharedResourcesResponseSharedResources setResourceStatusMessage(String resourceStatusMessage) {
            this.resourceStatusMessage = resourceStatusMessage;
            return this;
        }
        public String getResourceStatusMessage() {
            return this.resourceStatusMessage;
        }

        public ListSharedResourcesResponseSharedResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSharedResourcesResponseSharedResources setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
