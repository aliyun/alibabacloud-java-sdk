// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class GenerateMotionShopVideoUploadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateMotionShopVideoUploadUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateMotionShopVideoUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateMotionShopVideoUploadUrlResponseBody self = new GenerateMotionShopVideoUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateMotionShopVideoUploadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateMotionShopVideoUploadUrlResponseBody setData(GenerateMotionShopVideoUploadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateMotionShopVideoUploadUrlResponseBodyData getData() {
        return this.data;
    }

    public GenerateMotionShopVideoUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateMotionShopVideoUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateMotionShopVideoUploadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateMotionShopVideoUploadUrlResponseBodyData extends TeaModel {
        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("UploadUrl")
        public String uploadUrl;

        public static GenerateMotionShopVideoUploadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateMotionShopVideoUploadUrlResponseBodyData self = new GenerateMotionShopVideoUploadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateMotionShopVideoUploadUrlResponseBodyData setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public GenerateMotionShopVideoUploadUrlResponseBodyData setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
