// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDataImportTaskInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DescribeDataImportTaskInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-****-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeDataImportTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataImportTaskInfoResponseBody self = new DescribeDataImportTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataImportTaskInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeDataImportTaskInfoResponseBody setData(DescribeDataImportTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataImportTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataImportTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDataImportTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataImportTaskInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>58329</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("LastError")
        public String lastError;

        /**
         * <strong>example:</strong>
         * <p>drds_test</p>
         */
        @NameInMap("PhysicalDbName")
        public String physicalDbName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Progress")
        public Long progress;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;applyCount&quot;: 0,
         *   &quot;cpuUseRatio&quot;: 41,
         *   &quot;fsmId&quot;: 1,
         *   &quot;fullGcCount&quot;: 
         * }</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>fc3b1568-ad96-****-adca-dfe018b38077</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>FULL_COPY</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList self = new DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setLastError(String lastError) {
            this.lastError = lastError;
            return this;
        }
        public String getLastError() {
            return this.lastError;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setPhysicalDbName(String physicalDbName) {
            this.physicalDbName = physicalDbName;
            return this;
        }
        public String getPhysicalDbName() {
            return this.physicalDbName;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1991609</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TaskDetailList")
        public java.util.List<DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList> taskDetailList;

        /**
         * <strong>example:</strong>
         * <p>FULL_COPY</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList self = new DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList setTaskDetailList(java.util.List<DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList> taskDetailList) {
            this.taskDetailList = taskDetailList;
            return this;
        }
        public java.util.List<DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList> getTaskDetailList() {
            return this.taskDetailList;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FsmId")
        public Long fsmId;

        /**
         * <strong>example:</strong>
         * <p>RECON_FINISHED_CATCH_UP</p>
         */
        @NameInMap("FsmState")
        public String fsmState;

        /**
         * <strong>example:</strong>
         * <p>IMPORT_NOT_BEGIN</p>
         */
        @NameInMap("FsmStatus")
        public String fsmStatus;

        @NameInMap("ServiceDetailList")
        public java.util.List<DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList> serviceDetailList;

        public static DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo self = new DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo setFsmId(Long fsmId) {
            this.fsmId = fsmId;
            return this;
        }
        public Long getFsmId() {
            return this.fsmId;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo setFsmState(String fsmState) {
            this.fsmState = fsmState;
            return this;
        }
        public String getFsmState() {
            return this.fsmState;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo setFsmStatus(String fsmStatus) {
            this.fsmStatus = fsmStatus;
            return this;
        }
        public String getFsmStatus() {
            return this.fsmStatus;
        }

        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo setServiceDetailList(java.util.List<DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList> serviceDetailList) {
            this.serviceDetailList = serviceDetailList;
            return this;
        }
        public java.util.List<DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList> getServiceDetailList() {
            return this.serviceDetailList;
        }

    }

    public static class DescribeDataImportTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("DataImportTaskDetailInfo")
        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo dataImportTaskDetailInfo;

        public static DescribeDataImportTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTaskInfoResponseBodyData self = new DescribeDataImportTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTaskInfoResponseBodyData setDataImportTaskDetailInfo(DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo dataImportTaskDetailInfo) {
            this.dataImportTaskDetailInfo = dataImportTaskDetailInfo;
            return this;
        }
        public DescribeDataImportTaskInfoResponseBodyDataDataImportTaskDetailInfo getDataImportTaskDetailInfo() {
            return this.dataImportTaskDetailInfo;
        }

    }

}
