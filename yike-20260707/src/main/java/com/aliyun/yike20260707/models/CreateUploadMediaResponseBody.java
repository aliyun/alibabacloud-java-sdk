// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateUploadMediaResponseBody extends TeaModel {
    /**
     * <p>The unsigned OSS URL of the file in the <code>oss://bucket/objectKey</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://yike-shared-ap-southeast-1-1/yike-v1/gi3dkn-gi3dkn/2026-11-18/08/video/b7e94fc0e1bf71f1bfa2f6e7c5486601aB3xYz01.mp4</p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>The media asset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b7e94fc0e*****6e7c5486601</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The OSS object key in the <code>yike-v1/uid segment-ws segment/date/hour/type/mediaId+random string+source suffix.file name extension</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>yike-v1/gi3dkn-gi3dkn/2026-11-18/08/video/b7e94fc0e1bf71f1bfa2f6e7c5486601aB3xYz01.mp4</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B4C2E10-3F5A-4D6B-8C7D-1E2F3A4B5C6D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The storage location identifier in the <code>bucket.endpoint</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The expiration time of the ticket in UTC and ISO 8601 format. This field is returned when <code>UPLOAD_TICKET</code> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-18T12:00:00Z</p>
     */
    @NameInMap("TicketExpiration")
    public String ticketExpiration;

    /**
     * <p>The upload credentials. Some fields may be empty depending on the <code>CredentialType</code>.</p>
     */
    @NameInMap("UploadCredentials")
    public CreateUploadMediaResponseBodyUploadCredentials uploadCredentials;

    /**
     * <p>The upload ticket. This field is returned when <code>UPLOAD_TICKET</code> is used. It is a 27-character string in the UT1+region code+random string+check digit format. A real credential is issued based on this ticket during a ticket exchange.</p>
     * 
     * <strong>example:</strong>
     * <p>UT1SGK7M2QX9R4T6V8W0Y3Z5ABC</p>
     */
    @NameInMap("UploadTicket")
    public String uploadTicket;

    public static CreateUploadMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadMediaResponseBody self = new CreateUploadMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUploadMediaResponseBody setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public CreateUploadMediaResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public CreateUploadMediaResponseBody setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public CreateUploadMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadMediaResponseBody setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public CreateUploadMediaResponseBody setTicketExpiration(String ticketExpiration) {
        this.ticketExpiration = ticketExpiration;
        return this;
    }
    public String getTicketExpiration() {
        return this.ticketExpiration;
    }

    public CreateUploadMediaResponseBody setUploadCredentials(CreateUploadMediaResponseBodyUploadCredentials uploadCredentials) {
        this.uploadCredentials = uploadCredentials;
        return this;
    }
    public CreateUploadMediaResponseBodyUploadCredentials getUploadCredentials() {
        return this.uploadCredentials;
    }

    public CreateUploadMediaResponseBody setUploadTicket(String uploadTicket) {
        this.uploadTicket = uploadTicket;
        return this;
    }
    public String getUploadTicket() {
        return this.uploadTicket;
    }

    public static class CreateUploadMediaResponseBodyUploadCredentials extends TeaModel {
        /**
         * <p>The temporary STS AccessKey ID. This field is returned when <code>STS_TOKEN</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NUgYrLnoC63mLqWeRtYuIoPaSdF</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The temporary STS AccessKey secret. This field is returned when <code>STS_TOKEN</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>CVwjCkNzTMupZ8nRtYeXwQaBcDfGhIjK</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The OSS bucket. This field is returned when <code>STS_TOKEN</code>, <code>POST_POLICY</code>, or <code>PRESIGNED_URL</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>yike-shared-ap-southeast-1-1</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The expiration time of the credential in UTC and ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-18T12:00:00Z</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        /**
         * <p>The Base64-encoded PostObject policy. This field is returned when <code>POST_POLICY</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNi0xMS0xOFQxMjowMDowMFoiLCJjb25kaXRpb25zIjpbXX0=</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The AccessKey ID used for the signature. This field is returned when <code>POST_POLICY</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI5tG8XkQmP2vR9wYzAbCd</p>
         */
        @NameInMap("PostAccessKeyId")
        public String postAccessKeyId;

        /**
         * <p>The destination endpoint for the POST request. This field is returned when <code>POST_POLICY</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com">https://yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com</a></p>
         */
        @NameInMap("PostEndpoint")
        public String postEndpoint;

        /**
         * <p>The OSS region. This field is returned in all three credential modes.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The STS security token. This field is returned when <code>STS_TOKEN</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>CAISjgJ1q6Ft5B2yfSjIr5DDEOTM2pZ6g7oIExampleToken</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>The PostObject signature. This field is returned when <code>POST_POLICY</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>vXkQ9dRt2mLpN8sYwZaBcDfEgHj=</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>The pre-signed PUT URL. This field is returned when <code>PRESIGNED_URL</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com/yike-v1/.../demo.mp4?Expires=1763467200&OSSAccessKeyId=STS.xxx&Signature=xxx">https://yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com/yike-v1/.../demo.mp4?Expires=1763467200&amp;OSSAccessKeyId=STS.xxx&amp;Signature=xxx</a></p>
         */
        @NameInMap("SignedUrl")
        public String signedUrl;

        public static CreateUploadMediaResponseBodyUploadCredentials build(java.util.Map<String, ?> map) throws Exception {
            CreateUploadMediaResponseBodyUploadCredentials self = new CreateUploadMediaResponseBodyUploadCredentials();
            return TeaModel.build(map, self);
        }

        public CreateUploadMediaResponseBodyUploadCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public CreateUploadMediaResponseBodyUploadCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public CreateUploadMediaResponseBodyUploadCredentials setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CreateUploadMediaResponseBodyUploadCredentials setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public CreateUploadMediaResponseBodyUploadCredentials setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateUploadMediaResponseBodyUploadCredentials setPostAccessKeyId(String postAccessKeyId) {
            this.postAccessKeyId = postAccessKeyId;
            return this;
        }
        public String getPostAccessKeyId() {
            return this.postAccessKeyId;
        }

        public CreateUploadMediaResponseBodyUploadCredentials setPostEndpoint(String postEndpoint) {
            this.postEndpoint = postEndpoint;
            return this;
        }
        public String getPostEndpoint() {
            return this.postEndpoint;
        }

        public CreateUploadMediaResponseBodyUploadCredentials setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateUploadMediaResponseBodyUploadCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public CreateUploadMediaResponseBodyUploadCredentials setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public CreateUploadMediaResponseBodyUploadCredentials setSignedUrl(String signedUrl) {
            this.signedUrl = signedUrl;
            return this;
        }
        public String getSignedUrl() {
            return this.signedUrl;
        }

    }

}
