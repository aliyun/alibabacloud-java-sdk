// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeStartResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SafeChangeStartResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SafeChangeStartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeStartResponseBody self = new SafeChangeStartResponseBody();
        return TeaModel.build(map, self);
    }

    public SafeChangeStartResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SafeChangeStartResponseBody setData(SafeChangeStartResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SafeChangeStartResponseBodyData getData() {
        return this.data;
    }

    public SafeChangeStartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SafeChangeStartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SafeChangeStartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SafeChangeStartResponseBodyData extends TeaModel {
        @NameInMap("ApproveResultUrl")
        public String approveResultUrl;

        @NameInMap("CheckResultUrl")
        public String checkResultUrl;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubSatus")
        public String subSatus;

        public static SafeChangeStartResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeStartResponseBodyData self = new SafeChangeStartResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SafeChangeStartResponseBodyData setApproveResultUrl(String approveResultUrl) {
            this.approveResultUrl = approveResultUrl;
            return this;
        }
        public String getApproveResultUrl() {
            return this.approveResultUrl;
        }

        public SafeChangeStartResponseBodyData setCheckResultUrl(String checkResultUrl) {
            this.checkResultUrl = checkResultUrl;
            return this;
        }
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

        public SafeChangeStartResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SafeChangeStartResponseBodyData setSubSatus(String subSatus) {
            this.subSatus = subSatus;
            return this;
        }
        public String getSubSatus() {
            return this.subSatus;
        }

    }

}
