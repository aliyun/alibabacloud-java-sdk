// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppRagResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateMmAppRagResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateMmAppRagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppRagResponseBody self = new UpdateMmAppRagResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppRagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMmAppRagResponseBody setData(UpdateMmAppRagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMmAppRagResponseBodyData getData() {
        return this.data;
    }

    public UpdateMmAppRagResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateMmAppRagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMmAppRagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMmAppRagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMmAppRagResponseBodyData extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static UpdateMmAppRagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppRagResponseBodyData self = new UpdateMmAppRagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppRagResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
