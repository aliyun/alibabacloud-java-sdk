// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsDebugSampleLogsResponseBody extends TeaModel {
    /**
     * <p>The system status code. If the operation is successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4001</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message. If the operation is successful, this parameter is not returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sampling logs.</p>
     */
    @NameInMap("SamplingLogs")
    public java.util.List<GetPtsDebugSampleLogsResponseBodySamplingLogs> samplingLogs;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>65354719</p>
         */
        @NameInMap("ChainId")
        public String chainId;

        /**
         * <p>The name of the session.</p>
         */
        @NameInMap("ChainName")
        public String chainName;

        /**
         * <p>The assertion check result.</p>
         */
        @NameInMap("CheckResult")
        public String checkResult;

        /**
         * <p>The parameter export configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;skuId\&quot;:\&quot;{R:json@$.page.list[0].skuId}\&quot;}</p>
         */
        @NameInMap("ExportConfig")
        public String exportConfig;

        /**
         * <p>The exported parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;skuId&quot;:&quot;1&quot;}</p>
         */
        @NameInMap("ExportContent")
        public String exportContent;

        /**
         * <p>The body of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;loginacct&quot;:&quot;acce&quot;}</p>
         */
        @NameInMap("HttpRequestBody")
        public String httpRequestBody;

        /**
         * <p>The request headers.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;v2&quot;,&quot;sensitive&quot;:false,&quot;value&quot;:&quot;1&quot;},{&quot;name&quot;:&quot;x-pts-test&quot;,&quot;sensitive&quot;:false,&quot;value&quot;:&quot;2&quot;}]</p>
         */
        @NameInMap("HttpRequestHeaders")
        public String httpRequestHeaders;

        /**
         * <p>The request method.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("HttpRequestMethod")
        public String httpRequestMethod;

        /**
         * <p>The endpoint that specifies where the request is directed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
        @NameInMap("HttpRequestUrl")
        public String httpRequestUrl;

        /**
         * <p>The response body.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;timestamp&quot;:1679903049155,&quot;status&quot;:404,&quot;error&quot;:&quot;Not Found&quot;,&quot;message&quot;:&quot;No message available&quot;,&quot;path&quot;:&quot;/&quot;}</p>
         */
        @NameInMap("HttpResponseBody")
        public String httpResponseBody;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("HttpResponseFailMsg")
        public String httpResponseFailMsg;

        /**
         * <p>The response headers.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;valuePos&quot;:18,&quot;name&quot;:&quot;transfer-encoding&quot;,&quot;buffer&quot;:{&quot;empty&quot;:false,&quot;full&quot;:false},&quot;sensitive&quot;:false,&quot;value&quot;:&quot;chunked&quot;},{&quot;valuePos&quot;:13,&quot;name&quot;:&quot;Content-Type&quot;,&quot;buffer&quot;:{&quot;empty&quot;:false,&quot;full&quot;:false},&quot;sensitive&quot;:false,&quot;value&quot;:&quot;application/json;charset=UTF-8&quot;},{&quot;valuePos&quot;:5,&quot;name&quot;:&quot;Date&quot;,&quot;buffer&quot;:{&quot;empty&quot;:false,&quot;full&quot;:false},&quot;sensitive&quot;:false,&quot;value&quot;:&quot;Mon, 27 Mar 2023 07:44:08 GMT&quot;}]</p>
         */
        @NameInMap("HttpResponseHeaders")
        public String httpResponseHeaders;

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HttpResponseStatus")
        public String httpResponseStatus;

        /**
         * <p>The time when the request was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("HttpStartTime")
        public Long httpStartTime;

        /**
         * <p>The HTTP timing information in a waterfall format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;traceId&quot;:&quot;0:1:10a94f66pts-2069351-allsparktask&quot;,&quot;requests&quot;:[{&quot;lease&quot;:{&quot;conn&quot;:{&quot;duration&quot;:-1,&quot;finish&quot;:-1,&quot;operation&quot;:&quot;conn&quot;,&quot;start&quot;:-1},&quot;dns&quot;:{&quot;duration&quot;:-1,&quot;finish&quot;:-1,&quot;operation&quot;:&quot;dns&quot;,&quot;start&quot;:-1},&quot;duration&quot;:-1,&quot;finish&quot;:-1,&quot;operation&quot;:&quot;lease&quot;,&quot;start&quot;:32277914755},&quot;recv&quot;:{&quot;duration&quot;:225975,&quot;finish&quot;:32283700284,&quot;message&quot;:&quot;&quot;,&quot;operation&quot;:&quot;recv&quot;,&quot;start&quot;:32283474309},&quot;sent&quot;:{&quot;duration&quot;:594179,&quot;finish&quot;:32278776504,&quot;message&quot;:&quot;&quot;,&quot;operation&quot;:&quot;sent&quot;,&quot;start&quot;:32278182325},&quot;tag&quot;:&quot;GET <a href="http://tomcodemall.com:30080/api/product/skuinfo/list?key=2&vv=4&t4=%EF%BB%BF101%22%7D%5D,%22message%22:%22%22%7D">http://tomcodemall.com:30080/api/product/skuinfo/list?key=2&amp;vv=4&amp;t4=%EF%BB%BF101&quot;}],&quot;message&quot;:&quot;&quot;}</a></p>
         */
        @NameInMap("HttpTiming")
        public String httpTiming;

        /**
         * <p>The imported parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ImportContent")
        public String importContent;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1345531</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The response time. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>230</p>
         */
        @NameInMap("Rt")
        public String rt;

        /**
         * <p>The timestamp. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1650253024471</p>
         */
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
