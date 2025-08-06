// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTagResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagResources")
    public java.util.List<DescribeVodTagResourcesResponseBodyTagResources> tagResources;

    public static DescribeVodTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTagResourcesResponseBody self = new DescribeVodTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodTagResourcesResponseBody setTagResources(java.util.List<DescribeVodTagResourcesResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<DescribeVodTagResourcesResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class DescribeVodTagResourcesResponseBodyTagResourcesTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVodTagResourcesResponseBodyTagResourcesTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTagResourcesResponseBodyTagResourcesTag self = new DescribeVodTagResourcesResponseBodyTagResourcesTag();
            return TeaModel.build(map, self);
        }

        public DescribeVodTagResourcesResponseBodyTagResourcesTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVodTagResourcesResponseBodyTagResourcesTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodTagResourcesResponseBodyTagResources extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Tag")
        public java.util.List<DescribeVodTagResourcesResponseBodyTagResourcesTag> tag;

        public static DescribeVodTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTagResourcesResponseBodyTagResources self = new DescribeVodTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public DescribeVodTagResourcesResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeVodTagResourcesResponseBodyTagResources setTag(java.util.List<DescribeVodTagResourcesResponseBodyTagResourcesTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVodTagResourcesResponseBodyTagResourcesTag> getTag() {
            return this.tag;
        }

    }

}
