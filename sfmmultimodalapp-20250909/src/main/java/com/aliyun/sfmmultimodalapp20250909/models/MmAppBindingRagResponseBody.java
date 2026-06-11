// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class MmAppBindingRagResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MmAppBindingRagResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MmAppBindingRagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MmAppBindingRagResponseBody self = new MmAppBindingRagResponseBody();
        return TeaModel.build(map, self);
    }

    public MmAppBindingRagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MmAppBindingRagResponseBody setData(MmAppBindingRagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MmAppBindingRagResponseBodyData getData() {
        return this.data;
    }

    public MmAppBindingRagResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public MmAppBindingRagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MmAppBindingRagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MmAppBindingRagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MmAppBindingRagResponseBodyData extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static MmAppBindingRagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MmAppBindingRagResponseBodyData self = new MmAppBindingRagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MmAppBindingRagResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
