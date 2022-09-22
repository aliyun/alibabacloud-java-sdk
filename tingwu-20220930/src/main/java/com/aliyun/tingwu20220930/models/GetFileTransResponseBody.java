// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class GetFileTransResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetFileTransResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFileTransResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileTransResponseBody self = new GetFileTransResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileTransResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFileTransResponseBody setData(GetFileTransResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileTransResponseBodyData getData() {
        return this.data;
    }

    public GetFileTransResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFileTransResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileTransResponseBodyData extends TeaModel {
        @NameInMap("TransId")
        public String transId;

        @NameInMap("TransKey")
        public String transKey;

        @NameInMap("TransStatus")
        public String transStatus;

        public static GetFileTransResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileTransResponseBodyData self = new GetFileTransResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileTransResponseBodyData setTransId(String transId) {
            this.transId = transId;
            return this;
        }
        public String getTransId() {
            return this.transId;
        }

        public GetFileTransResponseBodyData setTransKey(String transKey) {
            this.transKey = transKey;
            return this;
        }
        public String getTransKey() {
            return this.transKey;
        }

        public GetFileTransResponseBodyData setTransStatus(String transStatus) {
            this.transStatus = transStatus;
            return this;
        }
        public String getTransStatus() {
            return this.transStatus;
        }

    }

}
