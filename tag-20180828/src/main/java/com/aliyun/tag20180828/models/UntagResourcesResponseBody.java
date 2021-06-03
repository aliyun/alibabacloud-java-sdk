// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class UntagResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FailedResources")
    public UntagResourcesResponseBodyFailedResources failedResources;

    public static UntagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesResponseBody self = new UntagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UntagResourcesResponseBody setFailedResources(UntagResourcesResponseBodyFailedResources failedResources) {
        this.failedResources = failedResources;
        return this;
    }
    public UntagResourcesResponseBodyFailedResources getFailedResources() {
        return this.failedResources;
    }

    public static class UntagResourcesResponseBodyFailedResourcesFailedResourceResult extends TeaModel {
        @NameInMap("Code")
        public String code;

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
        @NameInMap("ResourceARN")
        public String resourceARN;

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
