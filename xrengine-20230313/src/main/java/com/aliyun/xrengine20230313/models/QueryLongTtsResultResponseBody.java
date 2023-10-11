// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class QueryLongTtsResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryLongTtsResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryLongTtsResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLongTtsResultResponseBody self = new QueryLongTtsResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLongTtsResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLongTtsResultResponseBody setData(QueryLongTtsResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLongTtsResultResponseBodyData getData() {
        return this.data;
    }

    public QueryLongTtsResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLongTtsResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLongTtsResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryLongTtsResultResponseBodyData extends TeaModel {
        @NameInMap("AudioUrl")
        public String audioUrl;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Status")
        public String status;

        public static QueryLongTtsResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLongTtsResultResponseBodyData self = new QueryLongTtsResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLongTtsResultResponseBodyData setAudioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
            return this;
        }
        public String getAudioUrl() {
            return this.audioUrl;
        }

        public QueryLongTtsResultResponseBodyData setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public QueryLongTtsResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
