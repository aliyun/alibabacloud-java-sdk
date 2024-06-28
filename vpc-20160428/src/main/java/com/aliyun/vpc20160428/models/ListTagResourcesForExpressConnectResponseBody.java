// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTagResourcesForExpressConnectResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tags that are added to the resource.</p>
     */
    @NameInMap("TagResources")
    public ListTagResourcesForExpressConnectResponseBodyTagResources tagResources;

    public static ListTagResourcesForExpressConnectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesForExpressConnectResponseBody self = new ListTagResourcesForExpressConnectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesForExpressConnectResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesForExpressConnectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesForExpressConnectResponseBody setTagResources(ListTagResourcesForExpressConnectResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public ListTagResourcesForExpressConnectResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource extends TeaModel {
        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp16qjewdsunr41m1****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li><strong>PHYSICALCONNECTION</strong>: Express Connect circuit.</li>
         * <li><strong>VIRTUALBORDERROUTER</strong>: VBR.</li>
         * <li><strong>ROUTERINTERFACE</strong>: router interface.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PHYSICALCONNECTION</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The key of the tag that is added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag that is added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource self = new ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesForExpressConnectResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource> tagResource;

        public static ListTagResourcesForExpressConnectResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesForExpressConnectResponseBodyTagResources self = new ListTagResourcesForExpressConnectResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesForExpressConnectResponseBodyTagResources setTagResource(java.util.List<ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
