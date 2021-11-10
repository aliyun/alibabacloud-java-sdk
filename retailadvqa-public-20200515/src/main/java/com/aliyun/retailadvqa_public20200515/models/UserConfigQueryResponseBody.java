// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class UserConfigQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public UserConfigQueryResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static UserConfigQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserConfigQueryResponseBody self = new UserConfigQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public UserConfigQueryResponseBody setData(UserConfigQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UserConfigQueryResponseBodyData getData() {
        return this.data;
    }

    public UserConfigQueryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UserConfigQueryResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public UserConfigQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UserConfigQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UserConfigQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UserConfigQueryResponseBodyData extends TeaModel {
        @NameInMap("Language")
        public String language;

        @NameInMap("Theme")
        public Long theme;

        public static UserConfigQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UserConfigQueryResponseBodyData self = new UserConfigQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UserConfigQueryResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public UserConfigQueryResponseBodyData setTheme(Long theme) {
            this.theme = theme;
            return this;
        }
        public Long getTheme() {
            return this.theme;
        }

    }

}
