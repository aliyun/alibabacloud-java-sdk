// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddTerminalsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<AddTerminalsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddTerminalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTerminalsResponseBody self = new AddTerminalsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTerminalsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddTerminalsResponseBody setData(java.util.List<AddTerminalsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddTerminalsResponseBodyData> getData() {
        return this.data;
    }

    public AddTerminalsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddTerminalsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddTerminalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTerminalsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddTerminalsResponseBodyData extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("SerialNumber")
        public String serialNumber;

        public static AddTerminalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddTerminalsResponseBodyData self = new AddTerminalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddTerminalsResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AddTerminalsResponseBodyData setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

    }

}
