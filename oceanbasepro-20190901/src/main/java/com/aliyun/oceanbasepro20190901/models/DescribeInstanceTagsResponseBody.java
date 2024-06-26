// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTagsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("TagResources")
    public java.util.List<DescribeInstanceTagsResponseBodyTagResources> tagResources;

    public static DescribeInstanceTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTagsResponseBody self = new DescribeInstanceTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceTagsResponseBody setTagResources(java.util.List<DescribeInstanceTagsResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<DescribeInstanceTagsResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class DescribeInstanceTagsResponseBodyTagResources extends TeaModel {
        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tag of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Key&quot;: &quot;xxx&quot;, &quot;Value&quot;, &quot;xxx&quot;},{}]</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static DescribeInstanceTagsResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTagsResponseBodyTagResources self = new DescribeInstanceTagsResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTagsResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeInstanceTagsResponseBodyTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeInstanceTagsResponseBodyTagResources setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
