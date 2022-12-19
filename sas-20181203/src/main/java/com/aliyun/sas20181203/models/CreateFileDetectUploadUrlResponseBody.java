// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectUploadUrlResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array consisting of the parameters that are required to upload a file.
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
        // The AccessKey ID that is used to access the OSS bucket.
        @NameInMap("AccessId")
        public String accessId;

        // The key of the file that is used after the file is uploaded to the OSS bucket.
        @NameInMap("OssKey")
        public String ossKey;

        // The policy that poses limits on file upload. For example, the policy limits the size of the file.
        @NameInMap("Policy")
        public String policy;

        // The signature that is used to upload the file.
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
        // The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
        @NameInMap("Code")
        public String code;

        // The signature information.
        @NameInMap("Context")
        public CreateFileDetectUploadUrlResponseBodyUploadUrlListContext context;

        // The timestamp when the values of the parameters expire. Unit: milliseconds.
        @NameInMap("Expire")
        public String expire;

        // Indicates whether the file exists in the cloud. Valid values:
        // 
        // *   **true**: The file exists in the cloud. You do not need to upload the file.
        // *   **false**: The file does not exist in the cloud. You must upload the file.
        @NameInMap("FileExist")
        public Boolean fileExist;

        // The identifier of the file.
        @NameInMap("HashKey")
        public String hashKey;

        // The internal endpoint of the URL to which the file is uploaded.
        @NameInMap("InternalUrl")
        public String internalUrl;

        // The error message returned.
        @NameInMap("Message")
        public String message;

        // The public endpoint of the URL to which the file is uploaded.
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
