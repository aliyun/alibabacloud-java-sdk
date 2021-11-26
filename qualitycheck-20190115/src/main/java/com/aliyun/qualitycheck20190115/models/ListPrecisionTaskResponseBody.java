// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListPrecisionTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public ListPrecisionTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPrecisionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrecisionTaskResponseBody self = new ListPrecisionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrecisionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPrecisionTaskResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListPrecisionTaskResponseBody setData(ListPrecisionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPrecisionTaskResponseBodyData getData() {
        return this.data;
    }

    public ListPrecisionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrecisionTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPrecisionTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPrecisionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrecisionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModelId")
        public Long modelId;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("Precision")
        public Float precision;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        public static ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision build(java.util.Map<String, ?> map) throws Exception {
            ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision self = new ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision();
            return TeaModel.build(map, self);
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision setPrecision(Float precision) {
            this.precision = precision;
            return this;
        }
        public Float getPrecision() {
            return this.precision;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisions extends TeaModel {
        @NameInMap("Precision")
        public java.util.List<ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision> precision;

        public static ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisions build(java.util.Map<String, ?> map) throws Exception {
            ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisions self = new ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisions();
            return TeaModel.build(map, self);
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisions setPrecision(java.util.List<ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision> precision) {
            this.precision = precision;
            return this;
        }
        public java.util.List<ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisionsPrecision> getPrecision() {
            return this.precision;
        }

    }

    public static class ListPrecisionTaskResponseBodyDataPrecisionTask extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataSetId")
        public Long dataSetId;

        @NameInMap("DataSetName")
        public String dataSetName;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("IncorrectWords")
        public Integer incorrectWords;

        @NameInMap("Name")
        public String name;

        @NameInMap("Precisions")
        public ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisions precisions;

        @NameInMap("Source")
        public Integer source;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("VerifiedCount")
        public Integer verifiedCount;

        public static ListPrecisionTaskResponseBodyDataPrecisionTask build(java.util.Map<String, ?> map) throws Exception {
            ListPrecisionTaskResponseBodyDataPrecisionTask self = new ListPrecisionTaskResponseBodyDataPrecisionTask();
            return TeaModel.build(map, self);
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setIncorrectWords(Integer incorrectWords) {
            this.incorrectWords = incorrectWords;
            return this;
        }
        public Integer getIncorrectWords() {
            return this.incorrectWords;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setPrecisions(ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisions precisions) {
            this.precisions = precisions;
            return this;
        }
        public ListPrecisionTaskResponseBodyDataPrecisionTaskPrecisions getPrecisions() {
            return this.precisions;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListPrecisionTaskResponseBodyDataPrecisionTask setVerifiedCount(Integer verifiedCount) {
            this.verifiedCount = verifiedCount;
            return this;
        }
        public Integer getVerifiedCount() {
            return this.verifiedCount;
        }

    }

    public static class ListPrecisionTaskResponseBodyData extends TeaModel {
        @NameInMap("PrecisionTask")
        public java.util.List<ListPrecisionTaskResponseBodyDataPrecisionTask> precisionTask;

        public static ListPrecisionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrecisionTaskResponseBodyData self = new ListPrecisionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrecisionTaskResponseBodyData setPrecisionTask(java.util.List<ListPrecisionTaskResponseBodyDataPrecisionTask> precisionTask) {
            this.precisionTask = precisionTask;
            return this;
        }
        public java.util.List<ListPrecisionTaskResponseBodyDataPrecisionTask> getPrecisionTask() {
            return this.precisionTask;
        }

    }

}
