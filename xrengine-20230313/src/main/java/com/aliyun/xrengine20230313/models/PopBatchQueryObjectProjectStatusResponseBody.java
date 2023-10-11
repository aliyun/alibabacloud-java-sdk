// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBatchQueryObjectProjectStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<PopBatchQueryObjectProjectStatusResponseBodyData> data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopBatchQueryObjectProjectStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopBatchQueryObjectProjectStatusResponseBody self = new PopBatchQueryObjectProjectStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public PopBatchQueryObjectProjectStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopBatchQueryObjectProjectStatusResponseBody setData(java.util.List<PopBatchQueryObjectProjectStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopBatchQueryObjectProjectStatusResponseBodyData> getData() {
        return this.data;
    }

    public PopBatchQueryObjectProjectStatusResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public PopBatchQueryObjectProjectStatusResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public PopBatchQueryObjectProjectStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopBatchQueryObjectProjectStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopBatchQueryObjectProjectStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopBatchQueryObjectProjectStatusResponseBodyData extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("Id")
        public String id;

        @NameInMap("Status")
        public String status;

        public static PopBatchQueryObjectProjectStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopBatchQueryObjectProjectStatusResponseBodyData self = new PopBatchQueryObjectProjectStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopBatchQueryObjectProjectStatusResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopBatchQueryObjectProjectStatusResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopBatchQueryObjectProjectStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
