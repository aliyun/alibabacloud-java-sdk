// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeStructureImportTaskInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeStructureImportTaskInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeStructureImportTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStructureImportTaskInfoResponseBody self = new DescribeStructureImportTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStructureImportTaskInfoResponseBody setData(DescribeStructureImportTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeStructureImportTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeStructureImportTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStructureImportTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStructureImportTaskInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>java.sql.SQLException: [1a7a5f22aa403000][10.239.190.4:3058][hash_realtime_new]ERR-CODE: [TDDL-5123][ERR_INSTANCE_READ_ONLY_OPTION_NOT_SUPPORT] server is running with the instance-read-only option so it cannot execute this statement</p>
         */
        @NameInMap("ExceptionDetail")
        public String exceptionDetail;

        /**
         * <strong>example:</strong>
         * <p>hash_realtime_new.wm_in_job_et</p>
         */
        @NameInMap("ExceptionFullTableName")
        public String exceptionFullTableName;

        /**
         * <strong>example:</strong>
         * <p>118</p>
         */
        @NameInMap("FinishedNum")
        public Integer finishedNum;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult self = new DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult();
            return TeaModel.build(map, self);
        }

        public DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult setExceptionDetail(String exceptionDetail) {
            this.exceptionDetail = exceptionDetail;
            return this;
        }
        public String getExceptionDetail() {
            return this.exceptionDetail;
        }

        public DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult setExceptionFullTableName(String exceptionFullTableName) {
            this.exceptionFullTableName = exceptionFullTableName;
            return this;
        }
        public String getExceptionFullTableName() {
            return this.exceptionFullTableName;
        }

        public DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult setFinishedNum(Integer finishedNum) {
            this.finishedNum = finishedNum;
            return this;
        }
        public Integer getFinishedNum() {
            return this.finishedNum;
        }

        public DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

    public static class DescribeStructureImportTaskInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>STRUCTURE_IMPORT</p>
         */
        @NameInMap("SlinkStage")
        public String slinkStage;

        @NameInMap("StructureImportResult")
        public DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult structureImportResult;

        public static DescribeStructureImportTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeStructureImportTaskInfoResponseBodyData self = new DescribeStructureImportTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeStructureImportTaskInfoResponseBodyData setSlinkStage(String slinkStage) {
            this.slinkStage = slinkStage;
            return this;
        }
        public String getSlinkStage() {
            return this.slinkStage;
        }

        public DescribeStructureImportTaskInfoResponseBodyData setStructureImportResult(DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult structureImportResult) {
            this.structureImportResult = structureImportResult;
            return this;
        }
        public DescribeStructureImportTaskInfoResponseBodyDataStructureImportResult getStructureImportResult() {
            return this.structureImportResult;
        }

    }

}
