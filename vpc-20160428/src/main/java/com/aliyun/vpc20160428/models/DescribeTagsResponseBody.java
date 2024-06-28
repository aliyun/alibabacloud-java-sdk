// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeTagsResponseBody extends TeaModel {
    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If the value of <strong>NextToken</strong> is not returned, it indicates that no next query is to be sent.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value is the token that is used for the subsequent query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C46FF5A8-C5F0-4024-8262-B16B639225A0</p>
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
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
