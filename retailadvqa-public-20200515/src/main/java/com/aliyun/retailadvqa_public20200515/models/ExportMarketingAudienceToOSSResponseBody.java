// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ExportMarketingAudienceToOSSResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static ExportMarketingAudienceToOSSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportMarketingAudienceToOSSResponseBody self = new ExportMarketingAudienceToOSSResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportMarketingAudienceToOSSResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ExportMarketingAudienceToOSSResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ExportMarketingAudienceToOSSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportMarketingAudienceToOSSResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExportMarketingAudienceToOSSResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
