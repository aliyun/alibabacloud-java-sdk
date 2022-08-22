// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectUploadUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public String policy;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("Context")
        public CreateFileDetectUploadUrlResponseBodyUploadUrlListContext context;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("FileExist")
        public Boolean fileExist;

        @NameInMap("HashKey")
        public String hashKey;

        @NameInMap("InternalUrl")
        public String internalUrl;

        @NameInMap("Message")
        public String message;

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
