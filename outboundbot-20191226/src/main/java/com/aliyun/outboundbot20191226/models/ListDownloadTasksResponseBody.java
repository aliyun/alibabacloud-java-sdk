// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListDownloadTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("DownloadTasks")
    public ListDownloadTasksResponseBodyDownloadTasks downloadTasks;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>904CFA7B-8AD9-50FF-9B3E-404B20B9EE31</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDownloadTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDownloadTasksResponseBody self = new ListDownloadTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDownloadTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDownloadTasksResponseBody setDownloadTasks(ListDownloadTasksResponseBodyDownloadTasks downloadTasks) {
        this.downloadTasks = downloadTasks;
        return this;
    }
    public ListDownloadTasksResponseBodyDownloadTasks getDownloadTasks() {
        return this.downloadTasks;
    }

    public ListDownloadTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDownloadTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDownloadTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDownloadTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UPLOADED/RECORDING/d5c651b3-3c0f-44b8-aafd-40526f2fb43d/dd33377f-abad-471b-84dd-04aed572ce60_2.wav</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>Empty</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        public static ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles build(java.util.Map<String, ?> map) throws Exception {
            ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles self = new ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles();
            return TeaModel.build(map, self);
        }

        public ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListDownloadTasksResponseBodyDownloadTasksList extends TeaModel {
        @NameInMap("DownloadTaskFiles")
        public java.util.List<ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles> downloadTaskFiles;

        /**
         * <strong>example:</strong>
         * <p>1646792941</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>Empty</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>6b0e547e-501c-480a-812f-d27e28e74f9a</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Title")
        public String title;

        public static ListDownloadTasksResponseBodyDownloadTasksList build(java.util.Map<String, ?> map) throws Exception {
            ListDownloadTasksResponseBodyDownloadTasksList self = new ListDownloadTasksResponseBodyDownloadTasksList();
            return TeaModel.build(map, self);
        }

        public ListDownloadTasksResponseBodyDownloadTasksList setDownloadTaskFiles(java.util.List<ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles> downloadTaskFiles) {
            this.downloadTaskFiles = downloadTaskFiles;
            return this;
        }
        public java.util.List<ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles> getDownloadTaskFiles() {
            return this.downloadTaskFiles;
        }

        public ListDownloadTasksResponseBodyDownloadTasksList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListDownloadTasksResponseBodyDownloadTasksList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDownloadTasksResponseBodyDownloadTasksList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListDownloadTasksResponseBodyDownloadTasksList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListDownloadTasksResponseBodyDownloadTasks extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListDownloadTasksResponseBodyDownloadTasksList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDownloadTasksResponseBodyDownloadTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDownloadTasksResponseBodyDownloadTasks self = new ListDownloadTasksResponseBodyDownloadTasks();
            return TeaModel.build(map, self);
        }

        public ListDownloadTasksResponseBodyDownloadTasks setList(java.util.List<ListDownloadTasksResponseBodyDownloadTasksList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDownloadTasksResponseBodyDownloadTasksList> getList() {
            return this.list;
        }

        public ListDownloadTasksResponseBodyDownloadTasks setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDownloadTasksResponseBodyDownloadTasks setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDownloadTasksResponseBodyDownloadTasks setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
