// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class TagResourcesResponseBody extends TeaModel {
    /**
     * <p>The information about the resources to which tags fail to be added.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If tags are added to all resources, the value of <code>FailedResources</code> is empty.</p>
     * </li>
     * <li><p>If tags fail to be added to some or all resources, the value of <code>FailedResources</code> contains the detailed information about the resources.</p>
     * </li>
     * </ul>
     */
    @NameInMap("FailedResources")
    public TagResourcesResponseBodyFailedResources failedResources;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>72086426-9F8C-4A60-852B-864048FD1199</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponseBody self = new TagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourcesResponseBody setFailedResources(TagResourcesResponseBodyFailedResources failedResources) {
        this.failedResources = failedResources;
        return this;
    }
    public TagResourcesResponseBodyFailedResources getFailedResources() {
        return this.failedResources;
    }

    public TagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TagResourcesResponseBodyFailedResourcesFailedResourceResult extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidResourceId.NotFound</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified ResourceIds are not found in our records.</p>
         */
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
        /**
         * <p>The ARN of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:acs:vpc:cn-hangzhou:123456789****:vpc/vpc-bp19dd90tkt6tz7wu****</p>
         */
        @NameInMap("ResourceARN")
        public String resourceARN;

        /**
         * <p>The information about the error.</p>
         */
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
