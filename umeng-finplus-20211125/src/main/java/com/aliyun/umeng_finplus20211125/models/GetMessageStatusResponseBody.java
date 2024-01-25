// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211125.models;

import com.aliyun.tea.*;

public class GetMessageStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMessageStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMessageStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageStatusResponseBody self = new GetMessageStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMessageStatusResponseBody setData(GetMessageStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMessageStatusResponseBodyData getData() {
        return this.data;
    }

    public GetMessageStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMessageStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMessageStatusResponseBodyData extends TeaModel {
        @NameInMap("mobile")
        public String mobile;

        @NameInMap("requestId")
        public String requestId;

        @NameInMap("status")
        public String status;

        public static GetMessageStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMessageStatusResponseBodyData self = new GetMessageStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMessageStatusResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetMessageStatusResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetMessageStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
