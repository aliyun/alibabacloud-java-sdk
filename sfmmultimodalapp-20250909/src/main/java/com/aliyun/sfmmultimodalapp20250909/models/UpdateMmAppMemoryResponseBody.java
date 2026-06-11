// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppMemoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateMmAppMemoryResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateMmAppMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppMemoryResponseBody self = new UpdateMmAppMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMmAppMemoryResponseBody setData(UpdateMmAppMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMmAppMemoryResponseBodyData getData() {
        return this.data;
    }

    public UpdateMmAppMemoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateMmAppMemoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMmAppMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMmAppMemoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMmAppMemoryResponseBodyData extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static UpdateMmAppMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppMemoryResponseBodyData self = new UpdateMmAppMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppMemoryResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
