// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetVersionDownloadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetVersionDownloadUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVersionDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVersionDownloadUrlResponseBody self = new GetVersionDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVersionDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVersionDownloadUrlResponseBody setData(GetVersionDownloadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVersionDownloadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetVersionDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVersionDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVersionDownloadUrlResponseBodyData extends TeaModel {
        @NameInMap("FullDownloadUrl")
        public String fullDownloadUrl;

        public static GetVersionDownloadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVersionDownloadUrlResponseBodyData self = new GetVersionDownloadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVersionDownloadUrlResponseBodyData setFullDownloadUrl(String fullDownloadUrl) {
            this.fullDownloadUrl = fullDownloadUrl;
            return this;
        }
        public String getFullDownloadUrl() {
            return this.fullDownloadUrl;
        }

    }

}
