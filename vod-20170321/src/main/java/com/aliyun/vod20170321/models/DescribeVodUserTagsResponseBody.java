// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<DescribeVodUserTagsResponseBodyTags> tags;

    public static DescribeVodUserTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserTagsResponseBody self = new DescribeVodUserTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodUserTagsResponseBody setTags(java.util.List<DescribeVodUserTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeVodUserTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class DescribeVodUserTagsResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeVodUserTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserTagsResponseBodyTags self = new DescribeVodUserTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeVodUserTagsResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVodUserTagsResponseBodyTags setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
