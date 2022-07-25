// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSourcePackStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetSourcePackStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Url")
    public String url;

    public static GetSourcePackStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSourcePackStatusResponseBody self = new GetSourcePackStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSourcePackStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSourcePackStatusResponseBody setData(GetSourcePackStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSourcePackStatusResponseBodyData getData() {
        return this.data;
    }

    public GetSourcePackStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSourcePackStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSourcePackStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSourcePackStatusResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class GetSourcePackStatusResponseBodyData extends TeaModel {
        @NameInMap("Progress")
        public Long progress;

        @NameInMap("Status")
        public String status;

        public static GetSourcePackStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSourcePackStatusResponseBodyData self = new GetSourcePackStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSourcePackStatusResponseBodyData setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public GetSourcePackStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
