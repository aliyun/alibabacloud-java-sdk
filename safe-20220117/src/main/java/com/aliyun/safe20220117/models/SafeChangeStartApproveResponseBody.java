// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeStartApproveResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SafeChangeStartApproveResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SafeChangeStartApproveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeStartApproveResponseBody self = new SafeChangeStartApproveResponseBody();
        return TeaModel.build(map, self);
    }

    public SafeChangeStartApproveResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SafeChangeStartApproveResponseBody setData(SafeChangeStartApproveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SafeChangeStartApproveResponseBodyData getData() {
        return this.data;
    }

    public SafeChangeStartApproveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SafeChangeStartApproveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SafeChangeStartApproveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SafeChangeStartApproveResponseBodyData extends TeaModel {
        @NameInMap("ApproveStatus")
        public String approveStatus;

        public static SafeChangeStartApproveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeStartApproveResponseBodyData self = new SafeChangeStartApproveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SafeChangeStartApproveResponseBodyData setApproveStatus(String approveStatus) {
            this.approveStatus = approveStatus;
            return this;
        }
        public String getApproveStatus() {
            return this.approveStatus;
        }

    }

}
