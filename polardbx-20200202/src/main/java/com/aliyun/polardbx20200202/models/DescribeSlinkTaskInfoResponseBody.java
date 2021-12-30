// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSlinkTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DescribeSlinkTaskInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public String success;

    public static DescribeSlinkTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlinkTaskInfoResponseBody self = new DescribeSlinkTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlinkTaskInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeSlinkTaskInfoResponseBody setData(DescribeSlinkTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSlinkTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeSlinkTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSlinkTaskInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList extends TeaModel {
        @NameInMap("Delay")
        public Long delay;

        @NameInMap("LastError")
        public String lastError;

        @NameInMap("PhysicalDbName")
        public String physicalDbName;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("Type")
        public String type;

        public static DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList self = new DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setLastError(String lastError) {
            this.lastError = lastError;
            return this;
        }
        public String getLastError() {
            return this.lastError;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setPhysicalDbName(String physicalDbName) {
            this.physicalDbName = physicalDbName;
            return this;
        }
        public String getPhysicalDbName() {
            return this.physicalDbName;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskDetailList")
        public java.util.List<DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList> taskDetailList;

        @NameInMap("Type")
        public String type;

        public static DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList self = new DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList setTaskDetailList(java.util.List<DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList> taskDetailList) {
            this.taskDetailList = taskDetailList;
            return this;
        }
        public java.util.List<DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailListTaskDetailList> getTaskDetailList() {
            return this.taskDetailList;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo extends TeaModel {
        @NameInMap("FsmId")
        public Long fsmId;

        @NameInMap("FsmState")
        public String fsmState;

        @NameInMap("FsmStatus")
        public String fsmStatus;

        @NameInMap("ServiceDetailList")
        public java.util.List<DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList> serviceDetailList;

        public static DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo self = new DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo setFsmId(Long fsmId) {
            this.fsmId = fsmId;
            return this;
        }
        public Long getFsmId() {
            return this.fsmId;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo setFsmState(String fsmState) {
            this.fsmState = fsmState;
            return this;
        }
        public String getFsmState() {
            return this.fsmState;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo setFsmStatus(String fsmStatus) {
            this.fsmStatus = fsmStatus;
            return this;
        }
        public String getFsmStatus() {
            return this.fsmStatus;
        }

        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo setServiceDetailList(java.util.List<DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList> serviceDetailList) {
            this.serviceDetailList = serviceDetailList;
            return this;
        }
        public java.util.List<DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfoServiceDetailList> getServiceDetailList() {
            return this.serviceDetailList;
        }

    }

    public static class DescribeSlinkTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("DataImportTaskDetailInfo")
        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo dataImportTaskDetailInfo;

        public static DescribeSlinkTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlinkTaskInfoResponseBodyData self = new DescribeSlinkTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSlinkTaskInfoResponseBodyData setDataImportTaskDetailInfo(DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo dataImportTaskDetailInfo) {
            this.dataImportTaskDetailInfo = dataImportTaskDetailInfo;
            return this;
        }
        public DescribeSlinkTaskInfoResponseBodyDataDataImportTaskDetailInfo getDataImportTaskDetailInfo() {
            return this.dataImportTaskDetailInfo;
        }

    }

}
