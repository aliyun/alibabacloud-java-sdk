// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class BatchContentSyncDetectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchContentSyncDetectResponseBodyData data;

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

    public static BatchContentSyncDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchContentSyncDetectResponseBody self = new BatchContentSyncDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchContentSyncDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchContentSyncDetectResponseBody setData(BatchContentSyncDetectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchContentSyncDetectResponseBodyData getData() {
        return this.data;
    }

    public BatchContentSyncDetectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchContentSyncDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchContentSyncDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchContentSyncDetectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchContentSyncDetectResponseBodyDataDetectResultList extends TeaModel {
        @NameInMap("RiskInfo")
        public String riskInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskResult")
        public Integer riskResult;

        public static BatchContentSyncDetectResponseBodyDataDetectResultList build(java.util.Map<String, ?> map) throws Exception {
            BatchContentSyncDetectResponseBodyDataDetectResultList self = new BatchContentSyncDetectResponseBodyDataDetectResultList();
            return TeaModel.build(map, self);
        }

        public BatchContentSyncDetectResponseBodyDataDetectResultList setRiskInfo(String riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }
        public String getRiskInfo() {
            return this.riskInfo;
        }

        public BatchContentSyncDetectResponseBodyDataDetectResultList setRiskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }
        public Integer getRiskResult() {
            return this.riskResult;
        }

    }

    public static class BatchContentSyncDetectResponseBodyData extends TeaModel {
        @NameInMap("DetectResultList")
        public java.util.List<BatchContentSyncDetectResponseBodyDataDetectResultList> detectResultList;

        public static BatchContentSyncDetectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchContentSyncDetectResponseBodyData self = new BatchContentSyncDetectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchContentSyncDetectResponseBodyData setDetectResultList(java.util.List<BatchContentSyncDetectResponseBodyDataDetectResultList> detectResultList) {
            this.detectResultList = detectResultList;
            return this;
        }
        public java.util.List<BatchContentSyncDetectResponseBodyDataDetectResultList> getDetectResultList() {
            return this.detectResultList;
        }

    }

}
