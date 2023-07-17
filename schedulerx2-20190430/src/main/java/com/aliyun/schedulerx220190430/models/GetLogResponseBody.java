// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetLogResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetLogResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogResponseBody self = new GetLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLogResponseBody setData(GetLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLogResponseBodyData getData() {
        return this.data;
    }

    public GetLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLogResponseBodyData extends TeaModel {
        /**
         * <p>The logs. The value is an array of strings.</p>
         */
        @NameInMap("Logs")
        public java.util.List<String> logs;

        public static GetLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLogResponseBodyData self = new GetLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLogResponseBodyData setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

    }

}
