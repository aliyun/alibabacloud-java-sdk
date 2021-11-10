// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAccountResponseBodyData> data;

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

    public static ListAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountResponseBody self = new ListAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountResponseBody setData(java.util.List<ListAccountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAccountResponseBodyData> getData() {
        return this.data;
    }

    public ListAccountResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAccountResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ListAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAccountResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListAccountResponseBodyData extends TeaModel {
        @NameInMap("Aud")
        public String aud;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Role")
        public String role;

        @NameInMap("UserId")
        public String userId;

        public static ListAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAccountResponseBodyData self = new ListAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAccountResponseBodyData setAud(String aud) {
            this.aud = aud;
            return this;
        }
        public String getAud() {
            return this.aud;
        }

        public ListAccountResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListAccountResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListAccountResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
