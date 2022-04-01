// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationTaskLogResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetClusterOperationTaskLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationTaskLogResponseBody self = new GetClusterOperationTaskLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationTaskLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetClusterOperationTaskLogResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetClusterOperationTaskLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterOperationTaskLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterOperationTaskLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Data extends TeaModel {
        // result
        @NameInMap("result")
        public String result;

        // stderr
        @NameInMap("stderr")
        public String stderr;

        // stdout
        @NameInMap("stdout")
        public String stdout;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public Data setStderr(String stderr) {
            this.stderr = stderr;
            return this;
        }
        public String getStderr() {
            return this.stderr;
        }

        public Data setStdout(String stdout) {
            this.stdout = stdout;
            return this;
        }
        public String getStdout() {
            return this.stdout;
        }

    }

}
