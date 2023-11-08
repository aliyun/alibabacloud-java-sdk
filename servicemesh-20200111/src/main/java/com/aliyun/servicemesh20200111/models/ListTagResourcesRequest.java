// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the ASM instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the ASM instances.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Set the value to `servicemesh`.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags. A maximum of 20 tags are supported.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTag(java.util.List<ListTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListTagResourcesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <br>
         * <p>A tag key can be up to 128 characters in length. The tag key cannot contain `http://` or `https://` and cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <br>
         * <p>The tag value can be left empty or a string of up to 128 characters. The tag value cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <br>
         * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTag self = new ListTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
