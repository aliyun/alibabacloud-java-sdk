// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next queries are sent.</p>
     * <p>*   If a value is returned for **NextToken**, the value is used to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag key.</p>
     */
    @NameInMap("TagResources")
    public ListTagResourcesResponseBodyTagResources tagResources;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesResponseBody setTagResources(ListTagResourcesResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public ListTagResourcesResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesResponseBodyTagResourcesTagResource extends TeaModel {
        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource. Valid values:</p>
         * <br>
         * <p>*   **VPC**: virtual private cloud (VPC)</p>
         * <p>*   **VSWITCH**: vSwitch</p>
         * <p>*   **ROUTETABLE**: route table</p>
         * <p>*   **EIP**: EIP</p>
         * <p>*   **VpnGateWay**: VPN gateway</p>
         * <p>*   **NATGATEWAY**: NAT gateway</p>
         * <p>*   **COMMONBANDWIDTHPACKAGE**: EIP bandwidth plan</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResourcesTagResource self = new ListTagResourcesResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> tagResource;

        public static ListTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResources self = new ListTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResources setTagResource(java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
