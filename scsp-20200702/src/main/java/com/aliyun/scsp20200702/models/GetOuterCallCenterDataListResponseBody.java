// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetOuterCallCenterDataListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOuterCallCenterDataListResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOuterCallCenterDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOuterCallCenterDataListResponseBody self = new GetOuterCallCenterDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOuterCallCenterDataListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOuterCallCenterDataListResponseBody setData(java.util.List<GetOuterCallCenterDataListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOuterCallCenterDataListResponseBodyData> getData() {
        return this.data;
    }

    public GetOuterCallCenterDataListResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOuterCallCenterDataListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOuterCallCenterDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOuterCallCenterDataListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOuterCallCenterDataListResponseBodyData extends TeaModel {
        @NameInMap("Acid")
        public String acid;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("CallType")
        public String callType;

        @NameInMap("EndReason")
        public String endReason;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("FromPhoneNum")
        public String fromPhoneNum;

        @NameInMap("InterveneTime")
        public String interveneTime;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("ToPhoneNum")
        public String toPhoneNum;

        @NameInMap("UserInfo")
        public String userInfo;

        public static GetOuterCallCenterDataListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOuterCallCenterDataListResponseBodyData self = new GetOuterCallCenterDataListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOuterCallCenterDataListResponseBodyData setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public GetOuterCallCenterDataListResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetOuterCallCenterDataListResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetOuterCallCenterDataListResponseBodyData setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public GetOuterCallCenterDataListResponseBodyData setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public GetOuterCallCenterDataListResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public GetOuterCallCenterDataListResponseBodyData setFromPhoneNum(String fromPhoneNum) {
            this.fromPhoneNum = fromPhoneNum;
            return this;
        }
        public String getFromPhoneNum() {
            return this.fromPhoneNum;
        }

        public GetOuterCallCenterDataListResponseBodyData setInterveneTime(String interveneTime) {
            this.interveneTime = interveneTime;
            return this;
        }
        public String getInterveneTime() {
            return this.interveneTime;
        }

        public GetOuterCallCenterDataListResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetOuterCallCenterDataListResponseBodyData setToPhoneNum(String toPhoneNum) {
            this.toPhoneNum = toPhoneNum;
            return this;
        }
        public String getToPhoneNum() {
            return this.toPhoneNum;
        }

        public GetOuterCallCenterDataListResponseBodyData setUserInfo(String userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public String getUserInfo() {
            return this.userInfo;
        }

    }

}
