// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedResourcesResponseBody extends TeaModel {
    /**
     * <p>The token that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04677DCA-7C33-464B-8811-1B1DA3C3D197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the shared resources.</p>
     */
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
        /**
         * <p>The time when the shared resource was associated with the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-07T07:39:02.921Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the shared resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1upw03qyz8n7us9****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-6GRmdD3X****</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        /**
         * <p>The status of the shared resource. This parameter is returned only when you query the resources that other accounts share with you.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Available: The resource is available.</li>
         * <li>ZonalResourceInaccessible: The resource is unavailable in the current zone.</li>
         * <li>LimitExceeded: The resource is unavailable because the maximum number of resources that other accounts can share with you exceeds the upper limit.</li>
         * <li>Unavailable: The resource is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The cause of the association failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The reason for the association failure.</p>
         */
        @NameInMap("ResourceStatusMessage")
        public String resourceStatusMessage;

        /**
         * <p>The type of the shared resource.</p>
         * <p>For more information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>VSwitch</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The time when the association of the shared resource was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-07T07:39:02.921Z</p>
         */
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
