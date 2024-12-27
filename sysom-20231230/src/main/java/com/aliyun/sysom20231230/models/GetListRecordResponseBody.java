// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetListRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetListRecordResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("total")
    public Long total;

    public static GetListRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListRecordResponseBody self = new GetListRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetListRecordResponseBody setData(java.util.List<GetListRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetListRecordResponseBodyData> getData() {
        return this.data;
    }

    public GetListRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetListRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListRecordResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetListRecordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16896fa8-37f6-4c70-bb32-67fa9817d426</p>
         */
        @NameInMap("analysisId")
        public String analysisId;

        /**
         * <strong>example:</strong>
         * <p>2024-12-24 12:02:05</p>
         */
        @NameInMap("analysisTime")
        public String analysisTime;

        /**
         * <strong>example:</strong>
         * <p>timeout=2000 ms</p>
         */
        @NameInMap("arguments")
        public String arguments;

        @NameInMap("failedLog")
        public String failedLog;

        @NameInMap("status")
        public String status;

        public static GetListRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetListRecordResponseBodyData self = new GetListRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetListRecordResponseBodyData setAnalysisId(String analysisId) {
            this.analysisId = analysisId;
            return this;
        }
        public String getAnalysisId() {
            return this.analysisId;
        }

        public GetListRecordResponseBodyData setAnalysisTime(String analysisTime) {
            this.analysisTime = analysisTime;
            return this;
        }
        public String getAnalysisTime() {
            return this.analysisTime;
        }

        public GetListRecordResponseBodyData setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public GetListRecordResponseBodyData setFailedLog(String failedLog) {
            this.failedLog = failedLog;
            return this;
        }
        public String getFailedLog() {
            return this.failedLog;
        }

        public GetListRecordResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
