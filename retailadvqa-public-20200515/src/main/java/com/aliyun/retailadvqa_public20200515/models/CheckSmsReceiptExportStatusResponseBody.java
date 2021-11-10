// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckSmsReceiptExportStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckSmsReceiptExportStatusResponseBodyData data;

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

    public static CheckSmsReceiptExportStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsReceiptExportStatusResponseBody self = new CheckSmsReceiptExportStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSmsReceiptExportStatusResponseBody setData(CheckSmsReceiptExportStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckSmsReceiptExportStatusResponseBodyData getData() {
        return this.data;
    }

    public CheckSmsReceiptExportStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckSmsReceiptExportStatusResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public CheckSmsReceiptExportStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSmsReceiptExportStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckSmsReceiptExportStatusResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CheckSmsReceiptExportStatusResponseBodyData extends TeaModel {
        @NameInMap("ExportStatus")
        public String exportStatus;

        @NameInMap("OssFilePath")
        public String ossFilePath;

        public static CheckSmsReceiptExportStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckSmsReceiptExportStatusResponseBodyData self = new CheckSmsReceiptExportStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckSmsReceiptExportStatusResponseBodyData setExportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }
        public String getExportStatus() {
            return this.exportStatus;
        }

        public CheckSmsReceiptExportStatusResponseBodyData setOssFilePath(String ossFilePath) {
            this.ossFilePath = ossFilePath;
            return this;
        }
        public String getOssFilePath() {
            return this.ossFilePath;
        }

    }

}
