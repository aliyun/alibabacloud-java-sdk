// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class UntagResourcesResponseBody extends TeaModel {
    /**
     * <p>The information about the resources from which tags fail to be removed.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If tags are removed from all resources, the value of FailedResources is empty.</p>
     * </li>
     * <li><p>If tags fail to be removed from some or all resources, the value of FailedResources contains the detailed information about the resources.</p>
     * </li>
     * </ul>
     */
    @NameInMap("FailedResources")
    public UntagResourcesResponseBodyFailedResources failedResources;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>43D12436-B10F-4469-8136-FD1C5D2B2083</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UntagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesResponseBody self = new UntagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourcesResponseBody setFailedResources(UntagResourcesResponseBodyFailedResources failedResources) {
        this.failedResources = failedResources;
        return this;
    }
    public UntagResourcesResponseBodyFailedResources getFailedResources() {
        return this.failedResources;
    }

    public UntagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UntagResourcesResponseBodyFailedResourcesFailedResourceResult extends TeaModel {
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

        public static UntagResourcesResponseBodyFailedResourcesFailedResourceResult build(java.util.Map<String, ?> map) throws Exception {
            UntagResourcesResponseBodyFailedResourcesFailedResourceResult self = new UntagResourcesResponseBodyFailedResourcesFailedResourceResult();
            return TeaModel.build(map, self);
        }

        public UntagResourcesResponseBodyFailedResourcesFailedResourceResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UntagResourcesResponseBodyFailedResourcesFailedResourceResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class UntagResourcesResponseBodyFailedResourcesFailedResource extends TeaModel {
        /**
         * <p>The ARN of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:acs:ecs:cn-hangzhou:123456789****:instance/i-xxxxxxxxxx1</p>
         */
        @NameInMap("ResourceARN")
        public String resourceARN;

        /**
         * <p>The information about the error.</p>
         */
        @NameInMap("Result")
        public UntagResourcesResponseBodyFailedResourcesFailedResourceResult result;

        public static UntagResourcesResponseBodyFailedResourcesFailedResource build(java.util.Map<String, ?> map) throws Exception {
            UntagResourcesResponseBodyFailedResourcesFailedResource self = new UntagResourcesResponseBodyFailedResourcesFailedResource();
            return TeaModel.build(map, self);
        }

        public UntagResourcesResponseBodyFailedResourcesFailedResource setResourceARN(String resourceARN) {
            this.resourceARN = resourceARN;
            return this;
        }
        public String getResourceARN() {
            return this.resourceARN;
        }

        public UntagResourcesResponseBodyFailedResourcesFailedResource setResult(UntagResourcesResponseBodyFailedResourcesFailedResourceResult result) {
            this.result = result;
            return this;
        }
        public UntagResourcesResponseBodyFailedResourcesFailedResourceResult getResult() {
            return this.result;
        }

    }

    public static class UntagResourcesResponseBodyFailedResources extends TeaModel {
        @NameInMap("FailedResource")
        public java.util.List<UntagResourcesResponseBodyFailedResourcesFailedResource> failedResource;

        public static UntagResourcesResponseBodyFailedResources build(java.util.Map<String, ?> map) throws Exception {
            UntagResourcesResponseBodyFailedResources self = new UntagResourcesResponseBodyFailedResources();
            return TeaModel.build(map, self);
        }

        public UntagResourcesResponseBodyFailedResources setFailedResource(java.util.List<UntagResourcesResponseBodyFailedResourcesFailedResource> failedResource) {
            this.failedResource = failedResource;
            return this;
        }
        public java.util.List<UntagResourcesResponseBodyFailedResourcesFailedResource> getFailedResource() {
            return this.failedResource;
        }

    }

}
