// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetTranslatedFileUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTranslatedFileUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTranslatedFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranslatedFileUrlResponseBody self = new GetTranslatedFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranslatedFileUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTranslatedFileUrlResponseBody setData(GetTranslatedFileUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTranslatedFileUrlResponseBodyData getData() {
        return this.data;
    }

    public GetTranslatedFileUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTranslatedFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTranslatedFileUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTranslatedFileUrlResponseBodyData extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("FileName")
        public String fileName;

        public static GetTranslatedFileUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTranslatedFileUrlResponseBodyData self = new GetTranslatedFileUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTranslatedFileUrlResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetTranslatedFileUrlResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetTranslatedFileUrlResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
