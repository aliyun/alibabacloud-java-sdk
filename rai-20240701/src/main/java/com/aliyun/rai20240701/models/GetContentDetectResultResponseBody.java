// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetContentDetectResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetContentDetectResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetContentDetectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContentDetectResultResponseBody self = new GetContentDetectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContentDetectResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContentDetectResultResponseBody setData(GetContentDetectResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContentDetectResultResponseBodyData getData() {
        return this.data;
    }

    public GetContentDetectResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContentDetectResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContentDetectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContentDetectResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContentDetectResultResponseBodyDataDetectResultList extends TeaModel {
        @NameInMap("RiskInfo")
        public String riskInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetContentDetectResultResponseBodyDataDetectResultList build(java.util.Map<String, ?> map) throws Exception {
            GetContentDetectResultResponseBodyDataDetectResultList self = new GetContentDetectResultResponseBodyDataDetectResultList();
            return TeaModel.build(map, self);
        }

        public GetContentDetectResultResponseBodyDataDetectResultList setRiskInfo(String riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }
        public String getRiskInfo() {
            return this.riskInfo;
        }

        public GetContentDetectResultResponseBodyDataDetectResultList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public GetContentDetectResultResponseBodyDataDetectResultList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetContentDetectResultResponseBodyData extends TeaModel {
        @NameInMap("DetectResultList")
        public java.util.List<GetContentDetectResultResponseBodyDataDetectResultList> detectResultList;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ProcessedCount")
        public Integer processedCount;

        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetContentDetectResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContentDetectResultResponseBodyData self = new GetContentDetectResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContentDetectResultResponseBodyData setDetectResultList(java.util.List<GetContentDetectResultResponseBodyDataDetectResultList> detectResultList) {
            this.detectResultList = detectResultList;
            return this;
        }
        public java.util.List<GetContentDetectResultResponseBodyDataDetectResultList> getDetectResultList() {
            return this.detectResultList;
        }

        public GetContentDetectResultResponseBodyData setProcessedCount(Integer processedCount) {
            this.processedCount = processedCount;
            return this;
        }
        public Integer getProcessedCount() {
            return this.processedCount;
        }

        public GetContentDetectResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetContentDetectResultResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public GetContentDetectResultResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
