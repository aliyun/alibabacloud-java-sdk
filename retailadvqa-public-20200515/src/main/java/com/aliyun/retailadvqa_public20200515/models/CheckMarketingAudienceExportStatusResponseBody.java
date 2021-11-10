// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckMarketingAudienceExportStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckMarketingAudienceExportStatusResponseBodyData data;

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

    public static CheckMarketingAudienceExportStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMarketingAudienceExportStatusResponseBody self = new CheckMarketingAudienceExportStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMarketingAudienceExportStatusResponseBody setData(CheckMarketingAudienceExportStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckMarketingAudienceExportStatusResponseBodyData getData() {
        return this.data;
    }

    public CheckMarketingAudienceExportStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckMarketingAudienceExportStatusResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public CheckMarketingAudienceExportStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckMarketingAudienceExportStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckMarketingAudienceExportStatusResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CheckMarketingAudienceExportStatusResponseBodyData extends TeaModel {
        @NameInMap("ExportStatus")
        public String exportStatus;

        @NameInMap("OssFilePath")
        public String ossFilePath;

        public static CheckMarketingAudienceExportStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckMarketingAudienceExportStatusResponseBodyData self = new CheckMarketingAudienceExportStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckMarketingAudienceExportStatusResponseBodyData setExportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }
        public String getExportStatus() {
            return this.exportStatus;
        }

        public CheckMarketingAudienceExportStatusResponseBodyData setOssFilePath(String ossFilePath) {
            this.ossFilePath = ossFilePath;
            return this;
        }
        public String getOssFilePath() {
            return this.ossFilePath;
        }

    }

}
