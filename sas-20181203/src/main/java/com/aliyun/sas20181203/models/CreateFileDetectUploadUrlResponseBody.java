// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectUploadUrlResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the parameters that are required to upload a file.</p>
     */
    @NameInMap("UploadUrlList")
    public java.util.List<CreateFileDetectUploadUrlResponseBodyUploadUrlList> uploadUrlList;

    public static CreateFileDetectUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDetectUploadUrlResponseBody self = new CreateFileDetectUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileDetectUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFileDetectUploadUrlResponseBody setUploadUrlList(java.util.List<CreateFileDetectUploadUrlResponseBodyUploadUrlList> uploadUrlList) {
        this.uploadUrlList = uploadUrlList;
        return this;
    }
    public java.util.List<CreateFileDetectUploadUrlResponseBodyUploadUrlList> getUploadUrlList() {
        return this.uploadUrlList;
    }

    public static class CreateFileDetectUploadUrlResponseBodyUploadUrlListContext extends TeaModel {
        /**
         * <p>The AccessKey ID that is used to access the OSS bucket.</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <p>The key of the file that is used after the file is uploaded to the OSS bucket.</p>
         */
        @NameInMap("OssKey")
        public String ossKey;

        /**
         * <p>The policy that poses limits on file upload. For example, the policy can limit the size of the file.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The signature that is used to upload the file.</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static CreateFileDetectUploadUrlResponseBodyUploadUrlListContext build(java.util.Map<String, ?> map) throws Exception {
            CreateFileDetectUploadUrlResponseBodyUploadUrlListContext self = new CreateFileDetectUploadUrlResponseBodyUploadUrlListContext();
            return TeaModel.build(map, self);
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlListContext setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlListContext setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlListContext setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlListContext setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class CreateFileDetectUploadUrlResponseBodyUploadUrlList extends TeaModel {
        /**
         * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The signature information.</p>
         */
        @NameInMap("Context")
        public CreateFileDetectUploadUrlResponseBodyUploadUrlListContext context;

        /**
         * <p>The timestamp when the values of the parameters expire. Unit: milliseconds.</p>
         */
        @NameInMap("Expire")
        public String expire;

        /**
         * <p>Indicates whether the file exists in the cloud. Valid values:</p>
         * <br>
         * <p>*   **true**: The file exists in the cloud. You do not need to upload the file.</p>
         * <p>*   **false**: The file does not exist in the cloud. You must upload the file.</p>
         */
        @NameInMap("FileExist")
        public Boolean fileExist;

        /**
         * <p>The identifier of the file.</p>
         */
        @NameInMap("HashKey")
        public String hashKey;

        /**
         * <p>The internal endpoint of the URL to which the file is uploaded.</p>
         */
        @NameInMap("InternalUrl")
        public String internalUrl;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The public endpoint of the URL to which the file is uploaded.</p>
         */
        @NameInMap("PublicUrl")
        public String publicUrl;

        public static CreateFileDetectUploadUrlResponseBodyUploadUrlList build(java.util.Map<String, ?> map) throws Exception {
            CreateFileDetectUploadUrlResponseBodyUploadUrlList self = new CreateFileDetectUploadUrlResponseBodyUploadUrlList();
            return TeaModel.build(map, self);
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlList setContext(CreateFileDetectUploadUrlResponseBodyUploadUrlListContext context) {
            this.context = context;
            return this;
        }
        public CreateFileDetectUploadUrlResponseBodyUploadUrlListContext getContext() {
            return this.context;
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlList setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlList setFileExist(Boolean fileExist) {
            this.fileExist = fileExist;
            return this;
        }
        public Boolean getFileExist() {
            return this.fileExist;
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlList setHashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }
        public String getHashKey() {
            return this.hashKey;
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlList setInternalUrl(String internalUrl) {
            this.internalUrl = internalUrl;
            return this;
        }
        public String getInternalUrl() {
            return this.internalUrl;
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateFileDetectUploadUrlResponseBodyUploadUrlList setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

    }

}
