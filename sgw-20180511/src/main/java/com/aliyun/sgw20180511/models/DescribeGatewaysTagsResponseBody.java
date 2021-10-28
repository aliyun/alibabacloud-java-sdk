// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewaysTagsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GatewayTags")
    public DescribeGatewaysTagsResponseBodyGatewayTags gatewayTags;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewaysTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaysTagsResponseBody self = new DescribeGatewaysTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaysTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewaysTagsResponseBody setGatewayTags(DescribeGatewaysTagsResponseBodyGatewayTags gatewayTags) {
        this.gatewayTags = gatewayTags;
        return this;
    }
    public DescribeGatewaysTagsResponseBodyGatewayTags getGatewayTags() {
        return this.gatewayTags;
    }

    public DescribeGatewaysTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewaysTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewaysTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTagsTag self = new DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTagsTag> tag;

        public static DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTags self = new DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTags();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTags setTag(java.util.List<DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTag extends TeaModel {
        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("Tags")
        public DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTags tags;

        public static DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTag self = new DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTag();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTag setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTag setTags(DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTagTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeGatewaysTagsResponseBodyGatewayTags extends TeaModel {
        @NameInMap("GatewayTag")
        public java.util.List<DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTag> gatewayTag;

        public static DescribeGatewaysTagsResponseBodyGatewayTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysTagsResponseBodyGatewayTags self = new DescribeGatewaysTagsResponseBodyGatewayTags();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysTagsResponseBodyGatewayTags setGatewayTag(java.util.List<DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTag> gatewayTag) {
            this.gatewayTag = gatewayTag;
            return this;
        }
        public java.util.List<DescribeGatewaysTagsResponseBodyGatewayTagsGatewayTag> getGatewayTag() {
            return this.gatewayTag;
        }

    }

}
