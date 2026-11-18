// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateOssUploadResponseBody extends TeaModel {
    /**
     * <p>OSS ObjectKey</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    /**
     * <p>The <strong>OSS presigned GET URL</strong>, which is valid for 24 hours and uses the public endpoint. If signature generation fails, null is returned, which does not affect direct upload with the credentials.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://yike-shared-pre-2.oss-cn-shanghai.aliyuncs.com/yike-v1/ge2tqn-o5zv6m/2026/11/18/13/upload/media/hkyo9v003.mp4?Expires=1795095160&OSSAccessKeyId=STS.Nxxxxxxxxxxxxxxxxxxxxxxxx&Signature=xxxxxxxxxxx%3D">https://yike-shared-pre-2.oss-cn-shanghai.aliyuncs.com/yike-v1/ge2tqn-o5zv6m/2026/11/18/13/upload/media/hkyo9v003.mp4?Expires=1795095160&amp;OSSAccessKeyId=STS.Nxxxxxxxxxxxxxxxxxxxxxxxx&amp;Signature=xxxxxxxxxxx%3D</a></p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    /**
     * <p>The <strong>request ID</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>F99F2AE5-***-BBD18F101455</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload credentials. Some fields may be empty depending on the CredentialType.</p>
     */
    @NameInMap("UploadCredentials")
    public CreateOssUploadResponseBodyUploadCredentials uploadCredentials;

    public static CreateOssUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOssUploadResponseBody self = new CreateOssUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOssUploadResponseBody setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public CreateOssUploadResponseBody setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public CreateOssUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOssUploadResponseBody setUploadCredentials(CreateOssUploadResponseBodyUploadCredentials uploadCredentials) {
        this.uploadCredentials = uploadCredentials;
        return this;
    }
    public CreateOssUploadResponseBodyUploadCredentials getUploadCredentials() {
        return this.uploadCredentials;
    }

    public static class CreateOssUploadResponseBodyUploadCredentials extends TeaModel {
        /**
         * <p>The STS temporary AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.Nxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The STS temporary AccessKey secret.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>OSS Bucket</p>
         * 
         * <strong>example:</strong>
         * <p>yike-shared-cn-shanghai-1</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The expiration time of the credentials. The time is in UTC and follows the ISO 8601 standard. The actual return value prevails.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-20T01:32:40Z</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        /**
         * <p>The PostObject policy, which is Base64-encoded. This field is returned when POST_POLICY is used.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The AccessKey ID used for signing. This field is returned when POST_POLICY is used.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PostAccessKeyId")
        public String postAccessKeyId;

        /**
         * <p>The destination endpoint for POST requests. This field is returned when POST_POLICY is used.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PostEndpoint")
        public String postEndpoint;

        /**
         * <p>The OSS region, such as cn-shanghai.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The STS security token.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>The PostObject signature. This field is returned when POST_POLICY is used.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>The presigned PUT URL. This field is returned when PRESIGNED_URL is used.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SignedUrl")
        public String signedUrl;

        public static CreateOssUploadResponseBodyUploadCredentials build(java.util.Map<String, ?> map) throws Exception {
            CreateOssUploadResponseBodyUploadCredentials self = new CreateOssUploadResponseBodyUploadCredentials();
            return TeaModel.build(map, self);
        }

        public CreateOssUploadResponseBodyUploadCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public CreateOssUploadResponseBodyUploadCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public CreateOssUploadResponseBodyUploadCredentials setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CreateOssUploadResponseBodyUploadCredentials setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public CreateOssUploadResponseBodyUploadCredentials setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateOssUploadResponseBodyUploadCredentials setPostAccessKeyId(String postAccessKeyId) {
            this.postAccessKeyId = postAccessKeyId;
            return this;
        }
        public String getPostAccessKeyId() {
            return this.postAccessKeyId;
        }

        public CreateOssUploadResponseBodyUploadCredentials setPostEndpoint(String postEndpoint) {
            this.postEndpoint = postEndpoint;
            return this;
        }
        public String getPostEndpoint() {
            return this.postEndpoint;
        }

        public CreateOssUploadResponseBodyUploadCredentials setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateOssUploadResponseBodyUploadCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public CreateOssUploadResponseBodyUploadCredentials setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public CreateOssUploadResponseBodyUploadCredentials setSignedUrl(String signedUrl) {
            this.signedUrl = signedUrl;
            return this;
        }
        public String getSignedUrl() {
            return this.signedUrl;
        }

    }

}
