// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsDebugSampleLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SamplingLogs")
    public java.util.List<GetPtsDebugSampleLogsResponseBodySamplingLogs> samplingLogs;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetPtsDebugSampleLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPtsDebugSampleLogsResponseBody self = new GetPtsDebugSampleLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPtsDebugSampleLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPtsDebugSampleLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPtsDebugSampleLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetPtsDebugSampleLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPtsDebugSampleLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPtsDebugSampleLogsResponseBody setSamplingLogs(java.util.List<GetPtsDebugSampleLogsResponseBodySamplingLogs> samplingLogs) {
        this.samplingLogs = samplingLogs;
        return this;
    }
    public java.util.List<GetPtsDebugSampleLogsResponseBodySamplingLogs> getSamplingLogs() {
        return this.samplingLogs;
    }

    public GetPtsDebugSampleLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPtsDebugSampleLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetPtsDebugSampleLogsResponseBodySamplingLogs extends TeaModel {
        @NameInMap("ChainId")
        public String chainId;

        @NameInMap("ChainName")
        public String chainName;

        @NameInMap("CheckResult")
        public String checkResult;

        @NameInMap("ExportConfig")
        public String exportConfig;

        @NameInMap("ExportContent")
        public String exportContent;

        @NameInMap("HttpRequestBody")
        public String httpRequestBody;

        @NameInMap("HttpRequestHeaders")
        public String httpRequestHeaders;

        @NameInMap("HttpRequestMethod")
        public String httpRequestMethod;

        @NameInMap("HttpRequestUrl")
        public String httpRequestUrl;

        @NameInMap("HttpResponseBody")
        public String httpResponseBody;

        @NameInMap("HttpResponseFailMsg")
        public String httpResponseFailMsg;

        @NameInMap("HttpResponseHeaders")
        public String httpResponseHeaders;

        @NameInMap("HttpResponseStatus")
        public String httpResponseStatus;

        @NameInMap("HttpStartTime")
        public Long httpStartTime;

        @NameInMap("HttpTiming")
        public String httpTiming;

        @NameInMap("ImportContent")
        public String importContent;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Rt")
        public String rt;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetPtsDebugSampleLogsResponseBodySamplingLogs build(java.util.Map<String, ?> map) throws Exception {
            GetPtsDebugSampleLogsResponseBodySamplingLogs self = new GetPtsDebugSampleLogsResponseBodySamplingLogs();
            return TeaModel.build(map, self);
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setChainId(String chainId) {
            this.chainId = chainId;
            return this;
        }
        public String getChainId() {
            return this.chainId;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setChainName(String chainName) {
            this.chainName = chainName;
            return this;
        }
        public String getChainName() {
            return this.chainName;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setExportConfig(String exportConfig) {
            this.exportConfig = exportConfig;
            return this;
        }
        public String getExportConfig() {
            return this.exportConfig;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setExportContent(String exportContent) {
            this.exportContent = exportContent;
            return this;
        }
        public String getExportContent() {
            return this.exportContent;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setHttpRequestBody(String httpRequestBody) {
            this.httpRequestBody = httpRequestBody;
            return this;
        }
        public String getHttpRequestBody() {
            return this.httpRequestBody;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setHttpRequestHeaders(String httpRequestHeaders) {
            this.httpRequestHeaders = httpRequestHeaders;
            return this;
        }
        public String getHttpRequestHeaders() {
            return this.httpRequestHeaders;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setHttpRequestMethod(String httpRequestMethod) {
            this.httpRequestMethod = httpRequestMethod;
            return this;
        }
        public String getHttpRequestMethod() {
            return this.httpRequestMethod;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setHttpRequestUrl(String httpRequestUrl) {
            this.httpRequestUrl = httpRequestUrl;
            return this;
        }
        public String getHttpRequestUrl() {
            return this.httpRequestUrl;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setHttpResponseBody(String httpResponseBody) {
            this.httpResponseBody = httpResponseBody;
            return this;
        }
        public String getHttpResponseBody() {
            return this.httpResponseBody;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setHttpResponseFailMsg(String httpResponseFailMsg) {
            this.httpResponseFailMsg = httpResponseFailMsg;
            return this;
        }
        public String getHttpResponseFailMsg() {
            return this.httpResponseFailMsg;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setHttpResponseHeaders(String httpResponseHeaders) {
            this.httpResponseHeaders = httpResponseHeaders;
            return this;
        }
        public String getHttpResponseHeaders() {
            return this.httpResponseHeaders;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setHttpResponseStatus(String httpResponseStatus) {
            this.httpResponseStatus = httpResponseStatus;
            return this;
        }
        public String getHttpResponseStatus() {
            return this.httpResponseStatus;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setHttpStartTime(Long httpStartTime) {
            this.httpStartTime = httpStartTime;
            return this;
        }
        public Long getHttpStartTime() {
            return this.httpStartTime;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setHttpTiming(String httpTiming) {
            this.httpTiming = httpTiming;
            return this;
        }
        public String getHttpTiming() {
            return this.httpTiming;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setImportContent(String importContent) {
            this.importContent = importContent;
            return this;
        }
        public String getImportContent() {
            return this.importContent;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setRt(String rt) {
            this.rt = rt;
            return this;
        }
        public String getRt() {
            return this.rt;
        }

        public GetPtsDebugSampleLogsResponseBodySamplingLogs setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
