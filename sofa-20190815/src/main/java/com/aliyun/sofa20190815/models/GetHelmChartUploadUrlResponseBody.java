// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHelmChartUploadUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UploadPolicy")
    public GetHelmChartUploadUrlResponseBodyUploadPolicy uploadPolicy;

    public static GetHelmChartUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHelmChartUploadUrlResponseBody self = new GetHelmChartUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHelmChartUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHelmChartUploadUrlResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHelmChartUploadUrlResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHelmChartUploadUrlResponseBody setUploadPolicy(GetHelmChartUploadUrlResponseBodyUploadPolicy uploadPolicy) {
        this.uploadPolicy = uploadPolicy;
        return this;
    }
    public GetHelmChartUploadUrlResponseBodyUploadPolicy getUploadPolicy() {
        return this.uploadPolicy;
    }

    public static class GetHelmChartUploadUrlResponseBodyUploadPolicy extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("PathPrefix")
        public String pathPrefix;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static GetHelmChartUploadUrlResponseBodyUploadPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetHelmChartUploadUrlResponseBodyUploadPolicy self = new GetHelmChartUploadUrlResponseBodyUploadPolicy();
            return TeaModel.build(map, self);
        }

        public GetHelmChartUploadUrlResponseBodyUploadPolicy setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetHelmChartUploadUrlResponseBodyUploadPolicy setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetHelmChartUploadUrlResponseBodyUploadPolicy setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetHelmChartUploadUrlResponseBodyUploadPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetHelmChartUploadUrlResponseBodyUploadPolicy setPathPrefix(String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }
        public String getPathPrefix() {
            return this.pathPrefix;
        }

        public GetHelmChartUploadUrlResponseBodyUploadPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetHelmChartUploadUrlResponseBodyUploadPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
