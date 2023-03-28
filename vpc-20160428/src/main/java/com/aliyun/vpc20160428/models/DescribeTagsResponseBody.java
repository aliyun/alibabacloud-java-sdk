// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeTagsResponseBody extends TeaModel {
    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If the value of **NextToken** is not returned, it indicates that no next query is to be sent.</p>
     * <p>*   If a value of **NextToken** is returned, the value is the token that is used for the subsequent query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tags that meet the filter conditions.</p>
     */
    @NameInMap("TagResources")
    public DescribeTagsResponseBodyTagResources tagResources;

    public static DescribeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponseBody self = new DescribeTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsResponseBody setTagResources(DescribeTagsResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public DescribeTagsResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class DescribeTagsResponseBodyTagResourcesTagResource extends TeaModel {
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

        public static DescribeTagsResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagResourcesTagResource self = new DescribeTagsResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagsResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeTagsResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<DescribeTagsResponseBodyTagResourcesTagResource> tagResource;

        public static DescribeTagsResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagResources self = new DescribeTagsResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagResources setTagResource(java.util.List<DescribeTagsResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<DescribeTagsResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
