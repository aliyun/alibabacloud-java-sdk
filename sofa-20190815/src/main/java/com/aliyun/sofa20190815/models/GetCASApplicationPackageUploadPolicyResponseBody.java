// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASApplicationPackageUploadPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetCASApplicationPackageUploadPolicyResponseBodyData data;

    public static GetCASApplicationPackageUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCASApplicationPackageUploadPolicyResponseBody self = new GetCASApplicationPackageUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCASApplicationPackageUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCASApplicationPackageUploadPolicyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCASApplicationPackageUploadPolicyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetCASApplicationPackageUploadPolicyResponseBody setData(GetCASApplicationPackageUploadPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCASApplicationPackageUploadPolicyResponseBodyData getData() {
        return this.data;
    }

    public static class GetCASApplicationPackageUploadPolicyResponseBodyData extends TeaModel {
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

        public static GetCASApplicationPackageUploadPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationPackageUploadPolicyResponseBodyData self = new GetCASApplicationPackageUploadPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationPackageUploadPolicyResponseBodyData setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetCASApplicationPackageUploadPolicyResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetCASApplicationPackageUploadPolicyResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetCASApplicationPackageUploadPolicyResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetCASApplicationPackageUploadPolicyResponseBodyData setPathPrefix(String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }
        public String getPathPrefix() {
            return this.pathPrefix;
        }

        public GetCASApplicationPackageUploadPolicyResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetCASApplicationPackageUploadPolicyResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
