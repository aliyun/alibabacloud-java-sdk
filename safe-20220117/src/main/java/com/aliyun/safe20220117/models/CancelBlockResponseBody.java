// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CancelBlockResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CancelBlockResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CancelBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelBlockResponseBody self = new CancelBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelBlockResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CancelBlockResponseBody setData(CancelBlockResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelBlockResponseBodyData getData() {
        return this.data;
    }

    public CancelBlockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelBlockResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelBlockResponseBodyData extends TeaModel {
        @NameInMap("ApproveInstanceId")
        public String approveInstanceId;

        @NameInMap("Success")
        public Boolean success;

        public static CancelBlockResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelBlockResponseBodyData self = new CancelBlockResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelBlockResponseBodyData setApproveInstanceId(String approveInstanceId) {
            this.approveInstanceId = approveInstanceId;
            return this;
        }
        public String getApproveInstanceId() {
            return this.approveInstanceId;
        }

        public CancelBlockResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
