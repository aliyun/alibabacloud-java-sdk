// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppRagConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateMmAppRagConfigResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateMmAppRagConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppRagConfigResponseBody self = new UpdateMmAppRagConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppRagConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMmAppRagConfigResponseBody setData(UpdateMmAppRagConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMmAppRagConfigResponseBodyData getData() {
        return this.data;
    }

    public UpdateMmAppRagConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateMmAppRagConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMmAppRagConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMmAppRagConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMmAppRagConfigResponseBodyData extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static UpdateMmAppRagConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppRagConfigResponseBodyData self = new UpdateMmAppRagConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppRagConfigResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
