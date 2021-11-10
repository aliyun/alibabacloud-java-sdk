// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SaveExternalAudienceResponseBody extends TeaModel {
    @NameInMap("Data")
    public SaveExternalAudienceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static SaveExternalAudienceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveExternalAudienceResponseBody self = new SaveExternalAudienceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveExternalAudienceResponseBody setData(SaveExternalAudienceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SaveExternalAudienceResponseBodyData getData() {
        return this.data;
    }

    public SaveExternalAudienceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SaveExternalAudienceResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public SaveExternalAudienceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveExternalAudienceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveExternalAudienceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class SaveExternalAudienceResponseBodyData extends TeaModel {
        @NameInMap("AudienceId")
        public String audienceId;

        public static SaveExternalAudienceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SaveExternalAudienceResponseBodyData self = new SaveExternalAudienceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SaveExternalAudienceResponseBodyData setAudienceId(String audienceId) {
            this.audienceId = audienceId;
            return this;
        }
        public String getAudienceId() {
            return this.audienceId;
        }

    }

}
