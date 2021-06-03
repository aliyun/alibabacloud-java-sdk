// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class TagResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FailedResources")
    public TagResourcesResponseBodyFailedResources failedResources;

    public static TagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponseBody self = new TagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TagResourcesResponseBody setFailedResources(TagResourcesResponseBodyFailedResources failedResources) {
        this.failedResources = failedResources;
        return this;
    }
    public TagResourcesResponseBodyFailedResources getFailedResources() {
        return this.failedResources;
    }

    public static class ListTagResourcesResponseBodyTagResourcesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Category")
        public String category;

        public static ListTagResourcesResponseBodyTagResourcesTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResourcesTags self = new ListTagResourcesResponseBodyTagResourcesTags();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResourcesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesResponseBodyTagResourcesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListTagResourcesResponseBodyTagResourcesTags setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        @NameInMap("ResourceARN")
        public String resourceARN;

        @NameInMap("Tags")
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTags> tags;

        public static ListTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResources self = new ListTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResources setResourceARN(String resourceARN) {
            this.resourceARN = resourceARN;
            return this;
        }
        public String getResourceARN() {
            return this.resourceARN;
        }

        public ListTagResourcesResponseBodyTagResources setTags(java.util.List<ListTagResourcesResponseBodyTagResourcesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTags> getTags() {
            return this.tags;
        }

    }

    public static class TagResourcesResponseBodyFailedResourcesFailedResourceResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        public static TagResourcesResponseBodyFailedResourcesFailedResourceResult build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesResponseBodyFailedResourcesFailedResourceResult self = new TagResourcesResponseBodyFailedResourcesFailedResourceResult();
            return TeaModel.build(map, self);
        }

        public TagResourcesResponseBodyFailedResourcesFailedResourceResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public TagResourcesResponseBodyFailedResourcesFailedResourceResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class TagResourcesResponseBodyFailedResourcesFailedResource extends TeaModel {
        @NameInMap("ResourceARN")
        public String resourceARN;

        @NameInMap("Result")
        public TagResourcesResponseBodyFailedResourcesFailedResourceResult result;

        public static TagResourcesResponseBodyFailedResourcesFailedResource build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesResponseBodyFailedResourcesFailedResource self = new TagResourcesResponseBodyFailedResourcesFailedResource();
            return TeaModel.build(map, self);
        }

        public TagResourcesResponseBodyFailedResourcesFailedResource setResourceARN(String resourceARN) {
            this.resourceARN = resourceARN;
            return this;
        }
        public String getResourceARN() {
            return this.resourceARN;
        }

        public TagResourcesResponseBodyFailedResourcesFailedResource setResult(TagResourcesResponseBodyFailedResourcesFailedResourceResult result) {
            this.result = result;
            return this;
        }
        public TagResourcesResponseBodyFailedResourcesFailedResourceResult getResult() {
            return this.result;
        }

    }

    public static class TagResourcesResponseBodyFailedResources extends TeaModel {
        @NameInMap("FailedResource")
        public java.util.List<TagResourcesResponseBodyFailedResourcesFailedResource> failedResource;

        public static TagResourcesResponseBodyFailedResources build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesResponseBodyFailedResources self = new TagResourcesResponseBodyFailedResources();
            return TeaModel.build(map, self);
        }

        public TagResourcesResponseBodyFailedResources setFailedResource(java.util.List<TagResourcesResponseBodyFailedResourcesFailedResource> failedResource) {
            this.failedResource = failedResource;
            return this;
        }
        public java.util.List<TagResourcesResponseBodyFailedResourcesFailedResource> getFailedResource() {
            return this.failedResource;
        }

    }

}
