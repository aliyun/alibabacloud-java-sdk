// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetOriginalFileUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOriginalFileUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOriginalFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOriginalFileUrlResponseBody self = new GetOriginalFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOriginalFileUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOriginalFileUrlResponseBody setData(GetOriginalFileUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOriginalFileUrlResponseBodyData getData() {
        return this.data;
    }

    public GetOriginalFileUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOriginalFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOriginalFileUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOriginalFileUrlResponseBodyData extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("FileName")
        public String fileName;

        public static GetOriginalFileUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOriginalFileUrlResponseBodyData self = new GetOriginalFileUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOriginalFileUrlResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetOriginalFileUrlResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetOriginalFileUrlResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
