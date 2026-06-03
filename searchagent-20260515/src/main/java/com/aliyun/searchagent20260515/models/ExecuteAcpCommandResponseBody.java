// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchagent20260515.models;

import com.aliyun.tea.*;

public class ExecuteAcpCommandResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ExecuteAcpCommandResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static ExecuteAcpCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAcpCommandResponseBody self = new ExecuteAcpCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAcpCommandResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteAcpCommandResponseBody setData(ExecuteAcpCommandResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteAcpCommandResponseBodyData getData() {
        return this.data;
    }

    public ExecuteAcpCommandResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteAcpCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExecuteAcpCommandResponseBodyData extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("jsonrpc")
        public String jsonrpc;

        @NameInMap("requestId")
        public String requestId;

        @NameInMap("result")
        public java.util.Map<String, ?> result;

        @NameInMap("timestamp")
        public Long timestamp;

        public static ExecuteAcpCommandResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAcpCommandResponseBodyData self = new ExecuteAcpCommandResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteAcpCommandResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ExecuteAcpCommandResponseBodyData setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public ExecuteAcpCommandResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ExecuteAcpCommandResponseBodyData setResult(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }
        public java.util.Map<String, ?> getResult() {
            return this.result;
        }

        public ExecuteAcpCommandResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
