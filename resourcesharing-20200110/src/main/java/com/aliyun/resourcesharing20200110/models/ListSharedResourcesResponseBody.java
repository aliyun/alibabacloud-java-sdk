// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedResourcesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SharedResources")
    public java.util.List<ListSharedResourcesResponseBodySharedResources> sharedResources;

    public static ListSharedResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSharedResourcesResponseBody self = new ListSharedResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSharedResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSharedResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSharedResourcesResponseBody setSharedResources(java.util.List<ListSharedResourcesResponseBodySharedResources> sharedResources) {
        this.sharedResources = sharedResources;
        return this;
    }
    public java.util.List<ListSharedResourcesResponseBodySharedResources> getSharedResources() {
        return this.sharedResources;
    }

    public static class ListSharedResourcesResponseBodySharedResources extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceShareId")
        public String resourceShareId;

        @NameInMap("ResourceStatus")
        public String resourceStatus;

        @NameInMap("ResourceStatusMessage")
        public String resourceStatusMessage;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListSharedResourcesResponseBodySharedResources build(java.util.Map<String, ?> map) throws Exception {
            ListSharedResourcesResponseBodySharedResources self = new ListSharedResourcesResponseBodySharedResources();
            return TeaModel.build(map, self);
        }

        public ListSharedResourcesResponseBodySharedResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSharedResourcesResponseBodySharedResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListSharedResourcesResponseBodySharedResources setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListSharedResourcesResponseBodySharedResources setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public ListSharedResourcesResponseBodySharedResources setResourceStatusMessage(String resourceStatusMessage) {
            this.resourceStatusMessage = resourceStatusMessage;
            return this;
        }
        public String getResourceStatusMessage() {
            return this.resourceStatusMessage;
        }

        public ListSharedResourcesResponseBodySharedResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListSharedResourcesResponseBodySharedResources setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
