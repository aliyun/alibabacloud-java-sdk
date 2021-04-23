// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ListBatchTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListBatchTaskResponseData data;

    public static ListBatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTaskResponse self = new ListBatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListBatchTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBatchTaskResponse setData(ListBatchTaskResponseData data) {
        this.data = data;
        return this;
    }
    public ListBatchTaskResponseData getData() {
        return this.data;
    }

    public static class ListBatchTaskResponseDataList extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("TaskType")
        @Validation(required = true)
        public Integer taskType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("BucketName")
        @Validation(required = true)
        public String bucketName;

        @NameInMap("DataPath")
        @Validation(required = true)
        public String dataPath;

        @NameInMap("MetaFile")
        @Validation(required = true)
        public String metaFile;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("ProcessMessage")
        @Validation(required = true)
        public String processMessage;

        @NameInMap("SubTaskDetail")
        @Validation(required = true)
        public String subTaskDetail;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        public static ListBatchTaskResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTaskResponseDataList self = new ListBatchTaskResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListBatchTaskResponseDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListBatchTaskResponseDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListBatchTaskResponseDataList setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public ListBatchTaskResponseDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBatchTaskResponseDataList setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListBatchTaskResponseDataList setDataPath(String dataPath) {
            this.dataPath = dataPath;
            return this;
        }
        public String getDataPath() {
            return this.dataPath;
        }

        public ListBatchTaskResponseDataList setMetaFile(String metaFile) {
            this.metaFile = metaFile;
            return this;
        }
        public String getMetaFile() {
            return this.metaFile;
        }

        public ListBatchTaskResponseDataList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListBatchTaskResponseDataList setProcessMessage(String processMessage) {
            this.processMessage = processMessage;
            return this;
        }
        public String getProcessMessage() {
            return this.processMessage;
        }

        public ListBatchTaskResponseDataList setSubTaskDetail(String subTaskDetail) {
            this.subTaskDetail = subTaskDetail;
            return this;
        }
        public String getSubTaskDetail() {
            return this.subTaskDetail;
        }

        public ListBatchTaskResponseDataList setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class ListBatchTaskResponseData extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Long pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<ListBatchTaskResponseDataList> list;

        public static ListBatchTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTaskResponseData self = new ListBatchTaskResponseData();
            return TeaModel.build(map, self);
        }

        public ListBatchTaskResponseData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListBatchTaskResponseData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListBatchTaskResponseData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListBatchTaskResponseData setList(java.util.List<ListBatchTaskResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListBatchTaskResponseDataList> getList() {
            return this.list;
        }

    }

}
